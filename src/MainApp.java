import java.util.ArrayList;

public class MainApp
{
    public static void main(String[] args) {
        ArrayList<SnookerPlayer> players = new ArrayList<>();
        players.add(new SnookerPlayer());
        players.add(new SnookerPlayer("Tony Stark", "American",
                10000,10, 5));
        players.add(new SnookerPlayer("Natasha Romanov"
                , "Russian",50000,5, 2));

        Tournament worldChamp = new Tournament("World Championsship",
                3000000, players);

        worldChamp.display();
        //System.out.println(worldChamp);
        worldChamp.increaseAll(10000);
        worldChamp.display();
    }
}
