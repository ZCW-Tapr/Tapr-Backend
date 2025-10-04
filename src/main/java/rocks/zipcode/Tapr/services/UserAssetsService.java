package rocks.zipcode.Tapr.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rocks.zipcode.Tapr.domain.User_Assets;
import rocks.zipcode.Tapr.repository.User_AssetsRepository;

@Service
public class UserAssetsService {

    @Autowired
    private User_AssetsRepository userAssetsRepository;

    public User_Assets updateAsset(Long id, User_Assets newData){
        User_Assets existingAsset = userAssetsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Device not found"));
        BeanUtils.copyProperties(newData, existingAsset);
        return userAssetsRepository.save(existingAsset);
    }

    public User_Assets saveAsset(User_Assets a) {
        return userAssetsRepository.save(a);
    }
}
