import java.util.Scanner;

public class Exer8 {

    // //ENTRADA: Declaração de variáveis
    static float SalarioMinimo;    // Variável para armazenar o valor do salário mínimo
    static int qtdKw;              // Variável para armazenar a quantidade de kWh consumidos
    static float valorKw;          // Variável para armazenar o valor de 1 kWh
    static float valorConsumido;   // Variável para armazenar o valor total a ser pago pela residência
    static float valorCDesconto;   // Variável para armazenar o valor total com desconto de 15%

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // //ENTRADA: Solicita e lê os dados do usuário
        System.out.print("Digite o valor do salario minimo: R$");
        SalarioMinimo = scanner.nextFloat();  // Lê o valor do salário mínimo

        System.out.print("Digite a quantidade de kw consumidos: ");
        qtdKw = scanner.nextInt();  // Lê a quantidade de kWh consumidos pela residência

        // //PROCESSAMENTO: Realiza os cálculos necessários
        valorKw = SalarioMinimo / 500;  // Calcula o valor de 1 kWh
        valorConsumido = valorKw * qtdKw;  // Calcula o valor total a ser pago pela residência
        valorCDesconto = valorConsumido - (valorConsumido * 0.15f);  // Calcula o valor com desconto de 15%

        // //SAIDA: Exibe os resultados calculados
        System.out.println("Valor de 1 kWh: R$" + valorKw);
        System.out.println("Valor a ser pago pela residencia: R$" + valorConsumido);
        System.out.println("Valor a ser pago com desconto de 15%: R$" + valorCDesconto);

        scanner.close();
    }
}
