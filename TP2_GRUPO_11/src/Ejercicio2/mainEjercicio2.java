package Ejercicio2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class mainEjercicio2 {

	public static void main(String[] args) {
		Calendar fechaCadCong = Calendar.getInstance();
		fechaCadCong.set(2026, 8, 29);
		Calendar fechaCadFres = Calendar.getInstance();
		fechaCadFres.set(2025, 4, 16);
		Calendar fechaEnvFres = Calendar.getInstance();
		fechaEnvFres.set(2025, 4, 6);
		Calendar fechaCadRefri = Calendar.getInstance();
		fechaCadRefri.set(2025, 7, 8);
		
		ProductoCongelado pCong = new ProductoCongelado(fechaCadCong.getTime(), 145, -5.4f);
		ProductoFresco pFres = new ProductoFresco(fechaCadFres.getTime(), 293, fechaEnvFres.getTime(), "Argentina");
		ProductoRefrigerado pRefri = new ProductoRefrigerado(fechaCadRefri.getTime(), 89, 1122334455);
		
		System.out.println(pCong.toString() + "\n");
		System.out.println(pFres.toString() + "\n");
		System.out.println(pRefri.toString() + "\n");

	}

}
