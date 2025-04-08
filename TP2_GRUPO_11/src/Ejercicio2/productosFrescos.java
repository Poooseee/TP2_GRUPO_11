package Ejercicio2;
import java.util.Date;

public class productosFrescos extends Producto {
  private Date fechaEnvasado;
  private String paisOrigen;
  
  // CONSTRUCTORES
  public productosFrescos() {
	  super();
	  fechaEnvasado = new Date(); // fecha actual
	  paisOrigen = "sin especificar";
  }
  public productosFrescos(Date fechaCaducidad, int lote,Date fechaEnvasado,String paisOrigen) {
	  super(fechaCaducidad,lote);
	  this.fechaEnvasado = fechaEnvasado;
	  this.paisOrigen = paisOrigen;
  }
@Override
public String toString() {
	return "producto Fresco: FECHA CADUCIDAD: "+this.getFechaCaducidad()+", LOTE: "
			+this.getnumLote()+", FECHA ENVASADO: "+fechaEnvasado+", PAIS: "+paisOrigen;
}
  
  
}
