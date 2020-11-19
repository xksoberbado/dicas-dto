package br.xksoberbado.dicasdto.repository;

import br.xksoberbado.dicasdto.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
