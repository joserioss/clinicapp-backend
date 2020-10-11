package cl.jrios.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import cl.jrios.model.Examen;
import cl.jrios.repo.IExamenRepo;
import cl.jrios.service.IExamenService;

public class ExamenServiceImpl implements IExamenService{

	@Autowired	
	private IExamenRepo repo;
	
	@Override
	public Examen registrar(Examen obj) {
		return repo.save(obj);
	}

	@Override
	public Examen modificar(Examen obj) {
		return repo.save(obj);
	}

	@Override
	public List<Examen> listar() {
		return repo.findAll();
	}

	@Override
	public Examen leerPorId(Integer id) {
		Optional<Examen> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Examen();
	}

	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}

}
