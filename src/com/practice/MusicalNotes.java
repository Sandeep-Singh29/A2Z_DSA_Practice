package com.practice;

import java.util.Random;

public class MusicalNotes {

    public static void main(String[] args) {
        String[] notes = {"sa", "ra", "ga", "ma", "pa", "dha", "ni", "SA``"};
        Random random = new Random();
        while (true) {
            int randomIndex = random.nextInt(notes.length);
            System.out.println(notes[randomIndex]);
            try {
                Thread.sleep(6000);
            } catch (Exception e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }

}
