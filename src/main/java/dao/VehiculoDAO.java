package dao;

import java.util.List;

import org.hibernate.Hibernate;
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteVehiculo(VehiculoDTO v) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<VehiculoDTO> listVehiculo() {
		
		Session session= HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		List<VehiculoDTO>listavehiculos=session.createQuery("from cuentas").list();
		for (VehiculoDTO vehiculos : listavehiculos) {
			System.out.println(vehiculos);
			
		}
		
		return listavehiculos;
		
	}


}
