import java.util.Scanner;
public class Inteiros {
    
    public static void main(String[] args) {
         short a,b,c;

        Scanner inp = new Scanner(System.in);
        System.out.println("Por favor, um inteiro: ");
        int v = System.in.read();
        System.out.println("Mais um: ");
        b=inp.nextShort();
        System.out.println("Só mais um");
        c=inp.nextShort();
        //sabendo os metodos dos tipos facilita
        if(a!=b && b!=c && c!=a){
             if(a>c&&c>b){
                 System.out.println(a+" o maior") ;
                  if(a<c&&c<b){
                       System.out.println(b+" o menor");
                  }
                  if(a>b&&b>c){
                       
                  }
             }
        }else{
             
         if(a>b && b>c);
        }
         
        
    }
    
}