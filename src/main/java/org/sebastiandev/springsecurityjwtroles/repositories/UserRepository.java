package org.sebastiandev.springsecurityjwtroles.repositories;

import org.sebastiandev.springsecurityjwtroles.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

@org.springframework.stereotype.Repository
public interface UserRepository extends JpaRepository<User, String> {
    UserDetails findByLogin(String login);
}
