package JUnitTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import dao.VehiculoDAO;
import pojo.VehiculoPOJO;

class TestVehiculo {

	@Test
	public void updateVehiculo() {
		VehiculoPOJO vPojo = new VehiculoPOJO("1505FRT", "PEUGOT", "X3");
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
	@After
	public void deleteVehiculoTest() {
		VehiculoPOJO vPojo = new VehiculoPOJO("1505FRT", "PEUGOT", "X3");
		VehiculoDAO v = new VehiculoDAO();

		assertTrue(v.deleteVehiculo(vPojo));

	}

}
