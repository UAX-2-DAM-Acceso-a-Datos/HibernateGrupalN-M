package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import dto.VehiculoDTO;
import entities.Cuenta;
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
		Session session = HibernateUtils.getSessionFactory().openSession();
		session.createQuery("DELETE FROM vehiculos WHERE" + v.getMatricula());
		
		session.beginTransaction();
		
		System.out.println("El vehiculo ha sido eliminado");
		session.close();
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
