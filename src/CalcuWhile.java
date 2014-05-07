
import java.util.Scanner;

public class CalcuWhile {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Ingrese un numero 1: ");
		int num1 = s.nextInt();
		boolean operador_invalido=true;
		char operador = ' ';
		while (operador_invalido)
		{
			System.out.print("Ingrese un operador (+,/,*,-): ");
			operador = s.next().charAt(0);
			if (operador=='+')
			operador_invalido=false;
			if (operador=='-')
				operador_invalido=false;
			if (operador=='*')
				operador_invalido=false;
			if (operador=='/')
				operador_invalido=false;
			
		}
		
		System.out.print("Ingrese un numero2: ");
		int num2 = s.nextInt();
		switch (operador)
		{
		case '+' :
			System.out.print("Resultado: "+(num1+num2));
		break;
		
		case '-' :
			System.out.print("Resultado: "+(num1-num2));
		break;
		
		case '*' :
			System.out.print("Resultado: "+(num1*num2));
		break;
		
		case '/' :
			System.out.print("Resultado: "+(num1/num2));
		break;
		default:
			System.out.print("Operador Desconocido");
			break;
		}
	}

}
