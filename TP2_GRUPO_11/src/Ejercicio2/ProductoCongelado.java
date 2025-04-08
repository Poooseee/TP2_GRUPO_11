package Ejercicio2;

import java.util.Date;

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
	
	//ToString
	@Override
	public String toString() {
		return super.toString()+
				"Tipo: CONGELADO \n"
				+"Temperatura de congelamiento: " + temperaturaCongelamiento;
	}
}
