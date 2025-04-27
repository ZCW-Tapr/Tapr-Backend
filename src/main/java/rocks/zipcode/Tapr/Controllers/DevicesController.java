package rocks.zipcode.Tapr.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import rocks.zipcode.Tapr.Devices.Devices;
import rocks.zipcode.Tapr.Devices.DevicesRepository;

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
        devices.setBrandName(d.getBrandName());
        devices.setModelName(d.getModelName());
        devices.setModelNumber(d.getModelNumber());
        devices.setColor(d.getColor());
        devices.setCategoryName(d.getCategoryName());
        devices.setID(d.getID());
        devices.setUPC(d.getUPC());
        devices.setYearManufactured(d.getYearManufactured());
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
