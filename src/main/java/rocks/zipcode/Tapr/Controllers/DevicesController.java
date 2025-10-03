package rocks.zipcode.Tapr.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import rocks.zipcode.Tapr.domain.Devices;
import rocks.zipcode.Tapr.repository.DevicesRepository;

@RestController
@RequestMapping
public class DevicesController {

    @Autowired
    private DevicesRepository devicesRepository;

    @GetMapping("/devices/{id}")
    public ResponseEntity<Devices> getDevicesByID(@PathVariable int id){
        Devices devices = devicesRepository.findById(id).orElse(null);
        return new ResponseEntity<>(devices, HttpStatus.CREATED);
    }

    @GetMapping("/allDevices")
    public ResponseEntity <Iterable <Devices>> getAllDevices(){
        return new ResponseEntity<>(devicesRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/addDevices")
    public ResponseEntity<Devices> createDevices(@RequestBody Devices d){
        return new ResponseEntity<>(devicesRepository.save(d), HttpStatus.CREATED);
    }

    @PutMapping("/put/devices/{id}")
    public ResponseEntity<Devices> updateDevices(@RequestBody Devices d, @PathVariable int id){
        Devices devices = devicesRepository.findById(id).orElse(null);
        if (devices == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        BeanUtils.copyProperties(d, devices);
        return new ResponseEntity<>(devicesRepository.save(devices), HttpStatus.OK);
    }

    @DeleteMapping("/deleteDevices/{id}")
    public ResponseEntity<Devices> deleteDevices(@PathVariable int id){
        Devices devices = devicesRepository.findById(id).orElse(null);
        if (devices != null) {
            devicesRepository.delete(devices);
        }
        return new ResponseEntity<>(devices, HttpStatus.OK);
    }
}

/*  Suggested Enhancements (For Later)
- Null Safety Check in updateDevices()
Before calling setXXX() methods, confirm the device was found:

if (devices == null) return new ResponseEntity<>(HttpStatus.NOT_FOUND);

- Refactor PUT Logic
Consider using BeanUtils to copy properties or implementing a service layer for cleanliness

- Consistent HTTP Status Codes
For /devices/{id} retrieval, 200 OK might be more conventional than 201 CREATED
* */
