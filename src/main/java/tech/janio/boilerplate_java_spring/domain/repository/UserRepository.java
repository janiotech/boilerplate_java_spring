package tech.janio.boilerplate_java_spring.domain.repository;

import tech.janio.boilerplate_java_spring.domain.model.User;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository {
    User save(User user);
    Optional<User> findById(UUID id);
    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);
}
