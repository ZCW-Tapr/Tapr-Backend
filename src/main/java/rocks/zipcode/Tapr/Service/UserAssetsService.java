package rocks.zipcode.Tapr.Service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rocks.zipcode.Tapr.User_Assets.User_Assets;
import rocks.zipcode.Tapr.User_Assets.User_AssetsRepository;

@Service
public class UserAssetsService {

    @Autowired
    private User_AssetsRepository assetsRepo;

    public User_Assets updateAsset(int id, User_Assets newData){
        User_Assets existingAsset = assetsRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Device not found"));
        BeanUtils.copyProperties(newData, existingAsset);
        return assetsRepo.save(existingAsset);
    }

    public User_Assets saveAsset(User_Assets a) {
        // Ensure referenced user/device exist if needed
        return assetsRepo.save(a);
    }
}
