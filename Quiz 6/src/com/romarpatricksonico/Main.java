package com.romarpatricksonico;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(25);
        tree.insert(17);
        tree.insert(29);
        tree.insert(10);
        tree.insert(16);
        tree.insert(-5);
        tree.insert(60);
        tree.insert(55);

        tree.traverseInOrderDescending();
        System.out.println();
        System.out.println("Found: " + tree.get(25));
        System.out.println();
        System.out.println("The Minimum Number: " + tree.getMin().getData());
        System.out.println("The Maximum Number: " + tree.getMax().getData());





    }
}
