package com.salesianos.to_do_list.Exercise.dao;

import com.salesianos.to_do_list.Exercise.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskDao extends JpaRepository<Task, Long> {
}
