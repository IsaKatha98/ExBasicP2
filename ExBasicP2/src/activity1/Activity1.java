package activity1;

	import java.util.Scanner;

	public class Activity1 {

		public static void main(String[] args) {
			
			//Creo el escáner
			Scanner sc= new Scanner (System.in); 
			
			//Declaro las variables
			
			final double preciomanzanas=2.35;
			final double precioperas= 1.95;
			double manzanas;
			double peras;
			double total;
					
			//Le pido al usuario que introduzca los números y los guardo
			System.out.print("Introduzca los kilos de manzanas/semestre y pulse Intro: ");
			manzanas =sc.nextDouble();
			System.out.print("Introduzca los kilos de peras/semestre y pulse Intro: ");
			peras=sc.nextDouble();
			
			//Instruciones
			manzanas*=preciomanzanas;
			peras*=precioperas;
			total= manzanas+peras;
			
			//Devuelvo el resultado
			System.out.print("Este semestre ha ganado un total de "+total+" euros.");
			
			//Cerramos el escáner
			sc.close();
			

		}

	}



