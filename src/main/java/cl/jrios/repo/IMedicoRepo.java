package cl.jrios.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.jrios.model.Medico;

public interface IMedicoRepo extends JpaRepository<Medico, Integer>{

}
