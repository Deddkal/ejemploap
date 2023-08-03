package com.mindhubap.clasesyobjetos.repositories;

import com.mindhubap.clasesyobjetos.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PersonRepository extends JpaRepository<Person, Long> {

}
