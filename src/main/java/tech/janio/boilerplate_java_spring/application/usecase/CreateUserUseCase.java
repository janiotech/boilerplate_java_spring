package tech.janio.boilerplate_java_spring.application.usecase;

import tech.janio.boilerplate_java_spring.domain.model.User;
import tech.janio.boilerplate_java_spring.domain.repository.UserRepository;

public class CreateUserUseCase {
    private final UserRepository userRepository;

    public CreateUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User execute(User user) {
        return this.userRepository.save(user);
    }
}