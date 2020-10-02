package com.salesianos.to_do_list.Exercise.services;

import com.salesianos.to_do_list.Exercise.dao.TaskDao;
import com.salesianos.to_do_list.Exercise.model.Task;
import com.salesianos.to_do_list.Exercise.services.servicioBase.ServicioBaseImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequestMapping("/")
@RequiredArgsConstructor
public class TaskService extends ServicioBaseImpl<Task, Long, TaskDao> {



}
