package pojo;

import java.util.List;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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


private List<VehiculoPOJO>	vehiculos;



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
