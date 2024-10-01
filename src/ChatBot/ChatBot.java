package ChatBot;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args){
        System.out.println("Hello! My name is VetaBot.\n" +
                "I was created in 2024.");
        Scanner scn = new Scanner(System.in);
        System.out.println("Please, remind me your name.");
        String username = scn.nextLine();
        System.out.println("What a great name you have, " + username + "!");
        Scanner num = new Scanner(System.in);
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int remainder3 = num.nextInt();
        int remainder5 = num.nextInt();
        int remainder7 = num.nextInt();
        int age = ((remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105);
        System.out.println("Your age is " + age + "; that`s a good time to start programming!");
    }
}
