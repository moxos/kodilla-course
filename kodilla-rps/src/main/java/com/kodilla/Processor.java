package com.kodilla;
import java.util.Scanner;

public class Processor {
    public void game() {
        System.out.println("******** Welcome to the game: rock-paper-scissors ********");
        System.out.println("Please provide your name:");
        Scanner name = new Scanner(System.in);
        String playerNick = name.nextLine();
        Player player = new Player(playerNick);
        System.out.println("Please provide number of rounds:");
        Scanner numberOfRounds = new Scanner(System.in);
        int rounds = numberOfRounds.nextInt();
        System.out.println(rounds);
        System.out.println("Settings \n 1 - Rock \n 2 - Paper \n 3 - Scissors \n x - end game \n n - Start again" + "\n");

        System.out.println("Game started:");
        System.out.println("Please enter your choice:");

        int round = 0;
        int result = 0;
        int result1 = 0;
        boolean n = false;
        for(int i = 0; i >= round; i++){
            round++;
            System.out.println("Round number:" + round);
            String playerChoice = player.playerChoice();
            System.out.println("Player" + player.getName() + " choose " + playerChoice);
            Computer computer = new Computer();
            String number = computer.getRandom();
            if (playerChoice.equals(number)) {
                result = result;
                result1 = result1;
            } else if (playerChoice.equals("1") && number.equals("2")) {
                result = result + 1;
                result1 = result1;
            } else if (playerChoice.equals("1") && number.equals("3")) {
                result = result;
                result1 = result1 + 1;
            } else if (playerChoice.equals("2") && number.equals("1")) {
                result = result;
                result1 = result1 + 1;
            } else if (playerChoice.equals("2") && number.equals("3")) {
                result = result + 1;
                result1 = result1;
            } else if (playerChoice.equals("3") && number.equals("1")) {
                result = result;
                result1 = result1 + 1;
            } else if (playerChoice.equals("3") && number.equals("2")) {
                result = result;
                result1 = result1 + 1;
            } else if (playerChoice.equals("n")) {
                n = player.playerChoiceStartNew(playerChoice);
            } else if (playerChoice.equals("x")) {
                n = true;

            }
            System.out.println("Player result: " + result + " Computer result: " + result1);

            if(result == rounds || result1 == rounds || n == true){
                break;
            }

        }
        System.out.println("\n");
        System.out.println("Final results: ");
        System.out.println("Player result: " + result + " Computer result: " + result1);
        if (result == result1) {
            System.out.println("Draw");
        } else if (result > result1) {
            System.out.println("Player " + player.getName() + " win");

        } else {
            System.out.println("Computer win");
        }

    }
}

















