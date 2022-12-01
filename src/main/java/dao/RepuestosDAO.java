package dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import dto.RepuestosDTO;
import idao.IRepuestos;
import pojo.RepuestosPOJO;
import utils.HibernateUtils;

public class RepuestosDAO implements IRepuestos {

	Logger logger = Logger.getLogger(RepuestosDAO.class);
	
	@Override
	public boolean addRepuestos(RepuestosPOJO r) {
		logger.info("Entras al metodo de añadir repuesto");
		//Creas sesion 
		Session session = HibernateUtils.getSessionFactory().openSession();
		//abres transaccion
		session.beginTransaction();
		logger.debug("Añades el el repuestos"+r);
		//guardas vehiculo
		session.save(r);
		//comiteas
		session.getTransaction().commit();
		//cierra sesion
		logger.info("Sales del metodo y cierras la conexion");
		session.close();
		return true;

	}

	@Override
	public boolean eliminarRepuestos(RepuestosPOJO r) {
		// TODO Auto-generated method stub
		Session session = HibernateUtils.getSessionFactory().openSession();
		 logger.info("Esto es un mensaje info");
		try {
		session.beginTransaction();
		session.delete(r);
		System.out.println("El repuesto ha sido eliminado");
		logger.debug(r);
		session.getTransaction().commit();
		session.close();
       }
		catch(Exception e){
			logger.error("Error de logger");
		
		}finally {
			
			return true;
		}
        
		
	}

	@Override
	public boolean modificarRepuestos(RepuestosPOJO r) {
		logger.info("[REPUESTOS] Entra a metodo modificarRepuestos.");
		try {
		Session session = HibernateUtils.getSessionFactory().openSession();// Abrir sesion
		session.update(r); // Update Vehiculo
		logger.debug("[DEBUG] " + r);
		session.beginTransaction().commit();// commit del Update 
		session.close();
		}catch(Exception e) {
			logger.error("[ERROR] Error en modificarRepuestos " + e.getMessage());
		}

		return true;
	}

	@Override
	public List<RepuestosPOJO> listarRespuestos() {
		Session session= HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		List<RepuestosPOJO>listarepuesto=session.createQuery("from cuentas").list();
		return listarepuesto;
	}

}
