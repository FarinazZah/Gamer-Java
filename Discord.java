// This is where my main method will be to test the other classes!
public class Discord {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
       //GameGenre
        GameGenre practice1 = new GameGenre("Fiction", -99829);
        practice1.setBaseGameCost(5);
        //System.out.println(practice1.getBaseGameCost());
        System.out.println(practice1.toString());
        GameGenre practice2 = new GameGenre("War", 90);
        //practice2.setBaseGameCost(77);
        //System.out.println(practice2.getGameGenre());
        //System.out.println(practice2.getBaseGameCost());
        Game game1 = new Game("Fari's Game", practice1, 1, 3);
        Game game2 = new Game("COD", practice2, 3, 3);
        //System.out.println(game1.getCostMultiplier());
        //System.out.println(game1.getGameGenre());
        //System.out.println(game1.getName());
        // System.out.println(game1.getPopularity());
        // game1.increasePopularity();
        // game1.increasePopularity();
        // game1.setCostMultiplier(9);
        // System.out.println(game1.getCostMultiplier());
        // System.out.println(game1.gameCost());
        // System.out.println(game1.toString());

        Game[] firstArray = {game1};
        Game[] secondArray = {game2};
        Game[] thirdArray = {game1, game2};
        Gamer firstGamer = new Gamer("Farinaz", 2, 3.43, firstArray, game1);
        Gamer secondGamer = new Gamer ("Husain", 0, 7.00, secondArray, game2);
        // System.out.println(secondGamer.getSkillLevel());
        Gamer[] gamerArray = {firstGamer, secondGamer};
        Gamer[] singleGamerArray = {secondGamer};
        // System.out.println(game2.toString());
        // System.out.println(secondGamer.ownsGame(game2));
        // game1.hostCompetitiveTournament(gamerArray);
        //System.out.println(secondGamer.getSkillLevel());
        //game2.hostCompetitiveTournament(singleGamerArray);
        //System.out.println(secondGamer.getOwnedGames().toString());
        System.out.println(secondGamer.getMoney());
        secondGamer.beSponsored(game2);
        //System.out.println(secondGamer.getOwnedGames().toString());
        System.out.println(secondGamer.getMoney());
        System.out.println(firstGamer.toString());
        //System.out.println(game1.getPopularity());
        //System.out.println(game2.getPopularity());
        //game1.increasePopularity(12);
        //System.out.println(game1.getPopularity());
        //game1.increasePopularity(700);
        //System.out.println(game1.getPopularity());
        //System.out.println(Game.getTotalGames());
        //Game game2 = new Game ("Husain's Game",practice2, 9.09, 4 );
        //System.out.println(Game.getTotalGames());
        //System.out.println(secondGamer.getLastPlayedGame());
        //System.out.println(game2.getPopularity());
        //secondGamer.playGame(game2);
        //System.out.println(secondGamer.getLastPlayedGame());
        //System.out.println(game2.getPopularity());
        //System.out.println(secondGamer.getSkillLevel());
        //System.out.println(secondGamer.getLastPlayedGame());
        //secondGamer.rageQuit();
        //System.out.println(secondGamer.getSkillLevel());
        //System.out.println(secondGamer.getLastPlayedGame());

    }
}