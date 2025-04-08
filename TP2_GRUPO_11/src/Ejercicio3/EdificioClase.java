package Ejercicio3;

public abstract class EdificioClase {
	
    // Atributos
    private double superficieEdificioKm2;

    // Setters y Getters
    public double getSuperficieEdificioKm2() {
        return superficieEdificioKm2;
    }

    public void setSuperficieEdificioKm2(double superficieEdificioKm2) {
        this.superficieEdificioKm2 = superficieEdificioKm2;
    }

    // Constructores
    public EdificioClase() {
        superficieEdificioKm2 = 0;
    }

    public EdificioClase(double km) {
        this.superficieEdificioKm2 = km;
    }

    // ToString
    @Override
    public String toString() {
        return "La superficie del edificio es " + superficieEdificioKm2 + " km².";
    }
}
