package com.asesoftware.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins = "https://prueba-concepto-cliente-6.herokuapp.com")
interface CarRepository extends JpaRepository<Car, Long> {
}