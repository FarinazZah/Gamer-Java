//I worked on the homework assignment alone, using only course materials.
public class GameGenre {
    private String genre;
    private int baseGameCost;

    public GameGenre(String initGenre, int initBaseGameCost) {
        genre = initGenre;
        baseGameCost = initBaseGameCost;
    }

    public int getBaseGameCost() {
        return baseGameCost;
    }

    public String getGenre() {
        return genre;
    }

    public void setBaseGameCost(int newBaseGameCost) {
        if (newBaseGameCost < 0) {
            baseGameCost = 0;
        } else {
            baseGameCost = newBaseGameCost;
        }
    }

    public String toString() {
        return genre + " games start at $" + baseGameCost;
    }
}
