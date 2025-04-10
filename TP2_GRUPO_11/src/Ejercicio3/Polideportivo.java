package Ejercicio3;

public class Polideportivo extends EdificioClase implements InstalacionDeportiva{
	private String nombre;
	
	//CONSTRUCTORES
	Polideportivo(){
		super(0.0);
		this.nombre = "sin nombre";
	}
	Polideportivo(int superficie, String nombre){
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
		return "Polideportivo - Nombre: " + nombre + " - Superficie: " + super.getSuperficieEdificio();
	}
	
	@Override
	public String getTipoDeInstalacion() {
		return "Polideportivo";
	}
}
