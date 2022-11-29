package starWar;

public class Jedi extends ForceWielder implements IHealable, IHealthBoostable{

    private String lightsaberColor;
    private int totalCredits;
    private double forceHealAmount; //always equal to double of the amount of damage that the lightsaber deals.
    
    public Jedi(String name, int battleCounts, double health, double damage, String lightsaberColor, int totalCredits) {
        super(name, battleCounts, health, damage);
        this.lightsaberColor = lightsaberColor;
        this.totalCredits = totalCredits;
        this.forceHealAmount = damage*2;
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

    public double getForceHealAmount() {
        return forceHealAmount;
    }

    public void setForceHealAmount(double forceHealAmount) {
        this.forceHealAmount = forceHealAmount;
    }

    @Override
    public String toString() {
        return "\nJedi Name: " + getName() + "\n\tNumber of battles engaged: " + getBattleCounts() + "\n\tHealth: " + getHealth() + "\n\tDamage of Lightsaber: "
        + getDamage();
    }

    public void totalCredits(){
        setTotalCredits(310);
        for (int i = 1; i<= getBattleCounts(); i++){
            setTotalCredits(getTotalCredits() + 15);
        }
    }

    public void saberFight(Sith s){
        setBattleCounts(getBattleCounts()+1);
        if (s.getHealth()>0){
            System.out.printf("\nThe Jedi %s produced a damage worth of %.1f against the Sith %s", 
            getName(), getDamage(), s.getName());
            s.setHealth(s.getHealth()-getDamage());

            setDamage(getDamage()+10); //increase the amount of damage of Jedi's lightsaber
            s.setDamage(s.getDamage()-10); //decrease the amount of damage of Sith's lightsaber
        }
        
        
        if (getHealth()<=0){
            System.out.printf("\nThe Jedi %s has been defeated by the Sith %s.", getName(), s.getName());
        } else{
            System.out.printf("\nThe Jedi %s defeated the Sith %s.", getName(), s.getName());
        }
    }

    public void revealLightsaber(){
        String color = getLightsaberColor();
        if(!color.equalsIgnoreCase("blue") && !color.equalsIgnoreCase("purple") && !color.equalsIgnoreCase("green")){
            System.out.println("\nAn Unknown color has been generated from the lightsaber.");
            return;
        }
        System.out.printf("\nColor generated from the lightsaber is %s.", getLightsaberColor());
    }

    public void heal(){
        setHealth(getHealth()+150);
    }

    public void boostHealth() {
        setHealth(getHealth() * 5);
    }




    

    
}
