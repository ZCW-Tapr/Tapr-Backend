package rocks.zipcode.Tapr.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import rocks.zipcode.Tapr.services.UserAssetsService;
import rocks.zipcode.Tapr.domain.User_Assets;
import rocks.zipcode.Tapr.repository.User_AssetsRepository;

@RestController
@RequestMapping
public class UserAssetsController {

    @Autowired
    private User_AssetsRepository user_AssetsRepository;
    private UserAssetsService userAssetsService;
//    private List<User> userList = new ArrayList<>();
    // private AtomicInteger idCounter = new AtomicInteger();


    @GetMapping("/assets/{id}")
    public ResponseEntity<User_Assets> getUserAssetByID(@PathVariable Long id){
        User_Assets userAssets = user_AssetsRepository.findById(id).orElse(null);
        return new ResponseEntity<>(userAssets, HttpStatus.CREATED);
    }

    @GetMapping("/assets")
    public ResponseEntity <Iterable <User_Assets>> getAllUserAssets(){
        return new ResponseEntity<>(user_AssetsRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/addAssets")
    public ResponseEntity<User_Assets> createAsset(@RequestBody User_Assets userAssets){
        return new ResponseEntity<>(userAssetsService.saveAsset(userAssets), HttpStatus.CREATED);
    }

    @PutMapping("/put/userAssets/{id}")
    public ResponseEntity<User_Assets> updateAsset(@RequestBody User_Assets data, @PathVariable Long id){
        return new ResponseEntity<>(userAssetsService.updateAsset(id, data), HttpStatus.OK);
    }

    @DeleteMapping("/deleteAssets/{id}")
    public ResponseEntity<User_Assets> deleteAsset(@PathVariable Long id){
        User_Assets user_assets = user_AssetsRepository.findById(id).orElse(null);
        if (user_assets != null) {
            user_AssetsRepository.delete(user_assets);
        }
        return new ResponseEntity<>(user_assets, HttpStatus.OK);
    }
}

/* Suggestions for Hardening
1. Null Checks for Safety
Before setting attributes in updateAsset():
if (userAssets == null) {
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
}


This prevents NullPointerException if the ID isn’t found.
2. Consider Validation Annotations
As this evolves, adding @Valid to request bodies and field-level validation annotations (like @NotNull, @Size) in your model can catch issues early.
3. Refactor for Reusability
Later on, if you introduce gesture-to-action mappings as a feature, you might want to create a service layer where User_Assets can be grouped or queried based on usage patterns (e.g. common gestures, zones, or rooms).

* */