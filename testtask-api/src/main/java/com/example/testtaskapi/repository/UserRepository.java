package com.example.testtaskapi.repository;

import com.example.testtaskapi.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsernameOrEmail(String username, String email);

    Optional<User> findByEmail(String email);

    Optional<User> findByUsername(String username);

    List<User> findByIdIn(List<Long> userIds);

    Boolean existsByEmail(String email);

    Boolean existsByUsername(String username);
}
