package idao;

import java.util.List;

import dto.RepuestosDTO;

public interface IRepuestos {
	public boolean addRepuestos(RepuestosDTO r);
	public boolean eliminarRepuestos(RepuestosDTO r);
	public boolean modificarRepuestos(RepuestosDTO r);
	public List<RepuestosDTO> listarRespuestos();

}
