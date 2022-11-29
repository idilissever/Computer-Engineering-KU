package starWar;

public class Padawan extends Jedi {

    private Knight knight;
    private final String forceAbilityName;
    
    public Padawan(String name, int battleCounts, double health, double damage, String lightsaberColor,
            int totalCredits, Knight knight) {
        super(name, battleCounts, health, damage, lightsaberColor, totalCredits);
        this.knight = knight;
        this.forceAbilityName = "Jedi Mind Trick.";
    }

    public Knight getKnight() {
        return knight;
    }

    public void setKnight(Knight knight) {
        this.knight = knight;
    }

    public String getForceAbilityName() {
        return forceAbilityName;
    }

    @Override
    public String toString() {
        return "\nPadawan Jedi Name: " + getName() + "\n\tNumber of battles engaged: " + getBattleCounts() + "\n\tHealth: " + getHealth() + "\n\tDamage of Lightsaber: "
        + getDamage();

    }

    public void confuseSith(Sith s) {
        if(s.getHealth()>0){
            s.setDamage(s.getDamage()* 0.8);
        }   
    }

    public void healKnight() {
        Knight knight = getKnight();

        if(knight.getHealth()>0){
            setHealth(getHealth() + knight.getForceHealAmount());
            System.out.printf("\nThe health of padawan is %f.", getHealth());
        }
        
    }
    
   

    

    

    
    
}
