package dto;

public class VehiculoDTO {
	private String matricula ;
	private String marca;
	private String modelo;
	private List<RespuestosDTO> listaRespuestos;
	
	public VehiculoDTO() {
		
	}

	public VehiculoDTO(String matricula, String marca, String modelo, List<RespuestosDTO> listaRespuestos) {
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

	public List<RespuestosDTO> getListaRespuestos() {
		return listaRespuestos;
	}

	public void setListaRespuestos(List<RespuestosDTO> listaRespuestos) {
		this.listaRespuestos = listaRespuestos;
	}

	@Override
	public String toString() {
		return "VehiculoDTO [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + "]";
	}
	

}
