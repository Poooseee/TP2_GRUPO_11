package Ejercicio2;

import java.util.Date;

public class Producto {
	
	//Atributos
	private Date fechaCaducidad;
	private int numLote;
	
	//Constructor con Parametros
	public Producto(Date fechaCaducidad, int lote) {
		this.fechaCaducidad = fechaCaducidad;
		this.numLote = lote;
	}
	
	
	//Constructor Vacio
	public Producto() {};
	
	//Getters y Setters
	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public int getnumLote() {
		return numLote;
	}
	public void setNumLote(int lote) {
		numLote = lote;
	}
	
	//metodo toString para mostrar
	@Override
	public String toString() {
		return "Fecha de Caducidad: " + fechaCaducidad + "\n"+
				"Numero de Lote=" + numLote +"\n";
	}
}
