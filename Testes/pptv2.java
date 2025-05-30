import java.util.Random;
import java.util.Scanner;

public class Pptv2 {

    static void pausa(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // boa prática
        }
    }

    public static void main(String[] args) throws InterruptedException { // throws Interrup... emite erros quando não
                                                                         // funciona bem
        Scanner scanner = new Scanner(System.in);
        Random sorteio = new Random();
        int playerVitorias = 0, botVitorias = 0, playerEscolha, botEscolha;
        String[] Escolhas = { "Pedra", "Papel", "Tesoura" }; // cri

        for (int jogada = 1; jogada <= 3; jogada++) { // laço de 3 repetições
            System.out.println("jogada " + jogada + " - Escolha:");
            System.out.println("1 - Pedra");
            System.out.println("2 - Papel");
            System.out.println("3 - Tesoura");

            while (true) {
                System.out.print("Sua escolha: ");
                if (scanner.hasNextInt()) {// confere entrada inteiro
                    playerEscolha = scanner.nextInt();// se for escreve na variavel playerEscolha
                    if (playerEscolha >= 1 && playerEscolha <= 3)
                        break;// sai do laco
                } else {// se for qualquer outro numero
                    scanner.next(); // Limpa entrada invalida
                }
                System.out.println("Entrada invalida! Escolha de 1 a 3.");
            }

            System.out.println("Voce escolheu: " + Escolhas[playerEscolha - 1]);// -1 por que o array começa em zero
            pausa(2000);// congela 2 seg
            System.out.print("Bot pensando");
            for (int i = 0; i < 3; i++) {
                pausa(500);
                System.out.print(".");
            }
            System.out.println(); // pula linha

            botEscolha = sorteio.nextInt(3) + 1; // sorteia a 'escolha do bot' de 0 a 2 e soma +1 pra ficar de 1 a 3,
                                                 // dps salva na variavel botescolha
            System.out.println("Bot escolheu: " + Escolhas[botEscolha - 1]);// faz o contrario para localizar no array
            pausa(1000);// stop 1000

            if ((playerEscolha == 1 && botEscolha == 3) ||
                    (playerEscolha == 2 && botEscolha == 1) ||
                    (playerEscolha == 3 && botEscolha == 2)) {
                playerVitorias++;
            } else if (playerEscolha != botEscolha) {
                botVitorias++;
            }

            if (jogada < 3) {
                System.out.println("Proximo jogada...");
                pausa(500);
            }
        }

        if (playerVitorias == botVitorias) {
            System.out.println("\nEMPATE! REPESCAGEM!");
            pausa(1000);
            System.out.println("jogada Extra - Escolha:");
            System.out.println("1 - Pedra");
            System.out.println("2 - Papel");
            System.out.println("3 - Tesoura");

            while (true) {
                System.out.print("Sua escolha: ");
                if (scanner.hasNextInt()) {
                    playerEscolha = scanner.nextInt();
                    if (playerEscolha >= 1 && playerEscolha <= 3)
                        break;
                } else {
                    scanner.next();
                }
                System.out.println("Entrada invalida! Escolha entre 1, 2 ou 3.");
            }

            System.out.println("Voce escolheu: " + Escolhas[playerEscolha - 1]);
            pausa(2000);
            System.out.println("Aguardando jogada do bot...");
            System.out.print("Bot pensando");
            for (int i = 0; i < 3; i++) {
                pausa(500);
                System.out.print(".");
            }
            System.out.println(); // pula linha

            botEscolha = sorteio.nextInt(3) + 1;
            System.out.println("Bot escolheu: " + Escolhas[botEscolha - 1]);
            pausa(1000);

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