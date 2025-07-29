package com.balancedtime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.balancedtime.model.Task;
/**
 * @author Yuzana Zaw Zaw
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    // Add custom query methods if needed
}
