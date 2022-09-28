package activity3;

import java.util.Scanner;

public class Activity3 {

	public static void main(String[] args) {
		
		//Creo el escáner
		Scanner sc= new Scanner (System.in); 
		
		//Declaro las variables, hemos declarado un String en vez de un boolean 
		int num;
		String numpar;
		
		//Solicito los datos
		System.out.print("Introduzca un número y pulse Intro: ");
		num=sc.nextInt();
		
		
		/*Indicamos que num debe ser par*/
		
		num %=2;
		
		/*Ahora hacemos una condicional en la que preguntamos si num es igual que 0. Si lo es, numpar será 
		true; y si no lo es, será false.*/
		
		numpar=num==0 ? "sí":"no";
		
		//Devolvemos el resultado
		System.out.println("El número es par: "+numpar);
		
		//Cerramos el escáner
		sc.close();

	}

}
