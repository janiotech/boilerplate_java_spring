package tech.janio.boilerplate_java_spring.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.janio.boilerplate_java_spring.application.usecase.CreateUserUseCase;
import tech.janio.boilerplate_java_spring.application.usecase.GetUserUseCase;
import tech.janio.boilerplate_java_spring.domain.repository.UserRepository;

@Configuration
public class UserUseCaseConfig {
    @Bean
    public CreateUserUseCase createUserUseCase(UserRepository userRepository) {
        return new CreateUserUseCase(userRepository);
    }
    @Bean
    public GetUserUseCase getUserUseCase(UserRepository userRepository) {
        return new GetUserUseCase(userRepository);
    }
}
