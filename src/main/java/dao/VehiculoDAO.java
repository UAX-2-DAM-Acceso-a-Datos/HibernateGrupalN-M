package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


import org.hibernate.Hibernate;
import org.hibernate.Session;

import dto.VehiculoDTO;
import idao.IVehiculo;
import utils.HibernateUtils;

public class VehiculoDAO implements IVehiculo {

	@Override
	public boolean addVehiculo(VehiculoDTO v) {
		//Creas sesion 
		Session session = HibernateUtils.getSessionFactory().openSession();
		//abres transaccion
		session.beginTransaction();
		//guardas vehiculo
		session.save(v);
		//comiteas
		session.getTransaction().commit();
		//cierra sesion
		session.close();
		return true;
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
