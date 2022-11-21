package pojo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import dto.VehiculoDTO;

@Table(name="repuestos")
@Entity(name="repuestos")
public class RepuestosPOJO {
@Id
@Column(name="id")
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
@Column(name="nombre")
private String nombre;
@Column(name="descripcion")
private String descripcion;

@ManyToMany
@JoinTable(name = "vehiculos_repuestos", joinColumns = {@JoinColumn(name="id")}, 
inverseJoinColumns = {@JoinColumn(name="matricula")})
private List<VehiculoPOJO>	vehiculos;

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
@Override
public String toString() {
	return "RepuestosPOJO [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
}


}
