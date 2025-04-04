package Ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class mainEjercicio1_a {

	public static void main(String[] args) {
		ArrayList<Profesor> listaProf = new ArrayList<Profesor>();
		
		listaProf.add(new Profesor("Alicia", 35, "Catedratico", 10));
		listaProf.add(new Profesor("Bruno", 45, "Adjunto", 15));
		listaProf.add(new Profesor("Carlose", 50, "Titular", 20));
		listaProf.add(new Profesor("Diana", 40, "Auxiliar", 8));
		listaProf.add(new Profesor("Evelin", 30, "Docente", 5));

		Iterator<Profesor> iterador = listaProf.iterator();
        
        while (iterador.hasNext()) {
            Profesor profesor = iterador.next();
            System.out.println(profesor.toString());
        }
	}

}
