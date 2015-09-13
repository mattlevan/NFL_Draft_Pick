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
 * Draft.java
 * Driver class for NFL Draft Pick program.
 *
 */

import java.util.*;

public class Draft {
    public static void main(String[] args) {
        // Array of 8 NFL teams
        Team[] teams = new Team[8];

        // List of 8 team names
        String[] teamNames = {"Dallas Cowboys", "New England Patriots",
            "Seattle Seahawks", "Oakland Raiders", "Greenbay Packers",
            "Pittsburgh Steelers", "San Francisco 49ers", "Denver Broncos"};

        // Populate Array teams with Team objects constructed with teamNames
        for (int i = 0; i < 8; i++) {
            teams[i] = new Team(teamNames[i]);
        }
    }
}