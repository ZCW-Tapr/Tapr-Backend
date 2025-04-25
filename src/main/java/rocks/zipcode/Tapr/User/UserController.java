package rocks.zipcode.Tapr.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping
public class UserController {

    @Autowired
    private UserRepository userRepository;
//    private List<User> userList = new ArrayList<>();
    // private AtomicInteger idCounter = new AtomicInteger();


    @GetMapping("/getUser/{id}")
    public ResponseEntity<User> getUser(@PathVariable int id){
        User user = userRepository.findById(id).orElse(null);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @GetMapping("/getUser")
    public ResponseEntity <Iterable <User>> getAllUsers(){
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<User> createUser(@RequestBody User u){
        return new ResponseEntity<>(userRepository.save(u), HttpStatus.CREATED);
    }

    @PutMapping("/put/user/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User u, @PathVariable int id){
        User user = userRepository.findById(id).orElse(null);
        user.setUserName(u.getUserName());
        user.setFirstName(u.getFirstName());
        user.setLastName(u.getLastName());
        user.setEmail(u.getEmail());
        user.setPassword(u.getPassword());
        user.setPhoneNumber(u.getPhoneNumber());
        return new ResponseEntity<>(userRepository.save(user), HttpStatus.OK);
    }

    @DeleteMapping("/deleteUser/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable int id){
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            userRepository.delete(user);
        }
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
