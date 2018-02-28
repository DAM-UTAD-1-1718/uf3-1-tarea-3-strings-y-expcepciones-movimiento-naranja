package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	 
	String texto="\n";
	String txt="";
 
	public static void main(String args[]) {
		new Ejercicio2();
	}
 
    public Ejercicio2() {
    	leerArchivo();
    	guardarArchivo();
    }
 
    private void leerArchivo()
   {
         Scanner sc = new Scanner(System.in);
		   while (( texto = sc.nextLine() ) != null) 
		      System.out.println(texto);
 
		   texto = sc.toString();
		   System.out.println(texto);
 
		   texto = texto.toUpperCase();
		   System.out.println("\n" +texto);
   }
 
   private void guardarArchivo()
   {
	   	try { 
		    Scanner sc = new Scanner(texto);
		    System.out.println(txt);
		    while ((txt = sc.nextLine()) != null) 
			System.out.println(txt);
		} catch (Exception e) { 
		    System.out.println("Final de Stream");
		}
   }
 
}