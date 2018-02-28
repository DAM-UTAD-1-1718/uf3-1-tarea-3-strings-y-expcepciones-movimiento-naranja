package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

	public void suma(String cadena) throws Exceptionlongitud {
		int solucion = 0;
		String [] ArrStr = new String[cadena.length()];
		for (int i = 0; i < cadena.length(); i++) {
			ArrStr[i]=cadena.charAt(i)+"";
		}
		for (int j = 0; j < ArrStr.length; j++) {
			
			try {
				solucion+=Integer.parseInt(ArrStr[j]);
				
			} catch (Exception e) {

			}
		}
		if (solucion>20) {
			throw new Exceptionlongitud("Error fuera de rango: la suma es "+ solucion);
		}else
		System.out.println(solucion);
	}
	public class Exceptionlongitud extends Exception {
		public  Exceptionlongitud(String msg) {
			super(msg);
			
		}
	}

	public static void main(String[] args) throws Exceptionlongitud {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String entrada = in.next();
		ejercicio1 prueba = new ejercicio1();
		prueba.suma(entrada);
	}

}
