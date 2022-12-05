package JUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import dao.VehiculoDAO;
import pojo.RepuestosPOJO;
import pojo.VehiculoPOJO;

class TestVehiculo {

	@Test
	public void updateVehiculo() {
		VehiculoPOJO vPojo = new VehiculoPOJO("1505FRT", "PEUGOT", "306");
		VehiculoDAO vDAO = new VehiculoDAO();
		Assert.assertTrue(vDAO.updateVehiculo(vPojo));
	}
	
	@Before
	@Test
	public void addVehiculo() {
		VehiculoDAO v1 = new VehiculoDAO();
		VehiculoPOJO vPojo = new VehiculoPOJO("1505FRT", "PEUGOT", "X3");
		boolean result = v1.addVehiculo(vPojo);
		Assert.assertTrue(result);

	}
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

	@Test
	@After
	public void deleteVehiculoTest() {
		VehiculoPOJO vPojo = new VehiculoPOJO("1505FRT", "PEUGOT", "X3");
		VehiculoDAO v = new VehiculoDAO();

		assertTrue(v.deleteVehiculo(vPojo));

	}

}
