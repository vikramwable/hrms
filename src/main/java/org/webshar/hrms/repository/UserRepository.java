package org.webshar.hrms.repository;

import org.webshar.hrms.domain.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>
{

  Optional<User> findOneByEmail(String email);
}
