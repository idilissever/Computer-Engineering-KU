package starWar;

public class Master extends Sith implements IHealthBoostable{

    private Apprentice apprentice;
    private final String forceAbilityName;
    private final double startingHealth;
    
    public Master(String name, int battleCounts, double health, double damage, int totalCredits,
            Apprentice apprentice) {
        super(name, battleCounts, health, damage, totalCredits);
        this.apprentice = apprentice;
        this.forceAbilityName = "Force Lightning.";
        this.startingHealth = health;
    }

    public Apprentice getApprentice() {
        return apprentice;
    }

    public void setApprentice(Apprentice apprentice) {
        this.apprentice = apprentice;
    }

    public String getForceAbilityName() {
        return forceAbilityName;
    }
    
    public double getStartingHealth(){
        return startingHealth;
    }

    @Override
    public String toString() {
        return "\nMaster Sith Name: " + getName() + "\n\tNumber of battles engaged: " + getBattleCounts() + "\n\tHealth: " + getHealth() + "\n\tDamage of Lightsaber: "
        + getDamage();
    }

    public void shockJedi(Jedi j) {
        if(j.getHealth()>0){
            j.setHealth(j.getHealth()*0.8);
            j.setHealth(j.getHealth() - 0.5*getDamage());
        }
    }

    public void boostHealth() {
        setHealth(getHealth() * 2);
        
    }

    
    


    

    
    
}
