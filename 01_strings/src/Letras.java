import java.util.Scanner;

public class Letras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce una letra: ");
		int a = leer.nextInt();
		
		System.out.println("Introduce otra letra: ");
		int b = leer.nextInt();
		
		if(a > b){
			System.out.println("A es mayor que B");
		}else{
			if(a < b){
				System.out.println("A es menor que B");
			}else{
				System.out.println("A y B son iguales");
			}
		}
	}

}
