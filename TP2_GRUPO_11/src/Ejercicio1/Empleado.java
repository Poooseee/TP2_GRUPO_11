package Ejercicio1;

import java.util.Objects;

public class Empleado{
	private final int id;
	private String nombre;
	private int edad;
	
	private static int cont = 999;
	
	public Empleado() {
		
		cont++;
		this.id = cont;
		this.nombre = "Sin Nombre";
		this.edad = 99;
	}
	
	public Empleado(String nombre, int edad) {
		cont++;
		this.id = cont;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public int getId() {
		return id;
	}
	
	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//METODOS ESTATICOS
	public static String devolverProximoId() {
		return "El proximo ID será : "+ (cont + 1);
	}
	
	//TO STRING
	@Override
	public String toString() {
		return "Empleado id=" + id + ", nombre=" + nombre + ", edad=" + edad ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(edad, id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return edad == other.edad && id == other.id && Objects.equals(nombre, other.nombre);
	}
}
