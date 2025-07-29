package com.balancedtime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.balancedtime.model.Goal;
/**
 * 
 * @author Yuzana Zaw Zaw
 */
@Repository
public interface GoalRepository extends JpaRepository<Goal, Long> {
    // Add custom query methods if needed
}
