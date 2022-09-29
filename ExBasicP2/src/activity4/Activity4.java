package activity4;

import java.util.Scanner;

public class Activity4 {
	
	public static void main(String[] args) {
	
	//Creo el escáner
	Scanner sc= new Scanner (System.in); 
	
	//Declaramos las variables
	boolean llueve; //Nos dice si llueve o no
	boolean tareas; //Nos dice si he hecho la tarea
	boolean biblio; //Nos dice si hay que ir a la biblioteca
	boolean salir; //Nos dirá si podemos salir
	
	//Solicitamos la información
	System.out.print("¿Está lloviendo? ");
	llueve= sc.hasNextBoolean();
	System.out.print("¿Ha terminado su tarea? Responda true o false y pulse Intro: ");
	tareas= sc.hasNextBoolean();
	System.out.print("¿Debe ir a la biblioteca? Responda true o false y pulse Intro: ");
	biblio=sc.hasNextBoolean();
	
	//
	salir= (!llueve && tareas || biblio); 
	
	//Devolvemos el resultado
	
	System.out.println("Usted saldrá: "+salir);
	

	//Cerramos el escáner
	sc.close();
	

	}

}
