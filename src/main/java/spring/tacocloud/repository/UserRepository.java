package spring.tacocloud.repository;


import org.springframework.data.repository.CrudRepository;
import spring.tacocloud.model.User;

public interface UserRepository extends CrudRepository<User,Long> {

    User findByUsername(String username);
}
