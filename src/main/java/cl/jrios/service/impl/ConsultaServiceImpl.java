package cl.jrios.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.jrios.dto.ConsultaListaExamenDTO;
import cl.jrios.model.Consulta;
import cl.jrios.repo.IConsultaExamenRepo;
import cl.jrios.repo.IConsultaRepo;
import cl.jrios.service.IConsultaService;

@Service
public class ConsultaServiceImpl implements IConsultaService{

	@Autowired	
	private IConsultaRepo repo;
	
	@Autowired
	private IConsultaExamenRepo consulaExamenRepo;
	
	@Override
	public Consulta registrar(Consulta obj) {
		obj.getDetalleConsulta().forEach(det -> {
			det.setConsulta(obj);
		});
		return repo.save(obj);
	}
	
	@Transactional
	@Override
	public Consulta registrarTransaccional(ConsultaListaExamenDTO dto) {
		dto.getConsulta().getDetalleConsulta().forEach(det -> {
			det.setConsulta(dto.getConsulta());
		});
		repo.save(dto.getConsulta());
		
		dto.getLstExamen().forEach(ex -> consulaExamenRepo.registrar(dto.getConsulta().getIdConsulta(), ex.getIdExamen()));
		
		return dto.getConsulta();
		
	}

	@Override
	public Consulta modificar(Consulta obj) {
		return repo.save(obj);
	}

	@Override
	public List<Consulta> listar() {
		return repo.findAll();
	}

	@Override
	public Consulta leerPorId(Integer id) {
		Optional<Consulta> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Consulta();
	}

	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}

}
