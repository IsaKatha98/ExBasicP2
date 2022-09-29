package activity5;

import java.util.Scanner;

public class Activity5 {
	
	public static void main(String[] args) {
	
	//Creo el escáner
	Scanner sc= new Scanner (System.in); 
	
	//Declaramos las variables
	
	int nota1;
	int nota2;
	int nota3;
	int notacal;
	double notaexp;
	
	//Solicitamos los datos
	System.out.print ("Introduzca su nota del 1º trimestre y pulse Intro: ");
	nota1=sc.nextInt();
	System.out.print ("Introduzca su nota del 2º trimestre y pulse Intro: ");
	nota2=sc.nextInt();
	System.out.print ("Introduzca su nota del 3º trimestre y pulse Intro: ");
	nota3=sc.nextInt();
	
	//Hacemos la media aritmética de las calificaciones (notas enteras)
	notaexp=(double) (nota1+nota2+nota3)/3;
	notacal= (nota1+nota2+nota3)/3;
	
	//Devuelvo el resultado
	System.out.println("Su nota media en el boletín será: "+notacal);
	System.out.print("Su nota media en el expediente será: "+ notaexp);
	
	/*Otra forma de hacerlo sería declarar una variable double "media", hacer el cálculo de la 
	 * media=(double)(nota1+nota2+nota3)/3 para la nota del expediente
	 * y luego imprimir la media con un (int) para la nota del boletín*/

	//Cerramos el escáner
	sc.close();
	
	}

}
