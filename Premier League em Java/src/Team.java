import java.util.ArrayList;

public class Team {
    private String name;
    private int points;
    private int won;
    private int lost;
    private int drawn;
    private int goalsFor;
    private int goalsAgainst;
    private int homeMatch;
    private boolean available;
    ArrayList<Player> players = new ArrayList<>();
    ArrayList<Team> teamsPlayed = new ArrayList<>();

    public Team(String name) {
        this.name = name;
        this.points = 0;
        this.won = 0;
        this.lost = 0;
        this.drawn = 0;
        this.goalsFor = 0;
        this.goalsAgainst = 0;
        this.homeMatch = 0;
        this.available = true;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
    public int getWon() {
        return won;
    }
    public void setWon(int won) {
        this.won = won;
        this.setPoints(this.getPoints() + 3);
    }
    public int getLost() {
        return lost;
    }
    public void setLost(int lost) {
        this.lost = lost;
    }
    public int getDrawn() {
        return drawn;
    }
    public void setDrawn(int drawn) {
        this.drawn = drawn;
        this.setPoints(this.getPoints() + 1);
    }
    public int getGoalsFor() {
        return goalsFor;
    }
    public void setGoalsFor(int goalsFor) {
        this.goalsFor = goalsFor;
    }
    public int getGoalsAgainst() {
        return goalsAgainst;
    }
    public void setGoalsAgainst(int goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }
    public ArrayList<Player> getPlayers() {
        return players;
    }
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public int getHomeMatch() {
        return homeMatch;
    }

    public void setHomeMatch(int homeMatch) {
        this.homeMatch = homeMatch;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    
    

}
