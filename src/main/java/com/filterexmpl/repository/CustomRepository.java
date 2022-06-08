package com.filterexmpl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

@NoRepositoryBean
public interface CustomRepository<T, ID> extends JpaRepository<T, ID> {
    default Optional<T> findById(ID id) {
        throw new RuntimeException();
    }
    Optional<T> getById(ID id);
}
