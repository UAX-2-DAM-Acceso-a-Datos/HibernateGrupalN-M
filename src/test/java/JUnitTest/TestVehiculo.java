package JUnitTest;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import dao.VehiculoDAO;
import pojo.VehiculoPOJO;

class TestVehiculo {

	@Test
		void test() {
			VehiculoDAO v1 = new VehiculoDAO();
			VehiculoPOJO vPojo = new VehiculoPOJO("1505FRT", "PEUGOT", "X3");
			boolean result = v1.addVehiculo(vPojo);
		
			Assert.assertTrue(result); 
			
		

		}
	
			
	}

