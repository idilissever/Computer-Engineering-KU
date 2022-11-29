package starWar;

public class Knight extends Jedi{

    private Padawan padawan;
    private final String forceAbilityName;
    
    public Knight(String name, int battleCounts, double health, double damage, String lightsaberColor, int totalCredits,
            Padawan padawan) {
        super(name, battleCounts, health, damage, lightsaberColor, totalCredits);
        this.padawan = padawan;
        this.forceAbilityName = "Force Heal";
    }

    public Padawan getPadawan() {
        return padawan;
    }

    public void setPadawan(Padawan padawan) {
        this.padawan = padawan;
    }

    public String getForceAbilityName() {
        return forceAbilityName;
    }

    @Override
    public String toString() {
        return "\nKnight Jedi Name: " + getName() + "\n\tNumber of battles engaged: " + getBattleCounts() + "\n\tHealth: " + getHealth() + "\n\tDamage of Lightsaber: "
        + getDamage();
    }

    public void healPadawan() {
        Padawan padawan = getPadawan();

        if(padawan.getHealth()>0){
            padawan.setHealth(padawan.getHealth() + getForceHealAmount());
        }
        
    }

    

    

    


    
}
