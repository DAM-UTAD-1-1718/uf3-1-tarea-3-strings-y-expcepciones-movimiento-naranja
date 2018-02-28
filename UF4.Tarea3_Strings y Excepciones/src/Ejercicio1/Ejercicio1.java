package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public void suma(String cadena){
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
		System.out.println(solucion);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String entrada = in.next();
		Ejercicio1 prueba = new Ejercicio1();
		prueba.suma(entrada);
	}

}
