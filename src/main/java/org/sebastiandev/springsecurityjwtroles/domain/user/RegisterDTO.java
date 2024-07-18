package org.sebastiandev.springsecurityjwtroles.domain.user;

public record RegisterDTO(String login, String password, UserRole role) {
}
