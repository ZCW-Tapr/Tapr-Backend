package rocks.zipcode.Tapr.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rocks.zipcode.Tapr.domain.Devices;
import rocks.zipcode.Tapr.repository.DevicesRepository;

// Service
@Service
public class DeviceService {
    @Autowired
    private DevicesRepository devicesRepository;

    public Devices updateDevice(Long id, Devices newData) {
        Devices existingDevice = devicesRepository.findById(id).orElseThrow(() -> new RuntimeException("Device not found"));
        BeanUtils.copyProperties(newData, existingDevice);
        return devicesRepository.save(existingDevice);
    }
}
