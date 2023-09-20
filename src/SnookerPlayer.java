public class SnookerPlayer
{
    private String name;
    private String nationality;
    private double prizeMoney;
    private int gamesWon;
    private int gamesPlayed;

    public SnookerPlayer()
    {
        this.name = "Default";
        this.nationality = "Irish";
        this.prizeMoney = 0;
        this.gamesPlayed = 0;
        this.gamesWon = 0;
    }

    public SnookerPlayer(String name, String nationality, double prizeMoney, int gamesPlayed, int gamesWon)
    {
        this.name = name;
        this.nationality = nationality;
        this.prizeMoney = prizeMoney;
        this.gamesWon = gamesWon;
        this.gamesPlayed = gamesPlayed;
    }

    public String getName()
    {
        return name;
    }

    public String getNationality()
    {
        return nationality;
    }
    public double getPrizeMoney()
    {
        return prizeMoney;
    }
    public int getGamesWon()
    {
        return gamesWon;
    }
    public int getGamesPlayed()
    {
        return gamesPlayed;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setNationality(String nationality)
    {
        this.nationality = nationality;
    }
    public void setPrizeMoney(double prizeMoney)
    {
        this.prizeMoney = prizeMoney;
    }
    public void setGamesWon(int gamesWon)
    {
        this.gamesWon = gamesWon;
    }
    public void setGamesPlayed(int gamesPlayed)
    {
        this.gamesPlayed = gamesPlayed;
    }

    public void increasePrizeMoney(double amnt)
    {
        this.prizeMoney += amnt;
    }

    public void updatePerformance(boolean won)
    {
        if(won)
        {
            gamesWon++;
        }
        gamesPlayed++;
    }
    @Override
    public String toString()
    {
        String str = name+"("+nationality+") €" + prizeMoney;
        str += " games: " + gamesWon + "/"+gamesPlayed ;
        return str;
    }
}
