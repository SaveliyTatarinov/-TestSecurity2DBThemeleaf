package ru.tatarinov.TestSecurity2DBThemeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tatarinov.TestSecurity2DBThemeleaf.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
