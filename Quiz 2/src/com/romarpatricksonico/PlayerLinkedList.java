package com.romarpatricksonico;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Objects;

public class PlayerLinkedList {
    private PlayerNode head;

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    public void printList(){
        PlayerNode current = head;
        System.out.println("Head -> ");
        while (current != null) {
            System.out.println(current.getPlayer());
            System.out.println(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }

  public int size(){
      PlayerNode temp=head;
      int size = 0;
      while(temp!=null)
      {
          temp=temp.getNextPlayer();
          size++;
      }
      return size;
  }

    public boolean removeFirst() {
        if (head == null) {
            return false;
        }
        else {
            if (head == head.getNextPlayer()) {
                head = null;
            } else {
                head = head.getNextPlayer();
            }
        }
        return false;
    }

}
