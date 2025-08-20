import java.util.Scanner;

public class acessarSenha {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senha = 2002;
		int digitarSenha = sc.nextInt();;
		
		while(digitarSenha != senha) {
			System.out.println("Senha Inválida. Tente novamente!");
			digitarSenha = sc.nextInt();
		}
		
		System.out.println("Acesso liberado!");
		
		sc.close();
	}

}
