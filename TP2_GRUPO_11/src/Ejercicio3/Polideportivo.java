package Ejercicio3;

public class Polideportivo extends Edificio implements instalacionDeportiva{
	private String nombre;
	
	//CONSTRUCTORES
	Polideportivo(){
		super(0.0);
		this.nombre = "sin nombre";
	}
	Polideportivo(Double superficie, String nombre){
		super(superficie);
		this.nombre = nombre;
	}

	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//toString
	@Override
	public String toString() {
		return "Polideportivo - Nombre: " + nombre + " - Superficie: " + getSuperficieEdificio();
	}
	
	@Override
	public String getTipoDeInstalacion() {
		return "Polideportivo";
	}
	@Override
	public double getSuperficieEdificio() {
		return 0; //COMPLETAR
	}
}
