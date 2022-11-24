package dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import idao.IRepuestos;
import pojo.RepuestosPOJO;
import utils.HibernateUtils;

public class RepuestosDAO implements IRepuestos {
	
	Logger logger = Logger.getLogger(VehiculoDAO.class);
	
	@Override
	public boolean addRepuestos(RepuestosPOJO r) {
		//Creas sesion 
		Session session = HibernateUtils.getSessionFactory().openSession();
		//abres transaccion
		session.beginTransaction();
		//guardas vehiculo
		session.save(r);
		//comiteas
		session.getTransaction().commit();
		//cierra sesion
		session.close();
		logger.info("Esto es un mensaje info");
		logger.debug("Esto es un mensaje info");
		logger.warn("Esto es un mensaje info");
		logger.error("Esto es un mensaje info");
		logger.fatal("Esto es un mensaje info");
		return true;

	}

	@Override
	public boolean eliminarRepuestos(RepuestosPOJO r) {
		// TODO Auto-generated method stub
		Session session = HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		session.delete(r);
		System.out.println("El repuesto ha sido eliminado");
		session.getTransaction().commit();
		session.close();
		logger.info("Esto es un mensaje info");
		logger.debug("Esto es un mensaje info");
		logger.warn("Esto es un mensaje info");
		logger.error("Esto es un mensaje info");
		logger.fatal("Esto es un mensaje info");
		return true;
	}

	@Override
	public boolean modificarRepuestos(RepuestosPOJO r) {
		Session session = HibernateUtils.getSessionFactory().openSession();// Abrir sesion
		session.update(r); // Update Vehiculo
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
	public List<RepuestosPOJO> listarRespuestos() {
		Session session= HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		List<RepuestosPOJO>listarepuesto=session.createQuery("from cuentas").list();

		logger.info("Esto es un mensaje info");
		logger.debug("Esto es un mensaje info");
		logger.warn("Esto es un mensaje info");
		logger.error("Esto es un mensaje info");
		logger.fatal("Esto es un mensaje info");
		return listarepuesto;
	}

}
