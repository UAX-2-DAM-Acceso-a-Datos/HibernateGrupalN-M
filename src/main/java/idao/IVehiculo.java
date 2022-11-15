package idao;

import java.util.List;

import dto.VehiculoDTO;

public interface IVehiculo {
	public boolean addVehiculo(VehiculoDTO v);
	public boolean updateVehiculo(VehiculoDTO v);
	public boolean deleteVehiculo(VehiculoDTO v);
	public List<VehiculoDTO> listVehiculo();
}