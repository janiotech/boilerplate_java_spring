package tech.janio.boilerplate_java_spring.application.usecase;

import tech.janio.boilerplate_java_spring.domain.model.User;
import tech.janio.boilerplate_java_spring.domain.repository.UserRepository;

import java.util.UUID;

public class GetUserUseCase {
    private final UserRepository userRepository;

    public GetUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User execute(UUID userId){
        return this.userRepository.findById(userId).orElseThrow(IllegalArgumentException::new);
    }
}
