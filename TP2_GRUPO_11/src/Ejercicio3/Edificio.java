package Ejercicio3;

public abstract class Edificio {
	
	//atributos
	private double superficieEdificio;

	//contructores
	public Edificio() {
		this.superficieEdificio = 0.0;
	}

    public Edificio(double km) {
        this.superficieEdificio = km;
    }

	//getters y setter
	public double getSuperficieEdificio() {
		return superficieEdificio;
	}

	public void setSuperficieEdificio(double superficieEdificio) {
		this.superficieEdificio = superficieEdificio;
	}

    // ToString
    @Override
    public String toString() {
        return "La superficie del edificio es " + superficieEdificio + " km².";
    }

	public String getTipoDeInstalacion() {
		// TODO Auto-generated method stub
		return null;
	}
}
