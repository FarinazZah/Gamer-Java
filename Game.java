// I worked on the homework assignment alone, using only course materials.
public class Game {
    private String name;
    private GameGenre genre;
    private double costMultiplier;
    private int popularity;
    private static int totalGames = 0;

    public Game(String name, GameGenre genre, double costMultiplier, int popularity) {
        this.name = name;
        this.genre = genre;
        this.costMultiplier = costMultiplier;
        this.popularity = popularity;
        totalGames += 1;
    }

    public Game(String initName, GameGenre initGenre) {
        this (initName, initGenre, 1, 0);
    }

    public static int getTotalGames() {
        return totalGames;
    }

    public String getName() {
        return name;
    }

    public GameGenre getGenre() {
        return genre;
    }

    public double getCostMultiplier() {
        return costMultiplier;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setCostMultiplier(double newCostMultiplier) {
        if (newCostMultiplier < 0) {
            costMultiplier = 0;
        } else {
            costMultiplier = newCostMultiplier;
        }
    }

    public void increasePopularity() {
        popularity += 1;
    }

    public void increasePopularity(int amountToIncreaseBy) {
        if (amountToIncreaseBy < 0) {
            popularity = popularity;
        } else {
            popularity += amountToIncreaseBy;
        }
    }

    public double gameCost() {
        return costMultiplier * genre.getBaseGameCost();
    }

    public String toString() {
        double gameCost = costMultiplier * genre.getBaseGameCost();
        return String.format("%s is a %s game. It has a popularity level of %d, and costs $%.2f",
                name, genre.getGenre(), popularity, gameCost);
    }

    public void hostCompetitiveTournament(Gamer[] gamers) {
        boolean allGamersOwnTheGame = true;
        for (Gamer gamer : gamers) {
            if (!gamer.ownsGame(this)) {
                allGamersOwnTheGame = false;
                break;
            }
        }

        if (!allGamersOwnTheGame) {
            System.out.println("We cannot host the tournament, not all gamers have the game!");
            return;
        }
        if (gamers.length < 2) {
            popularity -= 5;
            if (popularity < 0) {
                popularity = 0;
            }
        } else {
            popularity += 10;
            for (Gamer gamer : gamers) {
                gamer.playGame(this);
            }
            Gamer winner = gamers[0];
            for (Gamer gamer : gamers) {
                if (gamer.getSkillLevel() > winner.getSkillLevel()) {
                    winner = gamer;
                }

            }
            System.out.println(winner.getName() + " wins the tournament!");
        }
    }
}
