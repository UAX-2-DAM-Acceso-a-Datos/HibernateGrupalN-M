package pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity(name = "repuestos")
@Table(name = "repuestos")
public class RepuestosPOJO {
	
	public int id;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	
	@Column(name = "nombre")
	public String nombre;
	
	@Column(name = "descripcion")
	public String descripcion;

	public List<VehiculoPOJO> vehiculos = new ArrayList<VehiculoPOJO>();
	
	@ManyToMany(fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinTable(name = "vehiculos_repuestos", 
				joinColumns = { @JoinColumn(name = "id") }, 
				inverseJoinColumns = {@JoinColumn(name = "matricula") })
	public List<VehiculoPOJO> getVehiculos() {
		return vehiculos;
	}
	
	
	 public void addVehiculos(VehiculoPOJO vehiculo) {
	        this.vehiculos.add(vehiculo);
	    }
	 

	public RepuestosPOJO() {
	}

	public RepuestosPOJO(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public RepuestosPOJO(int id, String nombre, String descripcion) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public RepuestosPOJO(int id, String nombre, String descripcion, List<VehiculoPOJO> vehiculos) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.vehiculos = vehiculos;
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

	public void setVehiculos(List<VehiculoPOJO> vehiculos) {
		this.vehiculos = vehiculos;
	}

	@Override
	public String toString() {
		return "RepuestosPOJO [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", Vehiculo="
				+ vehiculos + "]";
	}

}
