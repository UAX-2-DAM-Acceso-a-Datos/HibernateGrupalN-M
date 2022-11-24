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

		VehiculoPOJO vPojo = new VehiculoPOJO("2342 ghg","Cochetest","test1");
		RepuestosPOJO rPojo = new RepuestosPOJO("Repuesto","Repuetoprueba");
		vDao.addVehiculo(vPojo);
		
		
	}
}
