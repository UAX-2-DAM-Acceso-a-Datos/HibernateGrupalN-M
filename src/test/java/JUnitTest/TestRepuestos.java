package JUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

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
	
	@Test
	public void deleteVehiculoTest() {
		RepuestosPOJO r1 = new RepuestosPOJO(3,"Repuestos2","RepuestosPrueba");
		RepuestosDAO r = new RepuestosDAO();
		
		r.addRepuestos(r1);
		assertTrue(r.eliminarRepuestos(r1));
		
		
	}
	@Test
	void listrepuestos() {
		RepuestosDAO redao=new RepuestosDAO();
		List<RepuestosPOJO> a=new ArrayList<>();
		VehiculoPOJO vehpoj=new VehiculoPOJO("123456","306","Peugeot");
		List<VehiculoPOJO>av=new ArrayList<>();
		av.add(vehpoj);
		RepuestosPOJO b=new RepuestosPOJO(1,"Repuesto", "Repuestoprueba",av);
		a.add(b);
		assertEquals(a, redao.listarRespuestos());
	}
}
