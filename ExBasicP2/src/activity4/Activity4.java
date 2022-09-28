package activity4;

import java.util.Scanner;

public class Activity4 {
	
	public static void main(String[] args) {
	
	//Creo el escáner
	Scanner sc= new Scanner (System.in); 
	
	//Declaramos las variables
	boolean llueve;
	boolean tareas;
	boolean biblio;
	
	//Solicitamos la información
	System.out.print("¿Está lloviendo? Responda true o false y pulse Intro: ");
	llueve= sc.hasNextBoolean();
	System.out.print("¿Ha terminado su tarea? Responda true o false y pulse Intro: ");
	tareas= sc.hasNextBoolean();
	System.out.print("¿Debe ir a la biblioteca? Responda true o false y pulse Intro:");
	biblio=sc.hasNextBoolean();
	
	//En el caso de que neguemos la lluvia (!), y 
	

	//Cerramos el escáner
	sc.close();
	

	}

}
