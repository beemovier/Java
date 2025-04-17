/*Faça um algoritmo que leia a altura e o sexo 
de uma pessoa, calcule e mostre seu peso ideal.
 Sabendo que: */
 //Para homens: (72.7 * altura) - 58
//Para mulheres: (62.1 * altura) - 44.7
import java.util.Scanner;

public class atividade9 {
    
    public static void main(String[] args) {
        double altura, pesoIdeal;
        char sexo;
        Scanner escreve = new Scanner(System.in);
        
        System.out.println("Digite a altura: ");
        altura = escreve.nextDouble();
        
        System.out.println("Digite o sexo (M/F): ");
        sexo = escreve.next().toUpperCase().charAt(0);
        // Converte o caractere para maiúsculo para evitar problemas de comparação
        
        if(sexo=='M'){
            pesoIdeal = (72.7 * altura) - 58;
            System.out.println("O peso ideal seria: " + pesoIdeal);
        }else if(sexo=='F'){
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("O peso ideal seria: " + pesoIdeal);
        }else{
            System.out.println("Sexo invalido.");
        }
        
        escreve.close();
    }
}
