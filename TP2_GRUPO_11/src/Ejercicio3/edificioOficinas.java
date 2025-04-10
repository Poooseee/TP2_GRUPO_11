package Ejercicio3;

public class edificioOficinas extends Edificio {
	private int numeroOficinas;
	private double superficie;
	
	public edificioOficinas() {
		numeroOficinas = 0;
		superficie = 0.0;
	}
	public edificioOficinas(int numOficinas,double superficie) {
		this.numeroOficinas = numOficinas;
		this.superficie = superficie;
	}
	public String toString() {
		return "edificio de oficinas: superficie: "+superficie+", numero oficinas: "+numeroOficinas;
	}
	@Override
	public double getSuperficieEdificio() {
		// TODO Auto-generated method stub
		return 0;
	}
}
