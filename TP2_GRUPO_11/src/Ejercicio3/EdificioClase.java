package Ejercicio3;

public abstract class EdificioClase {
	
    // Atributos
    private double superficieEdificio;

    // Setters y Getters
    public double getSuperficieEdificio() {
        return superficieEdificio;
    }

    public void setSuperficieEdificio(double superficieEdificioKm2) {
        this.superficieEdificio = superficieEdificioKm2;
    }

    // Constructores
    public EdificioClase() {
        superficieEdificio = 0;
    }

    public EdificioClase(double km) {
        this.superficieEdificio = km;
    }

    // ToString
    @Override
    public String toString() {
        return "La superficie del edificio es " + superficieEdificio + " km².";
    }
}
