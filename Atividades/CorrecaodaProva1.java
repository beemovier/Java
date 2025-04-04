/*Sabendo que um MB fixa é 1/6 do valor da movel, faça um algoritmo que receba o valor da internet, receba o valor do consumo da casa, exiba o valor do MB residencial, a fatura mensal, e depois exiba a fatura com um desconto de 25%
*/ 
import java.util.Scanner;
public class Main {
    public static void main (String[] args){
     Scanner scanner = new Scanner (System.in);
     float valorFixo, consumo,fatura,contaNet;
     int valorMovel;
     System.out.println("Escreva o valor do MB de internet movel: ");
    //ERRO 1 valorMovel = scanner.nextInt; // o scanner deve acompanhar o tipo de variável
    valorMovel = scanner.nextInt();
    System.out.println("Fornecer o consumo mensal da internet fixa, em MB: ");
    
    //ERRO 2   consumo = scanner.nextInt; // o mesmo erro
    consumo = scanner.nextFloat();
    valorFixo= valorMovel*1/6;
    fatura = consumo * valorFixo;
    
    //ERRO 3 
    //contaNet= fatura * 0.25f; // só calcula o valor da porcentagem não desconta da fatura
    contaNet= fatura - (fatura * 0.25f);
    
    //ERRO 4 System.out.println("Movel: R$" , valorMovel); // não se concatena com "," 
     System.out.println("Movel: R$" + valorMovel);
     System.out.println("Fixa: R$" + valorFixo);
     System.out.println("Fatura mensal: R$" + fatura);
     System.out.println("Fatura com desconto: R$" + contaNet);
     
    }
}
