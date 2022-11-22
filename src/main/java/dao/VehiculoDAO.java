package dao;

import java.util.List;

import javax.validation.ConstraintViolationException;

import org.hibernate.Session;

import dto.VehiculoDTO;
import idao.IVehiculo;
import pojo.VehiculoPOJO;
import utils.HibernateUtils;

public class VehiculoDAO implements IVehiculo {

	@Override
	public boolean addVehiculo(VehiculoPOJO v) {
		try {
			
		
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
		}catch(ConstraintViolationException cve) {
			cve.printStackTrace();
		}
		
		return true;
	}

	@Override
	public boolean updateVehiculo(VehiculoPOJO v) {
		
		Session session = HibernateUtils.getSessionFactory().openSession();// Abrir sesion
		session.update(v); // Update Vehiculo
		session.beginTransaction().commit();// commit del Update 
		session.close();
		
		return true;
	}

	@Override
	public boolean deleteVehiculo(VehiculoPOJO v) {
		// TODO Auto-generated method stub
		Session session = HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		session.delete(v);
		System.out.println("El vehiculo ha sido eliminado");
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public List<VehiculoDTO> listVehiculo() {
		
		Session session= HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		List<VehiculoDTO>listavehiculos=session.createQuery("from vehiculos").list();
		
		return listavehiculos;
		
	}


}
