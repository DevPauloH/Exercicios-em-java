import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá! Escolha um número e esse sistema irá responder se é par ou impar:");
		int numeroDeEscolha = sc.nextInt();
		
		int resto = numeroDeEscolha % 2;
		
		if(resto == 0) {
			System.out.println("Esse número é par!");
		} else {
			System.out.println("Esse número é impar!");
		}
		
		sc.close();

	}

}
