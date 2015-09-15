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
    // Variables

    // Static Array of 8 teams
    public static Team[] teams = new Team[8];

    // ArrayList that will hold 32 players
    public static List<Player> players = new ArrayList<Player>();

    // Static Array of 8 team names
    public static String[] teamNames = {"Dallas Cowboys", "New England Patriots",
        "Seattle Seahawks", "Oakland Raiders", "Greenbay Packers",
        "Pittsburgh Steelers", "San Francisco 49ers", "Denver Broncos"}; 

    // Static Array of 32 player names
    public static String[] playerNames = {"J.J. Watt", "Aaron Rodgers", 
        "Tom Brady", "DeMarco Murray", "Peyton Manning", "Calvin Johnson",
        "Andrew Luck", "Antonio Brown", "Marshawn Lynch", "Rob Gronkowski",
        "Richard Sherman", "Jamaal Charles", "Julio Jones", "Luke Kuechly", 
        "Dez Bryant", "Le'Veon Bell", "Darrelle Revis", "Jordy Nelson",
        "Patrick Peterson", "Demaryius Thomas", "Earl Thomas", 
        "Russell Wilson", "Joe Haden", "Joe Thomas", "Justin Houston",
        "Gerald McCoy", "LeSean McCoy", "Drew Brees", "Jimmy Graham", 
        "Von Miller", "Tony Romo", "Tyron Smith"};

    // Methods

    // Main method
    public static void main(String[] args) {
        // Create Array of 8 teams, each with a name
        createTeams();

        // Assign a winning % to each team randomly and rank accordingly
        rankTeams();

        // Populate ArrayList players and give each Player a random round #
        rankPlayers();
    }

    // Generates a random number between 1 and upperLimit
    public static int generateRandomNumber(int upperLimit) {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(upperLimit - 1) + 1;

        return randomInt;
    }

    // Creates an Array of 8 Team Objects and gives them each a name
    public static int createTeams() {
        // Populate Team[] teams with Team Objects using teamNames Array
        for (int i = 0; i < teams.length; i++) {
            teams[i] = new Team(teamNames[i]);
        }

        return 0;
    }

    // Ranks teams by random winning percentage and prints a table
    public static int rankTeams() {
        // Give each team a random winning percentage
        for (int i = 0; i < teams.length; i++) {
            // Generate random winning percentage
            int randomWinningPercentage = generateRandomNumber(100);

            // Set winning percentage using random value prev. generated
            int winningPercentage = 
                teams[i].setWinningPercentage(randomWinningPercentage);
        }


        // Sort teams by winning percentage
        Arrays.sort(teams);

        // Assign rank according to ascending winning percentage
        for (int i = 0; i < teams.length; i++) {
            teams[i].setRank(i + 1);
        }

        // Two-dimensional Array for printing table of teams and their ranks
        final Object[][] rankTable = new String[8][3];

        // Populate two-dimensional rankTable
        for (int i = 0; i < teams.length; i++) {
            rankTable[i] = new String[] {teams[i].getName(), 
                Integer.toString(teams[i].getRank()),
                Integer.toString(teams[i].getWinningPercentage())};
        }

        // Print informational message
        System.out.println("\nWelcome to the NFL Draft Pick!\n");
        System.out.println("Here are the statistics, including " +
            "each team's winning percentage from last season" +
            " and the corresponding draft rank:\n");

        // Format and print rankTable after printing table labels
        System.out.format("%-25s%-5s%-9s\n\n", "TEAM", "RANK", "WINNING %");
        for (final Object[] row : rankTable) {
            System.out.format("%-25s%-5s%-9s\n", row);
        }

        return 0;
    }

    // Instantiates ArrayList players and gives each Player a random round #
    public static int rankPlayers() {
        // Add each player name to ArrayList players as a new Player Object
        for (String playerName : playerNames) {
            // Instantiate each Player Object with a random number 1-4
            int randomRound = generateRandomNumber(4);
            players.add(new Player(playerName, randomRound));
        }

        return 0;
    }
}