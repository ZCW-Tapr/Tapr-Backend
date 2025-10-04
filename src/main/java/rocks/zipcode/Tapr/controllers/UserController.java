package rocks.zipcode.Tapr.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import rocks.zipcode.Tapr.domain.User;
import rocks.zipcode.Tapr.repository.UserRepository;

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

    @PostMapping("/addUser")
    public ResponseEntity<User> createUser(@RequestBody User u){
        return new ResponseEntity<>(userRepository.save(u), HttpStatus.CREATED);
    }

    @PutMapping("/put/user/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User u, @PathVariable int id){
        User user = userRepository.findById(id).orElse(null);
        assert user != null;
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

/*🔧 Suggestions for Refinement
- Null Safety for Updates
Consider guarding against null before calling setters in updateUser():

if (user == null) return new ResponseEntity<>(HttpStatus.NOT_FOUND);

- Status Code Semantics
A GET call returning 201 CREATED (like in /getUser/{id}) might be better served
 with 200 OK unless a resource is actually being created.
- Password Handling
If you're planning to expand into authentication later, consider encrypting passwords
 (e.g., using BCrypt) before persisting.
*/
