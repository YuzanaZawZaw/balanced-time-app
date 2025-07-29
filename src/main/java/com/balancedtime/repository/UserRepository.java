package com.balancedtime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.balancedtime.model.User;
/**
 * @author Yuzana Zaw Zaw
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Custom query method to find a user by email
    User findByEmail(String email);
}
