import java.util.ArrayList;

public class Tournament
{
    private ArrayList<SnookerPlayer> players;
    private String name;
    private double prizeFund;

    public Tournament(String name)
    {
        this.name = name;
        this.players= new ArrayList();
        this.prizeFund = 0;
    }

    public Tournament(String name, double pf, ArrayList<SnookerPlayer> plyrs)
    {
        this.name = name;
        this.prizeFund = pf;
        this.players= plyrs;
    }

    public void display()
    {
        System.out.println("===================="+name+"======================");
        System.out.printf("%20s%5s%5s %11s\n", "Name", "P", "W", "Prize Money");
        for(SnookerPlayer p: players)
        {
            System.out.printf("%20s%5d%5d €%-10.2f\n",p.getName() ,
                    p.getGamesPlayed(),p.getGamesWon(), p.getPrizeMoney() );

        }
        System.out.println("\n\n");
    }

    public void increaseAll(double amnt)
    {
        for(SnookerPlayer p: players)
        {
            p.increasePrizeMoney(amnt);
        }
    }
    @Override
    public String toString()
    {
        return "Tournament: " + name +"; Prize Fund:"+prizeFund+"; players:"+players;
    }
}
