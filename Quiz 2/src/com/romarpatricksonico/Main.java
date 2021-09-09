package com.romarpatricksonico;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Player> playerList = new ArrayList<>();

        playerList.add(new Player (1, "Heathcliff", 999));
        playerList.add(new Player (2,"Asuna", 100));
        playerList.add(new Player (3,"LethalBacon", 205));
        playerList.add(new Player (4,"HPDeskjet", 34));

        System.out.println("Number of elements");
        System.out.println(playerList.size());
        System.out.println();

        playerList.forEach(player -> System.out.println(player));
        System.out.println();

        //added .getName() for a cleaner approach
        System.out.println("Gets first element as a name");
        System.out.println(playerList.get(0).getName());
        System.out.println();

        System.out.println("Adds new player Arctis ");
        playerList.add(3, new Player(553, "Arctis", 55));
        playerList.forEach(player -> System.out.println(player));
        System.out.println();
        System.out.println("Number of elements");
        System.out.println(playerList.size());
        System.out.println();

        System.out.println("Removes first element");
        playerList.remove(0);
        playerList.forEach(player -> System.out.println(player));
        System.out.println();

        System.out.println("If it contains a the player LethalBacon");
        System.out.println(playerList.contains(new Player(3, "LethalBacon", 205)));
        System.out.println();

        System.out.println("The index of LethalBacon");
        System.out.println(playerList.indexOf(new Player(3, "LethalBacon", 205)));
        System.out.println();

        playerList.forEach(player -> System.out.println(player));
        System.out.println();
        System.out.println("Number of elements");
        System.out.println(playerList.size());
        System.out.println();


   }
}
