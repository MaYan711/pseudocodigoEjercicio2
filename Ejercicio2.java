import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args){
		Scanner scanner =  new Scanner(System.in);
		int num;

		System.out.print("Los numeros de abajo son: ");
		num = scanner.nextInt();

		for(int i = 1; i < num; i++){
			System.out.println("\n" + (num - i));
		}
	}
}