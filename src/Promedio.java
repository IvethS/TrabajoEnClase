
import java.util.Scanner;
public class Promedio {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Ingrese nota 1: ");
		int nota1 = s.nextInt();
		System.out.print("Ingrese nota 2: ");
		double nota2 = s.nextDouble();
		System.out.print("Ingrese nota 3: ");
		int nota3 = s.nextInt();
		
		System.out.print("Promedio; "+(nota1+nota2+nota3)/3);

	}

}
