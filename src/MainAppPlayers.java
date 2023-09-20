public class MainAppPlayers
{
    public static void main(String[] args) {
        SnookerPlayer p1 = new SnookerPlayer();
        SnookerPlayer p2 = new SnookerPlayer("Tom Petty", "Welsh",
                10000, 3,1);

        System.out.println(p1);
        System.out.println(p2);

        p1.setName("Tony Stark");
        p1.setNationality("American");
        p1.setPrizeMoney(50000);
        p1.setGamesPlayed(5);
        p1.setGamesWon(2);

        System.out.println(p1.getName());
        System.out.println(p1.getNationality());
        System.out.println(p1.getPrizeMoney());
        System.out.println(p1.getGamesPlayed());
        System.out.println(p1.getGamesWon());
        System.out.println(p1 +"\n"+p2);

        p2.increasePrizeMoney(20000);

        p2.updatePerformance(true);
        p1.updatePerformance(false);
        System.out.println(p1 +"\n"+p2);

    }
}
