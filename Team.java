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

public class Team implements Comparable<Team> {
    // Variables

    private String name; // Example: "Dallas Cowboys"
    private int winningPercentage; // Winning percentage, from 0-100
    private int rank; // Rank, possible values are 1-8
    private List<Player> draftPicks = new ArrayList<Player>(); // Total of 4

    // Constructor

    public Team(String name) {
        super();
        this.setName(name);
    }

    // Methods

    // Set name
    public String setName(String name) { // Set team name
        this.name = name;

        return name;
    }

    // Get name
    public String getName() {
        return this.name;
    }

    // Set winning %
    public int setWinningPercentage(int winningPercentage) {
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

    // Retrieve a team's winning percentage
    public int getWinningPercentage() { 
        return this.winningPercentage;
    }

    // Set a team's rank
    public int setRank(int rank) { 
        if (rank > 0 && rank < 9) {
            this.rank = rank;
            return rank;
        }
        else {
            System.out.println("Error: Rank must be between 1 and 8.");
            return -1;
        }
    }

    // Retrieve a team's rank
    public int getRank() { 
        return this.rank;
    }

    // Choose a draft pick
    public Player addDraftPick(Player draftPick) {
        if (this.draftPicks.size() <= 4) {
            this.draftPicks.add(draftPick);
        }
        else {
            System.out.println("Error: The " + this.name + " have already " +
                "chosen all four of their draft picks.");
        }

        return draftPick;
    }
	
	// Get a draft pick
	public Player getDraftPick(int playerIndex) {
		return draftPicks.get(playerIndex);
	}

    // Override compareTo method for proper implementation of Comparable
    public int compareTo(Team otherTeam) {
        return Integer.compare(this.getWinningPercentage(),
            otherTeam.getWinningPercentage());
    }
}