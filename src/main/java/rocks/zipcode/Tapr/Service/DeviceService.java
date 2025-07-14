package rocks.zipcode.Tapr.Service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rocks.zipcode.Tapr.Devices.Devices;
import rocks.zipcode.Tapr.Devices.DevicesRepository;

// Service
@Service
public class DeviceService {
    @Autowired
    private DevicesRepository devicesRepository;

    public Devices updateDevice(int id, Devices newData) {
        Devices existingDevice = devicesRepository.findById(id).orElseThrow(() -> new RuntimeException("Device not found"));
        BeanUtils.copyProperties(newData, existingDevice);
        return devicesRepository.save(existingDevice);
    }
}
