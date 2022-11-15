package dao;

import java.util.List;

import org.hibernate.Session;

import dto.RepuestosDTO;
import idao.IRepuestos;
import utils.HibernateUtils;

public class RepuestosDAO implements IRepuestos {

	@Override
	public boolean updateRepuestos(RepuestosDTO r) {
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
		return false;
	}

	@Override
	public boolean modificarRepuestos(RepuestosDTO r) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<RepuestosDTO> listarRespuestos() {
		// TODO Auto-generated method stub
		return null;
	}

}
