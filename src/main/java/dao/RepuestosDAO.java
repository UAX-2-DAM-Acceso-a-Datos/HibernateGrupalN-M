package dao;

import java.util.List;

import org.hibernate.Session;

import dto.RepuestosDTO;
import dto.VehiculoDTO;
import idao.IRepuestos;
import utils.HibernateUtils;

public class RepuestosDAO implements IRepuestos {

	@Override
	public boolean addRepuestos(RepuestosDTO r) {
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
				return true;

	}

	@Override
	public boolean eliminarRepuestos(RepuestosDTO r) {
		// TODO Auto-generated method stub
		Session session = HibernateUtils.getSessionFactory().openSession();
		session.createQuery("DELETE FROM vehiculos WHERE" + r.getId());
		
		session.beginTransaction();
		
		System.out.println("El repuesto ha sido eliminado");
		session.close();
		return true;
	}

	@Override
	public boolean modificarRepuestos(RepuestosDTO r) {
		Session session = HibernateUtils.getSessionFactory().openSession();// Abrir sesion
		session.update(r); // Update Vehiculo
		session.beginTransaction().commit();// commit del Update 
		session.close();
		
		return true;
	}

	@Override
	public List<RepuestosDTO> listarRespuestos() {
		Session session= HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		List<RepuestosDTO>listarepuesto=session.createQuery("from cuentas").list();
		for (RepuestosDTO repuestos : listarepuesto) {
			System.out.println(repuestos);
			
		}
		
		return listarepuesto;
	}

}
