public class Player {
    private String name;
    private int shirtNumber;
    private int overall;
    private int stamina;
    private int goalsScored;


    public Player(String name, int shirtNumber, int overall, int stamina) {
        this.name = name;
        this.shirtNumber = shirtNumber;
        this.overall = overall;
        this.stamina = stamina;
    }

    public Player() {
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getShirtNumber() {
        return shirtNumber;
    }
    public void setShirtNumber(int shirtNumber) {
        this.shirtNumber = shirtNumber;
    }
    public int getOverall() {
        return overall;
    }
    public void setOverall(int overall) {
        this.overall = overall;
    }
    public int getGoalsScored() {
        return goalsScored;
    }
    public void setGoalsScored(int goalsFor) {
        this.goalsScored = goalsFor;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
    
    
}
