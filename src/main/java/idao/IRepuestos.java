package idao;

import java.util.List;

import dto.RepuestosDTO;
import pojo.RepuestosPOJO;

public interface IRepuestos {
	public boolean addRepuestos(RepuestosPOJO r);
	public boolean eliminarRepuestos(RepuestosPOJO r);
	public boolean modificarRepuestos(RepuestosPOJO r);
	public List<RepuestosDTO> listarRespuestos();

}
