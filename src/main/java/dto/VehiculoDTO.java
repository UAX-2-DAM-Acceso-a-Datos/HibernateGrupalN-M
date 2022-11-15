package dto;

import java.util.List;

public class VehiculoDTO {
	private String matricula ;
	private String marca;
	private String modelo;
	private List<RepuestosDTO> listaRepuestos;
	
	public VehiculoDTO() {
		
	}

	public VehiculoDTO(String matricula, String marca, String modelo, List<RepuestosDTO> listaRespuestos) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.listaRespuestos = listaRespuestos;
	}

	public VehiculoDTO(String matricula, String marca, String modelo) {
		super();
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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public List<RepuestosDTO> getListaRepuestos() {
		return listaRepuestos;
	}

	public void setListaRespuestos(List<RepuestosDTO> listaRespuestos) {
		this.listaRepuestos = listaRepuestos;
	}

	@Override
	public String toString() {
		return "VehiculoDTO [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + "]";
	}
	

}
