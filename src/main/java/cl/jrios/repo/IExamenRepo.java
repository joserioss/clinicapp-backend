package cl.jrios.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.jrios.model.Examen;

public interface IExamenRepo extends JpaRepository<Examen, Integer>{

}
