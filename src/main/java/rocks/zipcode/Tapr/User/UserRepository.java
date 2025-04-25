package rocks.zipcode.Tapr.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
//    List<User> findByUserName(String userName);
//    List<User> findByFirstName(String firstName);
//    List<User> findByLastName(String lastName);
//    List<User> findByEmail(String email);
//    List<User> findByPhoneNumber(int phoneNumber);
//
//    User findById(long ID);
}
