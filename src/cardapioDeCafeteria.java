import java.util.Scanner;

public class cardapioDeCafeteria {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeroPedido;
		
		System.out.println("""
				Boas vindas a cafeteria!
				------- CARDÁPIO -------
				1 - Café         R$ 3,50
				2 - Capuccino    R$ 4,50
				3 - Chá          R$ 2,50
				4 - Chocolate    R$ 5,00
				------------------------
				Qual será o seu pedido?
				Escolha o número do item desejado: """);
		numeroPedido = sc.nextInt();
		
		switch(numeroPedido){
		case 1:
			System.out.println("""
					---- Pedido Anotado! ----
					      Café  R$ 3,50
					-------------------------
					""");
			break;
		
		case 2:
			System.out.println("""
					----- Pedido Anotado! -----
					     Capuccino R$ 4,50
					---------------------------
					""");
			break;
		
		case 3:
			System.out.println("""
					---- Pedido Anotado! ----
					      Chá   R$ 2,50
					-------------------------
					""");
			break;
			
		case 4:
			System.out.println("""
					----- Pedido Anotado! -----
					    Chocolate   R$ 5,00
					---------------------------
					""");
			break;
			
		default:
				System.out.println("Opção inválida. Tente novamente.");
				break;
		}
		sc.close();
	}

}
