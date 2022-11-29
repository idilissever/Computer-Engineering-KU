package starWar;

public class Apprentice extends Sith {

    private Master master;
    private final String forceAbilityName;
    
    public Apprentice(String name, int battleCounts, double health, double damage, int totalCredits, Master master) {
        super(name, battleCounts, health, damage, totalCredits);
        this.master = master;
        this.forceAbilityName = "Force Choke.";
    }

    public Master getMaster() {
        return master;
    }

    public void setMaster(Master master) {
        this.master = master;
    }

    public String getForceAbilityName() {
        return forceAbilityName;
    }

    @Override
    public String toString() {
        return "\nApprentice Sith Name: " + getName() + "\n\tNumber of battles engaged: " + getBattleCounts() + "\n\tHealth: " + getHealth() + "\n\tDamage of Lightsaber: "
        + getDamage();
    }

    public void chokeJedi(Jedi j) {
        if (j.getHealth()>0){
            j.setHealth(j.getHealth()*0.5);
            j.setHealth(j.getHealth() - getDamage());
        }        
    }

    public void betrayMaster() {
        Master master = getMaster();

        if(master.getHealth() < master.getStartingHealth()*0.1){
            master.setHealth(0);
            setHealth(100);
        }
        
    }

    

    
    
}
