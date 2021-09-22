package com.romarpatricksonico;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int min = 1;
        int max = 5;
        int round = 1;
        int stackSize = 30;
        int discardedSize = 0;
        CardStack stack = new CardStack(30);
        Scanner scanner = new Scanner(System.in);

        //List of the cards
        stack.push(new Card(1, "hearts"));
        stack.push(new Card(2, "diamonds"));
        stack.push(new Card(3, "clovers"));
        stack.push(new Card(4, "spades"));
        stack.push(new Card(5, "hearts"));
        stack.push(new Card(6, "diamonds"));
        stack.push(new Card(7, "clovers"));
        stack.push(new Card(8, "spades"));
        stack.push(new Card(9, "hearts"));
        stack.push(new Card(10, "diamonds"));
        stack.push(new Card(11, "hearts"));
        stack.push(new Card(12, "diamonds"));
        stack.push(new Card(13, "clovers"));
        stack.push(new Card(14, "spades"));
        stack.push(new Card(15, "hearts"));
        stack.push(new Card(16, "diamonds"));
        stack.push(new Card(17, "clovers"));
        stack.push(new Card(18, "spades"));
        stack.push(new Card(19, "hearts"));
        stack.push(new Card(20, "diamonds"));
        stack.push(new Card(21, "hearts"));
        stack.push(new Card(22, "diamonds"));
        stack.push(new Card(23, "clovers"));
        stack.push(new Card(24, "spades"));
        stack.push(new Card(25, "hearts"));
        stack.push(new Card(26, "diamonds"));
        stack.push(new Card(27, "clovers"));
        stack.push(new Card(28, "spades"));
        stack.push(new Card(29, "hearts"));
        stack.push(new Card(30, "diamonds"));

        //printing the first stack
        stack.printStack();
        System.out.println();

        while(stack.isEmpty() == false) {

            //user inputs
            System.out.println("To draw, press the number 1 :D");
            int a = scanner.nextInt();
            System.out.println();

            //Round counter
            System.out.println("Round: " + round);


            if (a == 1) {

                //Random Logic & Discard counter
                int x = (int) (Math.random() * (max - min + 1) + min);
                System.out.println("Discarded " + x + " cards!");

                //for loop for how many cards to discard
                for (int i = 1; i <= x; i++) {
                    System.out.println(stack.pop().getCardName());
                }

                //Remaining Cards and Total Discards
                stackSize = stackSize - x;
                discardedSize = discardedSize + x;
                System.out.println("Remaining cards: " + stackSize);
                System.out.println("Total Discarded Cards: " + discardedSize);
                System.out.println();
                stack.printStack();

                System.out.println();
                round++;

            }

            //to politely tell the player to press 1
            else
            {
                System.out.println("I think you meant to put 1");
            }

        }

        System.out.println("You have emptied the card");

    }
}
