package com.kodilla;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        Processor processor = new Processor();
        boolean end = false;
        while(!end){
            processor.game();
            System.out.println("******** Main Menu ******");
            System.out.println("Please enter 'n' to play new game, 'x' if you want finish");
            Scanner choice = new Scanner(System.in);
            String endChoice = choice.nextLine();
            if(endChoice.equals("n")){
                end = false;
            }else if(endChoice.equals("x")){
                end = true;
            }
        }


    }
}
