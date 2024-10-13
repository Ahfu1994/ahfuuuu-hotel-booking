package com.chiradet.AhfuuuHotel.repo;

import com.chiradet.AhfuuuHotel.entiry.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByEmail(String email);
    Optional<User> findByEmail(String email);
}
