package com.salesianos.to_do_list.Exercise.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.time.LocalDate;

@Entity
@Data @AllArgsConstructor
@NoArgsConstructor @Builder
public class Task {

    @GeneratedValue
    private Long id;

    private String name;
    private LocalDate creationDate;
    private LocalDate finishDate;

}
