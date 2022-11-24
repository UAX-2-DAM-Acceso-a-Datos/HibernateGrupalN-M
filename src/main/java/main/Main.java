package main;

import dao.RepuestosDAO;
import dao.VehiculoDAO;
import dto.VehiculoDTO;
import pojo.RepuestosPOJO;
import pojo.VehiculoPOJO;

public class Main {
	public static void main(String[] args) {
		VehiculoDAO vDao = new VehiculoDAO();
		RepuestosDAO rDao = new RepuestosDAO();

		
		//rDao.addRepuestos(rPojo);
		//vDao.addVehiculo(vPojo);
		System.out.println(vDao.listVehiculo());
		System.out.println(vDao.listarRepuestoMatricula("234556"));
		
	}
}
