package io.gtmsoftware.demo05032025.demo;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface AutoNumberRepository extends ReactiveCrudRepository<AutoNumberConfig, String> {
}