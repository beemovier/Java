//Comparando valores de entrada
import java.util.Scanner;
public class obterClasse {
    public static void main(String[] args) {
        Integer inteiro = 3;
        
        if( inteiro.getClass().getName()== "java.lang.Integer"){
       System.out.println(inteiro.getClass().getName());
       System.out.println("Deu super certo");
        }
       
        
    }
}
