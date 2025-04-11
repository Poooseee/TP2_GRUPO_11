package Ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;

public class mainEjercicio3 {

	public static void main(String[] args) {
		
		// Crear la colección de tipo ArrayList
		ArrayList<Edificio> listaEdificios = new ArrayList<Edificio>();
		
		// Agregar 3 Polideportivos
		listaEdificios.add(new Polideportivo(1000.0, "Polideportivo Norte"));
		listaEdificios.add(new Polideportivo(800.0, "Polideportivo Sur"));
		listaEdificios.add(new Polideportivo(1200.5, "Polideportivo Centro"));
		
		// Agregar 2 Edificios de Oficinas
		listaEdificios.add(new edificioOficinas(10, 600.0));
		listaEdificios.add(new edificioOficinas(5, 350.0));
		
		// Usar un Iterator para recorrer y mostrar los atributos
		Iterator<Edificio> it = listaEdificios.iterator();
		
		while (it.hasNext()) {
			Edificio e = it.next();
			System.out.println(e.toString());
		}
	}
}

