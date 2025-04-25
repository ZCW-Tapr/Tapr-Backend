package rocks.zipcode.Tapr.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import rocks.zipcode.Tapr.User_Assets.User_Assets;
import rocks.zipcode.Tapr.User_Assets.User_AssetsRepository;

@RestController
@RequestMapping
public class User_AssetsController {

    @Autowired
    private User_AssetsRepository user_AssetsRepository;
//    private List<User> userList = new ArrayList<>();
    // private AtomicInteger idCounter = new AtomicInteger();


    @GetMapping("/assets/{id}")
    public ResponseEntity<User_Assets> getUserAssetByID(@PathVariable int id){
        User_Assets userAssets = user_AssetsRepository.findById(id).orElse(null);
        return new ResponseEntity<>(userAssets, HttpStatus.CREATED);
    }

    @GetMapping("/assets")
    public ResponseEntity <Iterable <User_Assets>> getAllUserAssets(){
        return new ResponseEntity<>(user_AssetsRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/addAssets")
    public ResponseEntity<User_Assets> createAsset(@RequestBody User_Assets a){
        return new ResponseEntity<>(user_AssetsRepository.save(a), HttpStatus.CREATED);
    }

    @PutMapping("/put/userAssets/{id}")
    public ResponseEntity<User_Assets> updateAsset(@RequestBody User_Assets a, @PathVariable int id){
        User_Assets userAssets = user_AssetsRepository.findById(id).orElse(null);
        userAssets.setDeviceID(a.getDeviceID());
        userAssets.setDateOfService(a.getDateOfService());
        userAssets.setLocationName(a.getLocationName());
        userAssets.setSerialNumber(a.getSerialNumber());
        return new ResponseEntity<>(user_AssetsRepository.save(userAssets), HttpStatus.OK);
    }

    @DeleteMapping("/deleteAssets/{id}")
    public ResponseEntity<User_Assets> deleteAsset(@PathVariable int id){
        User_Assets user_assets = user_AssetsRepository.findById(id).orElse(null);
        if (user_assets != null) {
            user_AssetsRepository.delete(user_assets);
        }
        return new ResponseEntity<>(user_assets, HttpStatus.OK);
    }
}

