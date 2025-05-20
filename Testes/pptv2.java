import java.util.Random;
import java.util.Scanner;

public class pptv2 {
    public static void main(String[] args) throws InterruptedException { //throws Interrup... emite erros quando não funciona bem
        Scanner scanner = new Scanner(System.in); 
        Random sorteio = new Random();
        int playerVitorias = 0, botVitorias = 0, playerEscolha, botEscolha;
        String[] escolhas = {"Pedra", "Papel", "Tesoura"}; //cri

        for (int round = 1; round <= 3; round++) { //laço de 3  repetições
            System.out.println("Round " + round + " - Escolha:");
            System.out.println("1 - Pedra");
            System.out.println("2 - Papel");
            System.out.println("3 - Tesoura");
            
            while (true) {
                System.out.print("Sua escolha: ");
                if (scanner.hasNextInt()) {//confere entrada inteiro
                    playerEscolha = scanner.nextInt();//se for escreve na variavel playerEscolha
                    if (playerEscolha >= 1 && playerEscolha <= 3) break;//sai do laco
                } else {//se for qualquer outro numero
                    scanner.next(); // Limpa entrada invalida 
                }
                System.out.println("Entrada invalida! Escolha de 1 a 3.");
            }

            System.out.println("Voce escolheu: " + escolhas[playerEscolha - 1]);// -1 por que o array começa em zero
            Thread.sleep(2000);//congela 2 seg
            System.out.println("Aguardando jogada do bot...");
            Thread.sleep(2000);//congela 2 seg
            
            botEscolha = sorteio.nextInt(3) + 1; //sorteia a 'escolha do bot' de 0 a 2 e soma +1 pra ficar de 1 a 3, dps salva na variavel botescolha
            System.out.println("Bot escolheu: " + escolhas[botEscolha - 1]);//faz o contrario para localizar no array
            Thread.sleep(1000);//stop 1000

            if ((playerEscolha == 1 && botEscolha == 3) ||
                (playerEscolha == 2 && botEscolha == 1) ||
                (playerEscolha == 3 && botEscolha == 2)) {
                playerVitorias++;
            } else if (playerEscolha != botEscolha) {
                botVitorias++;
            }

            if (round < 3) {
                System.out.println("Proximo round...");
                Thread.sleep(500);
            }
        }

        if (playerVitorias == botVitorias) {
            System.out.println("\nEMPATE! REPESCAGEM!");
            Thread.sleep(1000);
            System.out.println("Round Extra - Escolha:");
            System.out.println("1 - Pedra");
            System.out.println("2 - Papel");
            System.out.println("3 - Tesoura");
            
            while (true) {
                System.out.print("Sua escolha: ");
                if (scanner.hasNextInt()) {
                    playerEscolha = scanner.nextInt();
                    if (playerEscolha >= 1 && playerEscolha <= 3) break;
                } else {
                    scanner.next();
                }
                System.out.println("Entrada invalida! Escolha entre 1, 2 ou 3.");
            }
            
            System.out.println("Voce escolheu: " + escolhas[playerEscolha - 1]);
            Thread.sleep(2000);
            System.out.println("Aguardando jogada do bot...");
            Thread.sleep(2000);
            
            botEscolha = sorteio.nextInt(3) + 1;
            System.out.println("Bot escolheu: " + escolhas[botEscolha - 1]);
            Thread.sleep(1000);

            if ((playerEscolha == 1 && botEscolha == 3) ||
                (playerEscolha == 2 && botEscolha == 1) ||
                (playerEscolha == 3 && botEscolha == 2)) {
                playerVitorias++;
            } else if (playerEscolha != botEscolha) {
                botVitorias++;
            }
        }

        if (playerVitorias > botVitorias) {
            System.out.println("\nYOU WIN!");
        } else {
            System.out.println("\nGAME OVER!");
        }

        scanner.close();
    }
}