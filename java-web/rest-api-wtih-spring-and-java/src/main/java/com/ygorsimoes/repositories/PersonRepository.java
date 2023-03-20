package com.ygorsimoes.repositories;

import com.ygorsimoes.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<Person, Long> { }