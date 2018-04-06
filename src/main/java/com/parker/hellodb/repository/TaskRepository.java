package com.parker.hellodb.repository;


import com.parker.hellodb.model.Task;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface TaskRepository extends PagingAndSortingRepository<Task, Long> {
    List<Task> findAllByOrderByUrgentDesc();
}