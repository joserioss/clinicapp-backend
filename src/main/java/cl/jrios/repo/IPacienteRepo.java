package cl.jrios.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.jrios.model.Paciente;

public interface IPacienteRepo extends JpaRepository<Paciente, Integer>{

}
