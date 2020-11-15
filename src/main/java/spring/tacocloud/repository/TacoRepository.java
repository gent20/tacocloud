package spring.tacocloud.repository;

import org.springframework.data.repository.CrudRepository;
import spring.tacocloud.model.Taco;

public interface TacoRepository extends CrudRepository<Taco,Long> {

}
