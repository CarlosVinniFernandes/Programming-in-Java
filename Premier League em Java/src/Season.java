import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Season {
    ArrayList<Team> teams = new ArrayList<>();
    Random r1 = new Random();
    int match = teams.size()/2;
    int i = 0;
    int j = 0;
    int round = 1;
    int plays = 1;

    public void homeOrVisitor(){
        System.out.println(plays);
        System.out.println(teams.size());
        int match = teams.size()/2;
        for (i = 0; i < teams.size(); i++) {
            if (i < match) {
                teams.get(i).setHomeMatch(1);
            } else {
                teams.get(i).setHomeMatch(0); 
            }
        }
    }

    public void match(Team t1, Team t2){
        int teamHome = r1.nextInt(6);
        int teamVisitor = r1.nextInt(5);
        System.out.println("Today's match is " + t1.getName() + " vs " + t2.getName());

        if (teamHome > teamVisitor) {
            t1.setWon(t1.getWon() + 1);
            t2.setLost(t2.getLost() + 1);        
        }
        else if (teamHome < teamVisitor) {
            t2.setWon(t2.getWon() + 1);
            t1.setLost(t1.getLost() + 1); 
        }
        else{
            t1.setDrawn(t1.getDrawn() + 1);
            t2.setDrawn(t2.getDrawn() + 1); 
        }
        t1.teamsPlayed.add(t2);
        t2.teamsPlayed.add(t1);
        t1.setHomeMatch(0);
        t2.setHomeMatch(1);
        t1.setAvailable(false);
        t2.setAvailable(false);
    }

    public void addTeamsArray(ArrayList<Team> teamList){
        for (Team team : teamList) {
            teams.add(team);
        }
    }

    public void addTeams(Team team){
        teams.add(team);
    }

    public void startRound(){
        int narrator = r1.nextInt(3) + 1;
        for (Team team : teams) {
            team.setAvailable(true);
        }

        // Narrator Voice System 
        System.out.println("For the " + round + " round of Premier League");
        if (narrator == 1) {
            System.out.println("What a beautiful match to see!");
        }
        else if (narrator == 2) {
            System.out.println("The fans waited this for days, let's all cheer for a good match");
        }
        else if (narrator == 3) {
            System.out.println("Take a nice seat because today's game gonna be a fantastic match!");
        }

        round ++;
        if(round == teams.size()){
            for (Team team : teams) {
                team.teamsPlayed.clear();
            }
        }

        // Match logic
            for(i = 0; i < teams.size(); i++){
                for(j = 0; j < teams.size(); j++){
                    if(teams.get(i).getHomeMatch() != teams.get(j).getHomeMatch() && !teams.get(i).teamsPlayed.contains(teams.get(j)) && (teams.get(i).isAvailable() == true && teams.get(j).isAvailable()) && i != j){                        
                        match(teams.get(i), teams.get(j));
                        break;
                    }
                }
        }

    }

        public void table(){
            int space = 0;
            ArrayList<Team> table = new ArrayList<>();
            for (Team team : teams) {
                table.add(team);
            }
            Collections.sort(table, (Team t1, Team t2) -> Integer.compare(t2.getPoints(), t1.getPoints()));
            System.out.println("Table:              |  P   W   L   D  |");
            for (Team team : table) {
                System.out.print(team.getName());
                if (team.getName().length() < 20) {
                    space = (20 - team.getName().length());
                    for(i = 0; i < space; i++){
                        System.out.print(" ");
                    }
                }
                System.out.println("| [" + team.getPoints() + "] " 
                + "[" + team.getWon() + "] " 
                + "[" + team.getLost() + "] " 
                + "[" + team.getDrawn() + "] |") ;
            }
        }
















}
