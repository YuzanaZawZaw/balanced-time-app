package com.balancedtime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.balancedtime.model.Habit;
/**
 * @author Yuzana Zaw Zaw
 */
@Repository
public interface HabitRepository extends JpaRepository<Habit, Long> {
    // Add custom query methods if needed
}
