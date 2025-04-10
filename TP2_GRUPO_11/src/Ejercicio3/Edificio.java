package Ejercicio3;

public abstract class Edificio {
	private double Superficie;
	
	public Edificio() {
		this.Superficie = 0.0;
	}
	
	public Edificio(double Superficie) {
		this.Superficie = Superficie;
	}
	
	public double getSuperficie() {
		return Superficie;
	}

	public void setSuperficie(double superficie) {
		Superficie = superficie;
	}

	public abstract double getSuperficieEdificio();
}
