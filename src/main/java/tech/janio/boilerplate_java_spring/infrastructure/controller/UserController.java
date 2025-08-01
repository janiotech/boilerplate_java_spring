package tech.janio.boilerplate_java_spring.infrastructure.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.janio.boilerplate_java_spring.application.usecase.CreateUserUseCase;
import tech.janio.boilerplate_java_spring.application.usecase.GetUserUseCase;
import tech.janio.boilerplate_java_spring.domain.model.User;
import tech.janio.boilerplate_java_spring.application.dto.UserRequest;
import tech.janio.boilerplate_java_spring.application.dto.UserResponse;

import java.net.URI;
import java.util.UUID;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final CreateUserUseCase createUserUseCase;
    private final GetUserUseCase getUserUseCase;

    public UserController(CreateUserUseCase createUserUseCase, GetUserUseCase getUserUseCase) {
        this.createUserUseCase = createUserUseCase;
        this.getUserUseCase = getUserUseCase;
    }

    @PostMapping
    public ResponseEntity<UserResponse> createUser(@RequestBody UserRequest request) {
        User user = createUserUseCase.execute(request.toDomain());
        UserResponse response = UserResponse.fromDomain(user);

        return ResponseEntity
                .created(URI.create("/api/users/" + user.getId()))
                .body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> getUser(@PathVariable UUID id) {
        User user = getUserUseCase.execute(id);
        if (user == null) {
            return ResponseEntity.notFound().build();
        }
        UserResponse response = UserResponse.fromDomain(user);
        return ResponseEntity.ok(response);
    }
}
