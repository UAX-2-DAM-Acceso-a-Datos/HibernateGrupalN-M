package JUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import dao.RepuestosDAO;
import pojo.RepuestosPOJO;
import pojo.VehiculoPOJO;

class TestRepuestos {

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
