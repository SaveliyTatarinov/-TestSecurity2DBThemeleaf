package ru.tatarinov.TestSecurity2DBThemeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.tatarinov.TestSecurity2DBThemeleaf.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}

