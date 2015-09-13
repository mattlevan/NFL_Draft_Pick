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
 * Team.java
 * Team class. 
 *
 */

import java.util.*;

public class Team {
    // Variables

    private String name; // Example: "Dallas Cowboys"
    private int winningPercentage; // Winning percentage, from 0-100
    private int rank; // Rank, possible values are 1-8
    private List<Player> draftPicks = new ArrayList<Player>(); // Total of 4

    // Constructor

    public Team(String name) {
        this.setName(name);
    }

    // Methods

    public String setName(String name) { // Set team name
        this.name = name;

        return name;
    }

    public String getName() {
        return this.name;
    }

    public int setWinningPercentage(int winningPercentage) { // Set winning %
        if (winningPercentage >= 0 && winningPercentage <= 100) {
            this.winningPercentage = winningPercentage;
            return winningPercentage;
        }
        else {
            System.out.println("Error: Winning percentage must be between 0 " +
                "and 100.");
            return -1;
        }
    }

    public int getWinningPercentage() { // Retrieve a team's winning percentage
        return this.winningPercentage;
    }

    public int setRank(int rank) { // Set a team's rank
        if (rank > 0 && rank < 9) {
            this.rank = rank;
            return rank;
        }
        else {
            System.out.println("Error: Rank must be between 1 and 8.");
            return -1;
        }
    }

    public int getRank() { // Retrieve a team's rank
        return this.rank;
    }

    public Player addDraftPick(Player draftPick) { // Choose a draft pick
        if (this.draftPicks.size() <= 4) {
            this.draftPicks.add(draftPick);
        }
        else {
            System.out.println("Error: The " + this.name + " have already " +
                "chosen all four of their draft picks.");
        }

        return draftPick;
    }
}