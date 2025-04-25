package rocks.zipcode.Tapr.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import rocks.zipcode.Tapr.Devices.Device;
import rocks.zipcode.Tapr.Devices.DeviceRepository;


@RestController
@RequestMapping
public class DeviceController {

    @Autowired
    private DeviceRepository deviceRepository;

    @GetMapping("/Device/{id}")
    public ResponseEntity<Device> getDeviceByID(@PathVariable int id){
        Device device = deviceRepository.findById(id).orElse(null);
        return new ResponseEntity<>(device, HttpStatus.CREATED);
    }

    @GetMapping("/Device")
    public ResponseEntity <Iterable <Device>> getAllDevices(){
        return new ResponseEntity<>(deviceRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/addDevice")
    public ResponseEntity<Device> createDevice(@RequestBody Device d){
        return new ResponseEntity<>(deviceRepository.save(d), HttpStatus.CREATED);
    }

    @PutMapping("/put/device/{id}")
    public ResponseEntity<Device> updateDevice(@RequestBody Device d, @PathVariable int id){
        Device device = deviceRepository.findById(id).orElse(null);
        device.setBrandName(d.getBrandName());
        device.setModelName(d.getModelName());
        device.setModelNumber(d.getModelNumber());
        device.setColor(d.getColor());
        device.setCategoryName(d.getCategoryName());
        device.setUPC(d.getUPC());
        device.setYearManufactured(d.getYearManufactured());
        return new ResponseEntity<>(deviceRepository.save(device), HttpStatus.OK);
    }

    @DeleteMapping("/deleteDevice/{id}")
    public ResponseEntity<Device> deleteDevice(@PathVariable int id){
        Device device = deviceRepository.findById(id).orElse(null);
        if (device != null) {
            deviceRepository.delete(device);
        }
        return new ResponseEntity<>(device, HttpStatus.OK);
    }
}
