package Ejercicio2;
import java.util.Date;

public class ProductoFresco extends Producto {
  private Date fechaEnvasado;
  private String paisOrigen;
  
  // CONSTRUCTORES
  public ProductoFresco() {
	  super();
	  fechaEnvasado = new Date(); // fecha actual
	  paisOrigen = "sin especificar";
  }
  
  public ProductoFresco(Date fechaCaducidad, int lote,Date fechaEnvasado,String paisOrigen) {
	  super(fechaCaducidad,lote);
	  this.fechaEnvasado = fechaEnvasado;
	  this.paisOrigen = paisOrigen;
  }
  
  //Getters y Setters
  public Date getFechaEnvasado() {
	  return fechaEnvasado;
  }
  public void setFechaEnvasado(Date fechaEnvasado) {
	  this.fechaEnvasado = fechaEnvasado;
  }
  public String getPaisOrigen() {
	  return paisOrigen;
  }
  public void setPaisOrigen(String paisOrigen) {
	  this.paisOrigen = paisOrigen;
  }
  
  //ToString
	@Override
	public String toString() {
		return super.toString()+
				"Tipo: FRESCO \n"
				+"Fecha de Envasado: "+ fechaEnvasado +"\n"
				+"Pais de Origen: "+paisOrigen;
	}
  
}
