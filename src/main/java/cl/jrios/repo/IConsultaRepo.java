package cl.jrios.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.jrios.model.Consulta;

public interface IConsultaRepo extends JpaRepository<Consulta, Integer>{

}
