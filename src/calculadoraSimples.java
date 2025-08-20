import java.text.DecimalFormat;
import java.util.Scanner;

public class calculadoraSimples {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		double num1, num2, calculoTotal;
		int operador;
		
		
		System.out.println("""
		------ CALCULADORA ------
		1 - Adição
		2 - Subtração
		3 - Multiplicação
		4 - Divisão
		-------------------------- """);
		operador = sc.nextInt();
		
		System.out.println("Agora escolha o primeiro número:");
		num1 = sc.nextDouble();
		System.out.println("Agora escolha o segundo número:");
		num2 = sc.nextDouble();
		
		switch(operador) {
		case 1:
			calculoTotal = num1 + num2;
			System.out.printf(df.format(num1) + " + " + df.format(num2) + " = " + df.format(calculoTotal));
			break;
		case 2:
			calculoTotal = num1 - num2;
			System.out.printf(df.format(num1) + " - " + df.format(num2) + " = " + df.format(calculoTotal));
			break;
		case 3:
			calculoTotal = num1 * num2;
			System.out.printf(df.format(num1) + " X " + df.format(num2) + " = " + df.format(calculoTotal));
			break;
		case 4:
			calculoTotal = num1 / num2;
			System.out.printf(df.format(num1) + " / " + df.format(num2) + " = " + df.format(calculoTotal));
			break;
			
			default:
				System.out.println("Erro! Tente novamente.");
			break;
		}
		sc.close();
	}

}
