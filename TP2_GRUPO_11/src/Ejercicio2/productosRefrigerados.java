package Ejercicio2;

import java.util.Date;

public class productosRefrigerados extends Producto {
	private int Codigo_Osa;
	
	public productosRefrigerados() {
		super();
		Codigo_Osa = 0000;
	}
	
	public productosRefrigerados(Date fechaCaducidad, int lote, int Codigo_Osa) {
		super(fechaCaducidad, lote);
		this.Codigo_Osa = Codigo_Osa;
	}

	@Override
	public String toString() {
		return "Producto refrigerado: FECHA CADUCIDAD:"+this.getFechaCaducidad()+", LOTE: "
        +this.getnumLote() + "CODIGO DE ORGANISMO DE SUPERVISION:"+ Codigo_Osa;
	}
	
}
