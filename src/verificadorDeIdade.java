import java.util.Scanner;

public class verificadorDeIdade {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int idade = 0;
		
		System.out.println("Olá! Vamos verificar se está apto a votar!");
		System.out.println("Qual a sua idade atualmente?");

		idade = sc.nextInt();
		
		if(idade >= 18 && idade <= 70){
			System.out.println("VOTO OBRIGATÓRIO!");
		} else if(idade == 16 || idade == 17 || idade > 70){
			System.out.println("VOTO FACULTATIVO!");
		} else {
			System.out.println("SEM PERMISSÃO PARA VOTAR!");
		}
		sc.close();
	}
}
