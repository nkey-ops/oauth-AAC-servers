package tacos.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import tacos.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

  Optional<User> findByUsername(String username);
}
