/*Faça um algoritmo em inglês que leia a altura e o sexo 
de uma pessoa, calcule e mostre seu peso ideal.
 Sabendo que: */
 //Para homens: (72.7 * altura) - 58
//Para mulheres: (62.1 * altura) - 44.7
import java.util.Scanner;

public class atividade9 {
    /**
     * @param banana
     */
    public static void main(String[] banana) {
        Scanner input = new Scanner(System.in);
        double height, idealWeight;

        // Entrada de dados
        System.out.print("Escreva sua altura (em metros): ");
        height = input.nextDouble();
        System.out.print("Escreva seu sexo (M/F): ");
        char gender = input.next().toUpperCase().charAt(0);//
        //char.at(0) pega o primeiro caractere da string
        // Processamento de dados
        if(gender =='M') {
            idealWeight = (72.7 * height) - 58;
        } else{
            idealWeight = (62.1 * height) - 44.7;
        }
        // Saída de dados
        System.out.printf("Seu peso ideal seria: ", idealWeight); //o código não vai mostrar erros se inserir o valor errado
        System.out.printf("%.2f kg\n", idealWeight); // %.2f formata o número para mostrar duas casas decimais
        input.close();
    }

    @Override
    public String toString() {
        return "atividade9 []";
    }
}

// A entrada de dados é feita através do Scanner, e a saída é formatada para mostrar duas casas decimais.   
// O código utiliza a classe Scanner para ler a altura e o sexo do usuário,
// O código também converte a entrada do sexo para maiúsculas
//O system in é um fluxo de entrada padrão em Java, que geralmente é o teclado.
// system out é um fluxo de saída padrão em Java, que geralmente é o console.
// o string[] é um array de strings, que é uma estrutura de dados que pode armazenar várias strings.
 // e o args é um array de strings que contém os argumentos de linha de comando passados para o programa.
 //quando escrevemos o código, o java cria um array de strings chamado args, que contém os argumentos passados para o programa.
 // O código é um exemplo simples de como usar condicionais em Java para calcular o peso ideal com base na altura e no sexo da pessoa.
// O código utiliza a classe Scanner para ler a altura e o sexo do usuário,
//char não é feito só pra armazenar letras, mas também pode armazenar números e símbolos. 
//posso armazenar no char até 255 números diferentes. mas apenas um por vez.
// string não é feito só pra armazenar letras, mas também pode armazenar números e símbolos.
//posso armazenar no string até 2 bilhões strings diferentes. mas apenas um por vez.
//short armazena números inteiros de -32.768 a 32.767.
//int armazena números inteiros de -2.147.483.648 a 2.147.483.647.
//long armazena números inteiros de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807.
//float armazena números decimais de -3.40282347E+38 a 3.40282347E+38.
//double armazena números decimais de -1.79769313486231570E+308 a 1.79769313486231570E+308.


