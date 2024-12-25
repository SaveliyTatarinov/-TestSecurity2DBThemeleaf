package ru.tatarinov.TestSecurity2DBThemeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tatarinov.TestSecurity2DBThemeleaf.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}

