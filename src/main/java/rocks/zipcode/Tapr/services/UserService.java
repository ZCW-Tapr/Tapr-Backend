package rocks.zipcode.Tapr.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rocks.zipcode.Tapr.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
}
