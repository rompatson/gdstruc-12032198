package com.romarpatricksonico;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Player heathcliff = new Player (1, "Heathcliff", 999);
        Player asuna = new Player (2,"Asuna", 100);
        Player lethalBacon = new Player (3,"LethalBacon", 205);
        Player hpDeskjet = new Player (4,"HPDeskjet", 34);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(heathcliff);
        playerLinkedList.addToFront(asuna);
        playerLinkedList.addToFront(lethalBacon);
        playerLinkedList.addToFront(hpDeskjet);

        playerLinkedList.printList();

        System.out.println();
        System.out.println("Number of elements");
        System.out.println(playerLinkedList.size());
        System.out.println();

        System.out.println();
        System.out.println("Removing first player");
        playerLinkedList.removeFirst();
        System.out.println();

        System.out.println();
        System.out.println("Number of elements");
        System.out.println(playerLinkedList.size());
        System.out.println();




   }
}
