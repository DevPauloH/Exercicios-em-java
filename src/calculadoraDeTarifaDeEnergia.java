import java.text.DecimalFormat;
import java.util.Scanner;

public class calculadoraDeTarifaDeEnergia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        String tipoConsumidor;
        int kwh = 0;
        double valorTotal = 0;

        System.out.println("----------Calculadora de Tarifas de Energia----------");

        System.out.println("Qual seu tipo de consumidor?\n"
                + "Digite: \"R\" para Residencial;\n"
                + "Digite: \"C\" para Comercial;\n"
                + "Digite: \"I\" para Industrial.");
        tipoConsumidor = sc.next();

        if (tipoConsumidor.equalsIgnoreCase("R") || 
            tipoConsumidor.equalsIgnoreCase("C") || 
            tipoConsumidor.equalsIgnoreCase("I")) {
            
            System.out.println("Qual foi o consumo em kWh (quilowatt-hora)?");
            kwh = sc.nextInt();

            if (kwh >= 0) {
                if (tipoConsumidor.equalsIgnoreCase("R")) {
                    if (kwh <= 500) {
                        valorTotal = 0.40 * kwh;
                    } else {
                        valorTotal = 0.65 * kwh;
                    }
                } else if (tipoConsumidor.equalsIgnoreCase("C")) {
                    if (kwh <= 1000) {
                        valorTotal = 0.55 * kwh;
                    } else {
                        valorTotal = 0.60 * kwh;
                    }
                } else if (tipoConsumidor.equalsIgnoreCase("I")) {
                    if (kwh <= 5000) {
                        valorTotal = 0.55 * kwh;
                    } else {
                        valorTotal = 0.62 * kwh;
                    }
                }

                System.out.println("O total de tarifa de energia é: R$" + df.format(valorTotal));
            } else {
                System.out.println("Valor de kWh inválido. Digite números a partir de 0.");
            }

        } else {
            System.out.println("Tipo de consumidor inválido.");
        }

        sc.close();
    }
}
