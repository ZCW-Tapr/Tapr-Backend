package rocks.zipcode.Tapr.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rocks.zipcode.Tapr.domain.Devices;

@Repository
public interface DevicesRepository extends CrudRepository<Devices, Long> {
}
