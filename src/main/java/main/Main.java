package main;

import dao.RepuestosDAO;
import dao.VehiculoDAO;
import dto.VehiculoDTO;
import pojo.RepuestosPOJO;
import pojo.VehiculoPOJO;

public class Main {
	public static void main(String[] args) {
		VehiculoDTO v = new VehiculoDTO("234567", "Peugeot", "206");
		VehiculoDAO vDao = new VehiculoDAO();
		RepuestosDAO rDao = new RepuestosDAO();
		VehiculoPOJO vPojo = new VehiculoPOJO("2342JZH","peugeot","306");
		RepuestosPOJO rPojo = new RepuestosPOJO("Repuesto","Repuetoprueba");
		vDao.addVehiculo(vPojo);
		//rDao.addRepuestos(rPojo);
		//vDao.addVehiculo(vPojo);
		System.out.println(vDao.listVehiculo());
		
	}
}
