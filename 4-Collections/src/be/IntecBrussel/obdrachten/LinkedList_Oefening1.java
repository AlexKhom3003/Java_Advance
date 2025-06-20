package be.IntecBrussel.obdrachten;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_Oefening1 {
    public static void main(String[] args) {
        ArrayList<String> fruits1  = new ArrayList<>();
        fruits1 .add("Apple");
        fruits1 .add("Banana");
        fruits1 .add("Orange");


        ArrayList<String> fruits2  = new ArrayList<>();
        fruits2 .add("Mango");
        fruits2 .add("Kiwi");
        fruits2 .add("Lemon");


        ArrayList<String> allFruits = new ArrayList<>();
        allFruits.addAll(fruits1 );
        allFruits.addAll(fruits2 );

        LinkedList<String> list = new LinkedList<>(allFruits);
        for(String fruit : list){
            System.out.println(fruit);
        }
    }
}
