package dao;

import java.util.List;

import org.hibernate.Session;

import dto.VehiculoDTO;
import idao.IVehiculo;
import utils.HibernateUtils;

public class VehiculoDAO implements IVehiculo {

	@Override
	public boolean addVehiculo(VehiculoDTO v) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateVehiculo(VehiculoDTO v) {
		
		Session session = HibernateUtils.getSessionFactory().openSession();// Abrir sesion
		session.update(v); // Update Vehiculo
		session.beginTransaction().commit();// commit del Update 
		session.close();
		
		return true;
	}

	@Override
	public boolean deleteVehiculo(VehiculoDTO v) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<VehiculoDTO> listVehiculo() {
		// TODO Auto-generated method stub
		return null;
	}


}
