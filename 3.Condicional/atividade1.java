/*Faça um algoritmo que
 * e se ele for maior que 20 imprimir a sua metade
 */

import java.util.Scanner;
public class atividade1 {
   
    public static void main(String[] args) {
		int num; //variavel inteiro
		double metade; //será a metade do número
		System.out.println("Digite um numero inteiro: ");
        Scanner escreve = new Scanner(System.in);

		num = escreve.nextInt();
		metade = num*0.5;
		if(num>20){
			
			System.out.println("A metade do numero: " + metade);
		}else{
			System.out.println("Numero menor que 20");
		}
		
		escreve.close();
    }
}