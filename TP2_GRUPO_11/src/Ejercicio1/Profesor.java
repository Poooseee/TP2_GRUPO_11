package Ejercicio1;

import java.util.Objects;

public class Profesor extends Empleado implements Comparable<Profesor>{
	private String cargo;
	private int antiguedadDocente;
	
	public Profesor() {
		super();
		this.cargo = "Sin cargo";
		this.antiguedadDocente = 0;
	}
	
	public Profesor(String nombre, int edad, String cargo, int antiguedadDocente) {
		super(nombre,edad);
		this.cargo = cargo;
		this.antiguedadDocente = antiguedadDocente;
	}
	
	@Override
	public int compareTo(Profesor profesor) {
		//ORDENADOS DE < A > POR ANTIGUEDAD
        if(profesor.antiguedadDocente==this.antiguedadDocente) {
        	return 0;
        }
        if(profesor.antiguedadDocente<this.antiguedadDocente) {
        	return 1;
        }
        else {
        	return -1;
        }
	}
	
	@Override
	public String toString() {
		return "Profesor ID="+this.getId()+", NOMBRE= "+this.getNombre()+
	", EDAD="+this.getEdad()+", cargo=" + cargo + ", antiguedadDocente=" + antiguedadDocente;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getAntiguedadDocente() {
		return antiguedadDocente;
	}

	public void setAntiguedadDocente(int antiguedadDocente) {
		this.antiguedadDocente = antiguedadDocente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(antiguedadDocente, cargo);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		return antiguedadDocente == other.antiguedadDocente && Objects.equals(cargo, other.cargo);
	}


	
}
	
