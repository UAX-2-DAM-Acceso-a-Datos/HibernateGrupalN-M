package dto;
import java.util.List;

public class RepuestosDTO {

	private int id;
	private String nombre;
	private String descripcion;
	private List<VehiculoDTO> vehiculos;
	
	public RepuestosDTO() {
	}

	public RepuestosDTO(int id, String nombre, String descripcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public RepuestosDTO(int id, String nombre, String descripcion, List<VehiculoDTO> vehiculos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.vehiculos = vehiculos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<VehiculoDTO> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(List<VehiculoDTO> vehiculos) {
		this.vehiculos = vehiculos;
	}

	@Override
	public String toString() {
		return "RepuestosDTO [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", vehiculos="
				+ vehiculos + "]";
	}
	
	
	
}
