package spring.tacocloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.server.EntityLinks;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import spring.tacocloud.model.Taco;
import spring.tacocloud.repository.TacoRepository;


@RestController
@RequestMapping(path="/design", produces="application/json")
@CrossOrigin(origins="*")
public class DesignTacoController {

    private TacoRepository tacoRepo;

    @Autowired
    EntityLinks entityLinks;

    public DesignTacoController(TacoRepository tacoRepo) {
        this.tacoRepo = tacoRepo;
    }

    @GetMapping("/recent")
    public Flux<Taco> recentTacos() {
        return tacoRepo.findAll().take(12);
    }

    @GetMapping("/{id}")
    public Mono<Taco> tacoById(@PathVariable("id") Long id) {
        return tacoRepo.findById(id);
    }

    @PostMapping(consumes="application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Taco> postTaco(@RequestBody Mono<Taco> tacoMono) {
        return tacoRepo.saveAll(tacoMono).next();
    }
}