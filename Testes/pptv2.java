import java.util.Random;
import java.util.Scanner;

public class pptv2 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int playerWins = 0, botWins = 0, playerChoice, botChoice;
        String[] escolhas = {"Pedra", "Papel", "Tesoura"};

        for (int round = 1; round <= 3; round++) {
            System.out.println("Round " + round + " - Escolha:");
            System.out.println("1 - Pedra");
            System.out.println("2 - Papel");
            System.out.println("3 - Tesoura");
            
            while (true) {
                System.out.print("Sua escolha: ");
                if (scanner.hasNextInt()) {
                    playerChoice = scanner.nextInt();
                    if (playerChoice >= 1 && playerChoice <= 3) break;
                } else {
                    scanner.next(); // Limpa entrada invalida
                }
                System.out.println("Entrada invalida! Escolha entre 1, 2 ou 3.");
            }

            System.out.println("Voce escolheu: " + escolhas[playerChoice - 1]);
            Thread.sleep(2000);
            System.out.println("Aguardando jogada do bot...");
            Thread.sleep(2000);
            
            botChoice = random.nextInt(3) + 1;
            System.out.println("Bot escolheu: " + escolhas[botChoice - 1]);
            Thread.sleep(1000);

            if ((playerChoice == 1 && botChoice == 3) ||
                (playerChoice == 2 && botChoice == 1) ||
                (playerChoice == 3 && botChoice == 2)) {
                playerWins++;
            } else if (playerChoice != botChoice) {
                botWins++;
            }

            if (round < 3) {
                System.out.println("Proximo round...");
                Thread.sleep(500);
            }
        }

        if (playerWins == botWins) {
            System.out.println("\nEMPATE! REPESCAGEM!");
            Thread.sleep(1000);
            System.out.println("Round Extra - Escolha:");
            System.out.println("1 - Pedra");
            System.out.println("2 - Papel");
            System.out.println("3 - Tesoura");
            
            while (true) {
                System.out.print("Sua escolha: ");
                if (scanner.hasNextInt()) {
                    playerChoice = scanner.nextInt();
                    if (playerChoice >= 1 && playerChoice <= 3) break;
                } else {
                    scanner.next();
                }
                System.out.println("Entrada invalida! Escolha entre 1, 2 ou 3.");
            }
            
            System.out.println("Voce escolheu: " + escolhas[playerChoice - 1]);
            Thread.sleep(2000);
            System.out.println("Aguardando jogada do bot...");
            Thread.sleep(2000);
            
            botChoice = random.nextInt(3) + 1;
            System.out.println("Bot escolheu: " + escolhas[botChoice - 1]);
            Thread.sleep(1000);

            if ((playerChoice == 1 && botChoice == 3) ||
                (playerChoice == 2 && botChoice == 1) ||
                (playerChoice == 3 && botChoice == 2)) {
                playerWins++;
            } else if (playerChoice != botChoice) {
                botWins++;
            }
        }

        if (playerWins > botWins) {
            System.out.println("\nYOU WIN!");
        } else {
            System.out.println("\nGAME OVER!");
        }

        scanner.close();
    }
}