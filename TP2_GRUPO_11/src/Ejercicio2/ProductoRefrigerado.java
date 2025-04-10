package Ejercicio2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class ProductoRefrigerado extends Producto {
	private int Codigo_Osa;
	
	//Constructores
	public ProductoRefrigerado() {
		super();
		Codigo_Osa = 0000;
	}
	
	public ProductoRefrigerado(Date fechaCaducidad, int lote, int Codigo_Osa) {
		super(fechaCaducidad, lote);
		this.Codigo_Osa = Codigo_Osa;
	}

		//Getters y Setters
	public int getCodigo_Osa() {
		return Codigo_Osa;
	}

	public void setCodigo_Osa(int codigo_Osa) {
		Codigo_Osa = codigo_Osa;
	}
	
	//ToString
	@Override
	public String toString() {
		return  "Tipo: REFRIGERADO \n"
				+"Fecha de caducidad:" + super.formato.format(getFechaCaducidad())+"\n"
				+"Numero de lote:" + super.getnumLote()+"\n"
				+"Codigo de Supervision Alimentaria: " + Codigo_Osa;
	}
	
	
}
