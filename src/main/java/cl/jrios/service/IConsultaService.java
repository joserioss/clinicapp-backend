package cl.jrios.service;

import cl.jrios.dto.ConsultaListaExamenDTO;
import cl.jrios.model.Consulta;

public interface IConsultaService extends ICRUD<Consulta>{

	Consulta registrarTransaccional(ConsultaListaExamenDTO dto);
	
}
