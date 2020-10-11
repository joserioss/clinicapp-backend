package cl.jrios.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/*
 * Clase consultaExamenPK esta siendo embebida por la clase ConsultaExamen
 * y al ser enbebida se recomienda que implemente Serializable
 * */

@Embeddable
public class ConsultaExamenPK implements Serializable {

	@ManyToOne
	@JoinColumn(name = "id_examen", nullable = false)
	private Examen examen;

	@ManyToOne
	@JoinColumn(name = "id_consulta", nullable = false)
	private Consulta consulta;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((consulta == null) ? 0 : consulta.hashCode());
		result = prime * result + ((examen == null) ? 0 : examen.hashCode());
		return result;
	}

	/*
	 * Al sobre escribir equal y hashcode de una clase, es necesario ir a esa clase
	 * y sobreescribir el equal and hashcode indicado a lo que hace unico a cada
	 * clase: consulta y examen
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConsultaExamenPK other = (ConsultaExamenPK) obj;
		if (consulta == null) {
			if (other.consulta != null)
				return false;
		} else if (!consulta.equals(other.consulta))
			return false;
		if (examen == null) {
			if (other.examen != null)
				return false;
		} else if (!examen.equals(other.examen))
			return false;
		return true;
	}

}
