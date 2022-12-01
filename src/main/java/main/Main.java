package main;

import java.util.List;

import dao.RepuestosDAO;
import dao.VehiculoDAO;
import pojo.RepuestosPOJO;
import pojo.VehiculoPOJO;

public class Main {
	public static void main(String[] args) {
		VehiculoDAO vDao = new VehiculoDAO();
		RepuestosDAO rDao = new RepuestosDAO();

		//Creamos los repuestos
		RepuestosPOJO repuestoGenerico = new RepuestosPOJO();
		repuestoGenerico.setNombre("Repuesto Generico");
		repuestoGenerico.setDescripcion("Esto es un repuesto Generico");
		
		RepuestosPOJO repuestoCoche = new RepuestosPOJO();
		repuestoCoche.setNombre("Volante Mazda");
		repuestoCoche.setDescripcion("");

		//Creamos los vehiculos
		VehiculoPOJO coche = new VehiculoPOJO("2323DKF", "Mazda", "323f");
		VehiculoPOJO moto = new VehiculoPOJO("2323AFC", "Ducati", "125");

		//Añadimos los repuestos
		repuestoGenerico.addVehiculos(coche);
		repuestoGenerico.addVehiculos(moto);
		repuestoCoche.addVehiculos(coche);

		//Añadimos los repuestos a los vehiculos
		coche.addRepuestos(repuestoGenerico);
		moto.addRepuestos(repuestoGenerico);
		coche.addRepuestos(repuestoCoche);

		//Realizamos las operaciones en BD
		rDao.addRepuestos(repuestoGenerico);
		rDao.addRepuestos(repuestoCoche);

		
		//mostramos los resultados
		 List<VehiculoPOJO> listVehiculos = vDao.listVehiculo();
		 
		 for (VehiculoPOJO vehiculo : listVehiculos) {
			 
			 System.out.println("----VEHICULO---");
			 System.out.println("Matricula:" + vehiculo.getMatricula());
			 System.out.println("Marca:" + vehiculo.getMarca());
			 System.out.println("Modelo:" + vehiculo.getModelo());
			 System.out.println("---[REPUESTOS]--");
			 
			 for (RepuestosPOJO repuesto : vehiculo.getRepuestos()) {
				 System.out.println("-" + repuesto.getNombre());
			}
			 System.out.println("");
			
		}
		 
	}
}
