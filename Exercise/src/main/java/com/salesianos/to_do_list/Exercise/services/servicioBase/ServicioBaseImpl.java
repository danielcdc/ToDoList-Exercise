package com.salesianos.to_do_list.Exercise.services.servicioBase;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public abstract class ServicioBaseImpl <T, ID, R extends JpaRepository<T, ID>>
        implements ServicioBase<T, ID, R> {

    @Override
    public T save(T t) {
        return null;
    }

    @Override
    public Optional<T> findById(ID id) {
        return Optional.empty();
    }

    @Override
    public List<T> findAll() {
        return null;
    }

    @Override
    public T edit(T t) {
        return null;
    }

    @Override
    public void delete(T t) {

    }

    @Override
    public void deleteById(ID id) {

    }
}
