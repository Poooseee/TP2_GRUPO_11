package Ejercicio2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class ProductoCongelado extends Producto {
	private float temperaturaCongelamiento;
	
	//Constructores
	public ProductoCongelado() {
		super();
		this.temperaturaCongelamiento = 0;
	}
	public ProductoCongelado(Date fechaCaducidad, int lote, float temperaturaCongelamiento) {
		super(fechaCaducidad, lote);
		this.temperaturaCongelamiento = temperaturaCongelamiento;
	}
	
	//Getter y Setters
	public float getTemperaturaCongelamiento() {
		return temperaturaCongelamiento;
	}
	public void setTemperaturaCongelamiento(float temperaturaCongelamiento) {
		this.temperaturaCongelamiento = temperaturaCongelamiento;
	}
	//ToString
	@Override
	public String toString() {
		return  "Tipo: CONGELADO \n"
				+"Fecha de caducidad:" + super.formato.format(getFechaCaducidad())+"\n"
				+"Numero de lote:" + super.getnumLote()+"\n"
				+"Temperatura de congelamiento: " + temperaturaCongelamiento + "°";
	}
}
