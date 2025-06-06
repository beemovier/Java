import java.util.Scanner;
public class swichcase {
        public static class Robo{
            int motor=0;
            String cor;
            String nome; 
            String modelo;
            void corre(){
                if(motor==0){System.out.println("Robo correndo...");
                motor =1;}
                else System.out.println("ja estava correndo");
            }
            void caracteristicas(){
                System.out.println("Nome: "+nome+"\n Cor: "+cor+"\n Modelo: "+modelo+"\n Velocidade:"+motor);
            }}
    public static void main(String[] args){
        int recebe =0;
        int sair,escolha;
        Scanner entrada = new Scanner(System.in);
            Robo bao = new Robo();
            bao.nome="bao";
        bao.cor="azul"; bao.modelo="assassino";
         System.out.println("Ligar (1/0)");
        escolha=entrada.nextInt();
        if(escolha==1){
            bao.corre();
        while(true){
            System.out.println("escolha velocidade de 1 a 5");
            recebe= entrada.nextInt();
            switch(recebe){
                case 1:
                bao.motor=1;
                 bao.caracteristicas();
                break;
                case 2:
                bao.motor=2;
                 bao.caracteristicas();
                break;
                case 3:
                bao.motor=3;
                 bao.caracteristicas();
                break;
                case 4:
                bao.motor=4;
                 bao.caracteristicas();
                break;
                case 5:
                bao.motor=5;
                 bao.caracteristicas();
                default:
                bao.motor=1;
                 bao.caracteristicas();
                break;
            }
           
            System.out.println("Desligar? (1/0)");
            sair=entrada.nextInt();
            if(sair==1)break;
            
        }
            System.out.println("Desligando...");
        }
        
        }
        
    }
    
