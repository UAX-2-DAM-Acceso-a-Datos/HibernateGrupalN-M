package idao;

import java.util.List;

import dto.VehiculoDTO;
import pojo.VehiculoPOJO;

public interface IVehiculo {
	public boolean addVehiculo(VehiculoPOJO v);
	public boolean updateVehiculo(VehiculoPOJO v);
	public boolean deleteVehiculo(VehiculoPOJO v);
	public List<VehiculoDTO> listVehiculo();
}