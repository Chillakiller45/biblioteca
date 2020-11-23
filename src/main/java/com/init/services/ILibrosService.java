package com.init.services;

import com.init.entities.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILibrosService extends JpaRepository<Libro, Long> {
}
