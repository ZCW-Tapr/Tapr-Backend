package rocks.zipcode.Tapr;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends PagingAndSortingRepository<User, Long>, CrudRepository<User,Long> {
    List<User> findByUsername(@Param("username") String username);
    List<User> findByEmail(@Param("email") String email);
    List<User> findByFirstName(@Param("firstName") String firstName);
    List<User> findByLastName(@Param("lastName") String lastName);
    List<User> findByPhone(@Param("phone") int phone);
    List<User> findByDevicesOnProfile(@Param("devicesOnProfile") ArrayList<String> devicesOnProfile);

    User findByID(int ID);

}
