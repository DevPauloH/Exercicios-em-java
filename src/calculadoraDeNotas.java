import java.text.DecimalFormat;
import java.util.Scanner;

public class calculadoraDeNotas {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.0");
		
		double notaUnidade1 = 0;
		double notaUnidade2 = 0;
		
		System.out.println("Calculadora de Notas - Situação do Aluno:");
		
		System.out.println("Digite a nota da primeira unidade:");
		notaUnidade1 = sc.nextDouble();
		
		System.out.println("Digite a nota da segunda unidade:");
		notaUnidade2 = sc.nextDouble();
		
		if(notaUnidade1 < 0 || notaUnidade1 > 10 || notaUnidade2 < 0 || notaUnidade2 > 10) {
			System.out.println("Nota inválida. Digite valores entre 0 e 10!");
		}else {
			double mediaNotas = (notaUnidade1 + notaUnidade2) / 2;
			
			System.out.println("Sua média foi: " + df.format(mediaNotas));
			System.out.println("Sua situação atual é:");
			
			if(mediaNotas >= 7) {
				System.out.println("---APROVADO!---");
			} else if(mediaNotas >= 4 && mediaNotas < 7) {
				System.out.println("---RECUPERAÇÃO!---");
			} else {
				System.out.println("---REPROVADO---!");
			}
		}
		sc.close();
	}

}
