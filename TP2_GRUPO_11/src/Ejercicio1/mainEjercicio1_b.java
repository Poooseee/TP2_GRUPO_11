package Ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

public class mainEjercicio1_b {

	public static void main(String[] args) {
//		TreeSet<Profesor> listaProfesores = new TreeSet<Profesor>();
//		
//		listaProfesores.add(new Profesor("Rodrigo", 28, "Auxiliar", 2));
//		listaProfesores.add(new Profesor("Gabriela", 28, "Docente", 28));
//		listaProfesores.add(new Profesor("Fabio", 28, "Titular", 16));
//		listaProfesores.add(new Profesor("Abril", 28, "Catedratico", 32));
//		listaProfesores.add(new Profesor("Matias", 28, "Adjunto", 9));
//		
//		Iterator<Profesor> it = listaProfesores.iterator();
//		
//		while(it.hasNext()) {
//			Profesor prof = it.next();
//			System.out.println(prof.toString());
//		}
		
		//PUNTO 7
		Profesor prof1 = new Profesor();
		prof1.setNombre("Agustin");
		prof1.setEdad(28);
		prof1.setCargo("Docente");
		prof1.setAntiguedadDocente(10);
		
		Profesor prof2 = new Profesor();
		prof2.setNombre("Agustin");
		prof2.setEdad(28);
		prof2.setCargo("Docente");
		prof2.setAntiguedadDocente(10);
		
		
		if(prof1.equals(prof2)) {
			System.out.println("Es el mismo Profesor");
		}
	}
}