package starWar;

public class Sith extends ForceWielder implements IHealable{

    private String lightsaberColor;
    private int totalCredits;
    
    public Sith(String name, int battleCounts, double health, double damage, int totalCredits) {
        super(name, battleCounts, health, damage);
        this.lightsaberColor = "red";
        this.totalCredits = totalCredits;
    }

    public String getLightsaberColor() {
        return lightsaberColor;
    }
    
    public void setLightsaberColor(String lightsaberColor) {
        this.lightsaberColor = lightsaberColor;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    @Override
    public String toString() {
        return "\nSith Name: " + getName() + "\n\tNumber of battles engaged: " + getBattleCounts() + "\n\tHealth: " + getHealth() + "\n\tDamage of Lightsaber: "
        + getDamage();
    }

    public void totalCredits() {
        setTotalCredits(310);
        for (int i = 1; i<= getBattleCounts(); i++){
            setTotalCredits(getTotalCredits() + 15);
        }  
    }

    public void saberFight(Jedi j) {
        setBattleCounts(getBattleCounts()+1);
        if (j.getHealth()>0){
            System.out.printf("\nThe Sith %s produced a damage worth %.1f against the Jedi %s.", 
            getName(), getDamage(), j.getName() );

            j.setHealth(j.getHealth()-getDamage());
            setDamage(getDamage()+10); //increase the amount of damage of Jedi's lightsaber
            j.setDamage(j.getDamage()-10); //decrease the amount of damage of Sith's lightsaber
        }

        if (getHealth()<=0){
            System.out.printf("\nThe Sith %s has been defeated by the Jedi %s.", getName(), j.getName());
        } else{
            System.out.printf("\nThe Sith %s defeated the Jedi %s.", getName(), j.getName());
        }
        
    }
    public void heal() {
        setHealth(getHealth() + 100);
    }


    




    

    
}
