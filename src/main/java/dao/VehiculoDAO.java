package dao;

import java.util.List;

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
		// TODO Auto-generated method stub
		return null;
	}


}
