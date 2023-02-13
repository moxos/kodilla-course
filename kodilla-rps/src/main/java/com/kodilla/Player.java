package com.kodilla;

import java.util.Scanner;

public class Player {
    String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String playerChoice() {
        Scanner name = new Scanner(System.in);
        String choice = name.nextLine();
        return choice;
    }

    public boolean playerChoiceStartNew(String a) {
        boolean b = Boolean.parseBoolean(null);
            System.out.println("Are you sure you want to quit and start new game? T/N");
            Scanner name = new Scanner(System.in);
            String choiceQuit = name.nextLine();
            if (choiceQuit.equals("T")) {
                b = true;
                System.out.println("Closing an old game");
            } else if (choiceQuit.equals("N")) {
                b = false;
            }
        return b;
    }
}

