package rocks.zipcode.Tapr.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rocks.zipcode.Tapr.domain.User_Assets;

@Repository
public interface User_AssetsRepository extends CrudRepository<User_Assets, Long> {


}
