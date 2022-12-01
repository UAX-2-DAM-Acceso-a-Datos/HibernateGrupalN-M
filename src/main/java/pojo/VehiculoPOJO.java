package pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

@Entity(name = "vehiculos")
@Table(name = "vehiculos")
public class VehiculoPOJO {

	private String matricula;

	@Id
	@Column(name = "matricula")
	@Pattern(regexp = "(?i)^\\d{4}?[ -]*([A-Z]{3})$")
	public String getMatricula() {
		return matricula;
	}

	@Column(name = "modelo")
	@NotBlank
	private String modelo;

	@Column(name = "marca")
	@NotNull
	private String marca;



	@ManyToMany(mappedBy = "vehiculos", fetch = FetchType.LAZY)
	public List<RepuestosPOJO> getRepuestos() {
		return repuestos;
	}

	public List<RepuestosPOJO> repuestos = new ArrayList<RepuestosPOJO>();
	
	public void addRepuestos(RepuestosPOJO repuesto) {
		this.repuestos.add(repuesto);
	}

	public VehiculoPOJO() {

	}

	public VehiculoPOJO(String matricula, String marca, String modelo, List<RepuestosPOJO> repuestos) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.repuestos = repuestos;
	}

	public VehiculoPOJO(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setRepuestos(List<RepuestosPOJO> repuestos) {
		this.repuestos = repuestos;
	}

	@Override
	public String toString() {
		return "VehiculoPOJO [matricula=" + matricula + ", modelo=" + modelo + ", marca=" + marca + ", repuestos="
				+ repuestos + "]";
	}

}
