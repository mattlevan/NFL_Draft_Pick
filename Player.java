/*
 * NFL Draft Pick
 * 
 * Matt Levan
 *
 * Project 1
 * CSC 311 Data Structures
 * Dr. Amlan Chatterjee
 *
 * Simulate a limited version of the draft process, involving 8 teams and 32
 * players. Pick any 8 teams from the actual NFL and 32 players of your choice.
 *
 * Player.java
 * Player class.
 *
 */

import java.util.*;

public class Player {
    // Variables

    private String name; // Example: "Mark McGuire"
    private int round; // Round # (1-4) which the player may be picked

    // Constructor

    public Player(String name, int round) {
        this.setName(name);
        this.setRound(round);
    }

    // Methods

    public String setName(String name) {
        this.name = name;

        return name;
    }

    public String getName() {
        return this.name;
    }

    public int setRound(int round) {
        this.round = round;

        return round;
    }

    public int getRound() {
        return this.round;
    }
}