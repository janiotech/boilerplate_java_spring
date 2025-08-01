package tech.janio.boilerplate_java_spring.infrastructure.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.janio.boilerplate_java_spring.infrastructure.entity.UserEntity;

import java.util.Optional;
import java.util.UUID;

public interface UserJpaRepository extends JpaRepository<UserEntity, UUID> {
    Optional<UserEntity> findByEmail(String email);
    boolean existsByEmail(String email);
}