package JUnitTest;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import dao.RepuestosDAO;
import dao.VehiculoDAO;
import pojo.RepuestosPOJO;
import pojo.VehiculoPOJO;

class TestRepuestos {

	@Test
	public void updateRepuesto() {
		RepuestosPOJO rPOJO = new RepuestosPOJO(3,"Repuestos2","RepuestosPrueba");
		RepuestosDAO rDAO = new RepuestosDAO();
		
		
		Assert.assertTrue(rDAO.modificarRepuestos(rPOJO));
		
	}
}
