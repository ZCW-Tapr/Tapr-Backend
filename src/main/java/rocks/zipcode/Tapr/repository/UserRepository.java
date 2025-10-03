package rocks.zipcode.Tapr.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rocks.zipcode.Tapr.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
//    List<User> findByUserName(String userName);
//    List<User> findByFirstName(String firstName);
//    List<User> findByLastName(String lastName);
//    List<User> findByEmail(String email);
//    List<User> findByPhoneNumber(String phoneNumber);
//
//    User findById(long ID);
}

/*
Suggestions for Future Expansion
If you decide to re-enable those queries, here’s a heads-up:
- findByPhoneNumber(int phoneNumber) should be updated to accept String, since your entity defines it as such.
- Spring Data auto-generates query logic from method names, so all of those can be activated just by uncommenting them—no extra query code needed.
*/

//Done