import java.util.Scanner;

public class exer4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // ENTRADA DE DADOS
       float aumento;
       float salario;
       float novoSalario;
       char confirmacao;

       // PROCESSAMENTO
        // Solicita o salario e le o valor digitado
        System.out.print("Digite o salario do funcionario: R$");
        salario = entrada.nextFloat(); // Usa float para o salario

        
        // Calcula o aumento de 25%
        aumento = salario * 0.25f;
        novoSalario = salario + aumento; // Novo salario com aumento

        // Exibe o valor do aumento e pede confirmação
        System.out.println("O aumento de 25% seria: R$" + aumento);
        System.out.print("Confirmar aumento? (S para sim / N para nao): ");
        confirmacao = entrada.next().charAt(0); // Lê a confirmação

        // SAiDA
        if (confirmacao == 'S' || confirmacao == 's') {
            // Se confirmado, o salario é atualizado com o aumento
            System.out.println("\nSalario original: R$" + salario);
            System.out.println("Aumento: R$" + aumento);
            System.out.println("Novo salario com aumento de 25% e: R$" + novoSalario);
        } else if (confirmacao == 'N' || confirmacao == 'n'){
            // Se não confirmado, exibe o salario original sem alteração
            System.out.println("\nSalario original: R$" + salario);
            System.out.println("Aumento nao confirmado. O salario permanece: R$" + salario);
        }
        else{ 
            System.out.println("\nCATASTROFIC ERROR");
        }

        // Fecha o scanner
        entrada.close();
    }
}
