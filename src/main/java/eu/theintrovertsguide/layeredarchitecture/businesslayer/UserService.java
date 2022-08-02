package eu.theintrovertsguide.layeredarchitecture.businesslayer;

import eu.theintrovertsguide.layeredarchitecture.persistence.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findUserById(Long id) {
        return userRepository.findUserById(id);
    }

    public User save(User toSave) {
        return userRepository.save(toSave);
    }

}