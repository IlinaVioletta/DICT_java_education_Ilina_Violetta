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
        Scanner num = new Scanner(System.in);
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int remainder3 = num.nextInt();
        int remainder5 = num.nextInt();
        int remainder7 = num.nextInt();
        int age = ((remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105);
        System.out.println("Your age is " + age + "; that`s a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want!");
        int number = num.nextInt();
        for (int i = 0; i<=number; i++){
            System.out.println(i + "!");
        }
        System.out.println("""
                        Let's test your programming knowledge.
                        What data type is used for integer values in Java?
                        1.String
                        2.int
                        3.double
                        4.boolean""");

        while (true){
            int answer = num.nextInt();
            if (answer == 2){
                System.out.println("Correct\n" +
                        "Goodbye, have a nice day!");
                break;
            } else {
                System.out.println("Wrong, try again");
            }
        }
    }
}
