package spring.tacocloud.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import spring.tacocloud.model.Taco;

public interface TacoRepository
        extends ReactiveCrudRepository<Taco, Long> {
}