import java.util.Scanner;
//Ler dois valores inteiros e apresentar a diferença do maior pelo menor. Supor que não sejam iguais
public class atividade4{ //criou uma classe publica
   
public static void main(String[] args){
    int a, b;
Scanner ent = new Scanner(System.in);
while (true) {
    try{
System.out.println("da um numero ou letra ai: ");
a = ent.nextInt();
System.out.println("da outro numero ou letra ai: ");
b = ent.nextInt();
a= a+b;
System.err.println("deu merda "+ a +" vezes!");
break;
} catch(Exception e){
    System.out.println("inteiro não é letra, burro!\n\n\n\n\n\n");
    ent.nextLine();
}

}
ent.close();
}

}