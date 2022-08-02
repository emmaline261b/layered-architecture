package eu.theintrovertsguide.layeredarchitecture.persistence;

import eu.theintrovertsguide.layeredarchitecture.businesslayer.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findUserById(Long id);
}