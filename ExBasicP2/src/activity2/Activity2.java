package activity2;

import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {
	
		//Creo el escáner
		Scanner sc= new Scanner (System.in); 
		
		//Declaro las variables
		
		int edad;
		boolean edadmayor;
		
		
		//Solicito los datos
		System.out.print("Introduzca su edad y pulse Intro: ");
		edad=sc.nextInt();
		
		
		/*Ejecuto las instrucciones, en este caso, si es mayor de edad la consola mostrará true y 
		si es menor, false.*/
		edadmayor=edad>=18;
		
		//Mostramos el resultado
		System.out.println("Usted es mayor de edad: "+edadmayor);
		

		//Cerramos el escáner
		sc.close();
	
		
		
		

	}

}
