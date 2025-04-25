package rocks.zipcode.Tapr.Devices;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevicesRepository extends CrudRepository<Devices, Integer> {
}
