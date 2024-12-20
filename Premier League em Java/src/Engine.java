import java.util.ArrayList;

public class Engine {
    
    public ArrayList<Team> createTeams(){
        ArrayList<Team> teams = new ArrayList<>();
        
        teams.add(new Team("Manchester City"));
        teams.add(new Team("Chelsea"));
        teams.add(new Team("Leicester"));
        teams.add(new Team("Manchester United"));
        teams.add(new Team("Spurs"));
        teams.add(new Team("Arsenal"));
        teams.add(new Team("Paysandu"));
        teams.add(new Team("Remo"));
        
        return teams;
    }
}
