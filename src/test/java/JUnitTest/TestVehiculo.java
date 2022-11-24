package JUnitTest;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import dao.VehiculoDAO;
import pojo.VehiculoPOJO;

class TestVehiculo {

	@Test
	public void updateVehiculo() {
		VehiculoPOJO vPOJO = new VehiculoPOJO("2324JZZ","Peugeot","206");
		VehiculoDAO vDAO = new VehiculoDAO();
		
		
		Assert.assertTrue(vDAO.updateVehiculo(vPOJO));
		
	}

}
