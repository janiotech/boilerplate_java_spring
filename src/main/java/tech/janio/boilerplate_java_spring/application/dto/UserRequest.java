package tech.janio.boilerplate_java_spring.application.dto;

import tech.janio.boilerplate_java_spring.domain.model.User;

public class UserRequest {
    private String name;
    private String email;
    private String passwordHash;

    public User toDomain() {
        return new User(name, email, passwordHash);
    }

    // Getters e Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public void setPasswordHash(String passwordHash) { this.passwordHash = passwordHash; }

}
