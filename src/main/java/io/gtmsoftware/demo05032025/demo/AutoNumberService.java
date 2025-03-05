package io.gtmsoftware.demo05032025.demo;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AutoNumberService {
    private final AutoNumberRepository repository;

    public AutoNumberService(AutoNumberRepository repository) {
        this.repository = repository;
    }

    public Mono<AutoNumberConfig> createAutoNumber(AutoNumberConfig autoNumberConfig) {
        return repository.save(autoNumberConfig);
    }

    public Flux<AutoNumberConfig> getAllAutoNumbers() {
        return repository.findAll();
    }

    public Mono<AutoNumberConfig> getAutoNumberById(String id) {
        return repository.findById(id);
    }

    public Mono<AutoNumberConfig> updateAutoNumber(String id, AutoNumberConfig autoNumberConfig) {
        return repository.findById(id)
                .flatMap(existingConfig -> {
                    existingConfig.setName(autoNumberConfig.getName());
                    existingConfig.setCurrentValue(autoNumberConfig.getCurrentValue());
                    return repository.save(existingConfig);
                });
    }

    public Mono<Void> deleteAutoNumber(String id) {
        return repository.deleteById(id);
    }
}