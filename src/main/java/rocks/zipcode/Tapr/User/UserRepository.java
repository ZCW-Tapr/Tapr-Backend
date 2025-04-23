package rocks.zipcode.Tapr.User;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
    List<User> findByUsername(String username);
    List<User> findByFirstName(String firstName);
    List<User> findByLastName(String lastName);
    List<User> findByEmail(String email);
    List<User> findByPassword(String password);
    List<User> findByPhoneNumber(String phoneNumber);

    User findById(long ID);
}
