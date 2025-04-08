package Ejercicio3;

public class Edificio {
	
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
    public Edificio() {
        superficieEdificioKm2 = 0;
    }

    public Edificio(double km) {
        this.superficieEdificioKm2 = km;
    }

    // ToString
    @Override
    public String toString() {
        return "La superficie del edificio es " + superficieEdificioKm2 + " km².";
    }
}
