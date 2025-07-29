package com.balancedtime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.balancedtime.model.PomodoroSession;
/**
 * @author Yuzana Zaw Zaw
 */
@Repository
public interface PomodoroSessionRepository extends JpaRepository<PomodoroSession, Long> {
    // Add custom query methods if needed
}
