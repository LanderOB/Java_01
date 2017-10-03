import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		//Creamos un objeto para leer del teclado
		Scanner lector = new Scanner(System.in);
		System.out.println("Escribe tu nombre:");
		//Leemos del teclado
		String nombre = lector.nextLine();
		
		System.out.println("Escribe tu apellido:");
		String apellido1 = lector.nextLine();
		
		System.out.println("Escribe tu segundo apellido:");
		String apellido2 = lector.nextLine();
		//Concatenacion de strings (Hola+apellido1+apellido2+nombre)
		System.out.println("Hola " + apellido1 + " " + apellido2 + " " + nombre);
		
		System.out.println("¿Que edad tienes?");
		int edad = lector.nextInt();
		
		if(edad>=18){
			System.out.println("Es mayor de edad");
		}
		else{
			System.out.println("Es menor de edad");
		}
		
	}

}