package ChatBot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args){
        System.out.println("Hello! My name is VetaBot.\n" +
                "I was created in 2024.");
        Scanner scn = new Scanner(System.in);
        System.out.println("Please, remind me your name.");
        String username = scn.nextLine();
        System.out.println("What a great name you have, " + username + "!");
    }
}
