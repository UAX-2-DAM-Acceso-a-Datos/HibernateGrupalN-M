package pojo;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import dto.RepuestosDTO;

@Table(name = "vehiculos")
@Entity(name = "vehiculos")
public class VehiculoPOJO {

	@Id
	@Column(name = "matricula")
	private String matricula;
	
	@Column(name = "modelo")
	private String modelo;
	
	@Column(name = "marca")
	private String marca;
	
	@ManyToMany(mappedBy = "vehiculos")
	private List<RepuestosPOJO> repuestos;
	
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

	public String getMatricula() {
		return matricula;
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

	public List<RepuestosPOJO> getRepuestos() {
		return repuestos;
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
