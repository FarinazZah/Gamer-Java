//I worked on the homework assignment alone, using only course materials.
public class Gamer {
    private String name;
    private int skillLevel;
    private double money;
    private Game[] ownedGames;
    private Game lastPlayedGame;
    private static final int INITIAL_MONEY = 500;

    public Gamer(String name, int skillLevel, double money, Game[] ownedGames, Game lastPlayedGame) {
        this.name = name;
        this.skillLevel = skillLevel;
        this.money = money;
        this.ownedGames = ownedGames;
        this.lastPlayedGame = lastPlayedGame;
    }

    public Gamer(String initName, int initSkillLevel) {
        this(initName, initSkillLevel, INITIAL_MONEY, new Game[0], null);
    }

    public Gamer(String initName) {
        this(initName, 0);
    }

    public String getName() {
        return name;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public double getMoney() {
        return money;
    }

    public Game getLastPlayedGame() {
        return lastPlayedGame;
    }

    public Game[] getOwnedGames() {
        return ownedGames;
    }

    public void setName(String newName) {
        if (newName != null) {
            name = newName;
        }
    }

    public boolean ownsGame(Game game) {
        if (game == null) {
            return false;
        }
        for (Game ownedGame : ownedGames) {
            if (ownedGame == game) {
                return true;
            }
        }
        return false;
    }

    public void playGame(Game game) {
        if (!ownsGame(game)) {
            System.out.println(name + " does not own this game");
        } else {
            skillLevel += 5;
            game.increasePopularity();
            lastPlayedGame = game;
        }
    }

    public void rageQuit() {
        skillLevel -= 3;
        if (skillLevel < 0) {
            skillLevel = 0;
            lastPlayedGame = null;
        }
    }

    public void buyGame(Game game) {
        if (ownsGame(game)) {
            System.out.println(name + " already owns this game");
            return;
        }
        double cost = game.gameCost();
        if (this.money < cost) {
            System.out.println(name + " cannot afford this game");
            return;
        }
        this.money -= cost;
        Game[] newOwnedGames = new Game[this.ownedGames.length + 1];
        for (int i = 0; i < this.ownedGames.length; i++) {
            newOwnedGames[i] = this.ownedGames[i];
        }
        newOwnedGames[this.ownedGames.length] = game;
        this.ownedGames = newOwnedGames;
    }

    public void beSponsored(Game game) {
        if (!ownsGame(game)) {
            Game[] newOwnedGames = new Game[this.ownedGames.length + 1];
            for (int i = 0; i < this.ownedGames.length; i++) {
                newOwnedGames[i] = this.ownedGames[i];
            }
            newOwnedGames[this.ownedGames.length] = game;
            this.ownedGames = newOwnedGames;
        }
        playGame(game);
        this.money += 100;
    }

    public String toString() {
        String result = "I am " + name + ", a gamer with a skill level of " + skillLevel;
        if (lastPlayedGame != null) {
            result += ". My last played game is " + lastPlayedGame.getName() + ". " + lastPlayedGame.toString();
        }
        return result;
    }

}
