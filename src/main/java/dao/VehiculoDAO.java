package dao;

import java.util.List;

import javax.validation.ConstraintViolationException;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import idao.IVehiculo;
import pojo.VehiculoPOJO;
import utils.HibernateUtils;

public class VehiculoDAO implements IVehiculo {

    Logger logger = Logger.getLogger(VehiculoDAO.class);
	
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
        logger.info("Esto es un mensaje info");
        logger.debug("Esto es un mensaje info");
        logger.warn("Esto es un mensaje info");
        logger.error("Esto es un mensaje info");
        logger.fatal("Esto es un mensaje info");
		return true;
	}

	@Override
	public boolean updateVehiculo(VehiculoPOJO v) {
		
		Session session = HibernateUtils.getSessionFactory().openSession();// Abrir sesion
		session.update(v); // Update Vehiculo
		session.beginTransaction().commit();// commit del Update 
		session.close();
        logger.info("Esto es un mensaje info");
        logger.debug("Esto es un mensaje info");
        logger.warn("Esto es un mensaje info");
        logger.error("Esto es un mensaje info");
        logger.fatal("Esto es un mensaje info");
		return true;
	}

	@Override
	public boolean deleteVehiculo(VehiculoPOJO v) {
		// TODO Auto-generated method stub
		Session session = HibernateUtils.getSessionFactory().openSession();
		try {
			logger.info("Has entrado al metodo");
			session.beginTransaction();
			session.delete(v);
			System.out.println("El vehiculo ha sido eliminado");
			logger.debug(v);
			session.getTransaction().commit();
			session.close();
	      
	    
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error en el metodo");
		}finally {
			return true;
		}
		  
		
		
	}

	@Override
	public List<VehiculoPOJO> listVehiculo() {
		
		Session session= HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		List<VehiculoPOJO>listavehiculos=session.createQuery("from vehiculos").list();
        logger.info("Esto es un mensaje info");
        logger.debug("Esto es un mensaje info");
        logger.warn("Esto es un mensaje info");
        logger.error("Esto es un mensaje info");
        logger.fatal("Esto es un mensaje info");
		return listavehiculos;
		
	}

	@Override
	public VehiculoPOJO listarRepuestoMatricula(String matricula) {
		Session session= HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		List<VehiculoPOJO>listavehiculos=session.createQuery("from vehiculos").list();
		for (int i = 0; i < listavehiculos.size(); i++) {
			if (listavehiculos.get(i).getMatricula().equals(matricula)) {
				return listavehiculos.get(i);
			}
		}
        logger.info("Esto es un mensaje info");
        logger.debug("Esto es un mensaje info");
        logger.warn("Esto es un mensaje info");
        logger.error("Esto es un mensaje info");
        logger.fatal("Esto es un mensaje info");
		return null;
	}


}
