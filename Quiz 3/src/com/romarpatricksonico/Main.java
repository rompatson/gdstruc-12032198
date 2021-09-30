package com.romarpatricksonico;

import javax.swing.plaf.basic.BasicBorders;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int round = 1;
        Random rand = new Random();
        int max = 7;
        int min = 1;


        ArrayQueue queue = new ArrayQueue(50);

        queue.add(new Player(1, "Rom", 10));
        queue.add(new Player(2, "Pat", 15));
        queue.add(new Player(3, "Son", 20));
        queue.add(new Player(4, "Mar", 25));
        queue.add(new Player(5, "Rick", 30));
        queue.add(new Player(6, "Nico", 35));
        queue.add(new Player(7, "Ali", 40));
        queue.add(new Player(8, "Na", 45));
        queue.add(new Player(9, "Qui", 50));
        queue.add(new Player(10, "Nones", 55));
        queue.add(new Player(11, "Jen", 10));
        queue.add(new Player(12, "Lud", 15));
        queue.add(new Player(13, "Wig", 20));
        queue.add(new Player(14, "Disguised", 25));
        queue.add(new Player(15, "Toast", 30));
        queue.add(new Player(16, "Corpse", 35));
        queue.add(new Player(17, "Siomai", 40));
        queue.add(new Player(18, "Maki", 45));
        queue.add(new Player(19, "Poutine", 50));
        queue.add(new Player(20, "Vladimir", 55));
        queue.add(new Player(21, "California", 10));
        queue.add(new Player(22, "Meow", 15));
        queue.add(new Player(23, "Cat", 20));
        queue.add(new Player(24, "Tina", 25));
        queue.add(new Player(25, "Kitten", 30));
        queue.add(new Player(26, "Dream", 35));
        queue.add(new Player(27, "Nightmare", 40));
        queue.add(new Player(28, "Pew", 45));
        queue.add(new Player(29, "Die", 50));
        queue.add(new Player(30, "Pie", 55));
        queue.add(new Player(31, "Techno", 10));
        queue.add(new Player(32, "Blade", 15));
        queue.add(new Player(33, "Mr", 20));
        queue.add(new Player(34, "Beast", 25));
        queue.add(new Player(35, "White", 30));
        queue.add(new Player(36, "Black", 35));
        queue.add(new Player(37, "Green", 40));
        queue.add(new Player(38, "Gray", 45));
        queue.add(new Player(39, "Silver", 50));
        queue.add(new Player(40, "Gold", 55));
        queue.add(new Player(41, "Razer", 10));
        queue.add(new Player(42, "Mercury", 15));
        queue.add(new Player(43, "Pink", 20));
        queue.add(new Player(44, "Red", 25));
        queue.add(new Player(45, "Shark", 30));
        queue.add(new Player(46, "Slardar", 35));
        queue.add(new Player(47, "Naga", 40));
        queue.add(new Player(48, "Haarper", 45));
        queue.add(new Player(49, "Archon", 50));
        queue.add(new Player(50, "Demon", 55));



        for (int i = 0; i < 10; i++) {

            System.out.println("Round: " + round);
            System.out.println("Start Queue? Yes or No\n");

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            System.out.println("Starting Queue");

            int x = rand.nextInt(max-min) + min;
            for (i = 0; i < 1; i++) {
                System.out.println("There are " + x + " players in queue");
            }

            if (x >= 5) {
                round++;

                System.out.println();
                System.out.println("Matchmaking found for these players");
                for (i = 0; i < 5; i++) {
                    System.out.println(queue.remove());
                }
                System.out.println();

                if (round == 11) {
                    break;
                }
            }
        }


    }
}
