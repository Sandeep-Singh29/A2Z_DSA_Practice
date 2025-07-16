package com.practice.interviewquestion.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Author: Sandeep Singh
 * Date: 12/07/25
 */

public class PlayerSortingByScoreThanName {

    public static void main(String[] args) {
        List<Player> players = Arrays.asList(
                new Player("Rahul", 200),
                new Player("Amit", 100),
                new Player("Sandeep", 200),
                new Player("Zara", 300)
        );

        List<Player> sortedPlayers = players.stream()
                .sorted(Comparator.comparingInt(Player::getScore).reversed()
                        .thenComparing(Player::getName))
                .toList();

        sortedPlayers.forEach(System.out::println);

        // Sorting using Collections.sort with custom comparator
        Collections.sort(players, (p1, p2) -> {
            // First compare score in descending order
            int scoreCompare = Integer.compare(p2.getScore(), p1.getScore());
            if (scoreCompare != 0) {
                return scoreCompare;
            }
            // If score is same, compare name in ascending order
            return p1.getName().compareTo(p2.getName());
        });
    }

    static final class Player {
        private int score;
        private String name;

        // constructor, getters, setters

        public Player(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public int getScore() {
            return score;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name + " - " + score;
        }
    }
}
