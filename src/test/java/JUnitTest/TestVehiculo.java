package JUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import dao.RepuestosDAO;
import dao.VehiculoDAO;
import pojo.RepuestosPOJO;
import pojo.VehiculoPOJO;

class TestVehiculo {

	@Test
	void listvehi() {
		VehiculoDAO redao=new VehiculoDAO();
		List<VehiculoPOJO> a=new ArrayList<>();
		RepuestosPOJO b=new RepuestosPOJO(1,"Repuesto", "Repuestoprueba");
		List<RepuestosPOJO>ar=new ArrayList<>();
		ar.add(b);
		VehiculoPOJO vehpoj=new VehiculoPOJO("123456","Peugeot","306",ar);
		
		a.add(vehpoj);
		assertEquals (a, redao.listVehiculo());
	}

}
