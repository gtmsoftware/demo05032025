package io.gtmsoftware.demo05032025.demo;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/auto-numbers")
public class AutoNumberController {
    private final AutoNumberService service;

    public AutoNumberController(AutoNumberService service) {
        this.service = service;
    }

    @PostMapping
    public Mono<AutoNumberConfig> create(@RequestBody AutoNumberConfig config) {
        return service.createAutoNumber(config);
    }

    @GetMapping
    public Flux<AutoNumberConfig> getAll() {
        return service.getAllAutoNumbers();
    }

    @GetMapping("/{id}")
    public Mono<AutoNumberConfig> getById(@PathVariable String id) {
        return service.getAutoNumberById(id);
    }

    @PutMapping("/{id}")
    public Mono<AutoNumberConfig> update(@PathVariable String id, @RequestBody AutoNumberConfig config) {
        return service.updateAutoNumber(id, config);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return service.deleteAutoNumber(id);
    }
}