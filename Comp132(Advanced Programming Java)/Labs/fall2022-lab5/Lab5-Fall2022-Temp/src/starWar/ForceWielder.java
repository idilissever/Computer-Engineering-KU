package starWar;

public abstract class ForceWielder {
    private String name;
    private int battleCounts;
    private double health;
    private double damage;
    
    public ForceWielder(String name, int battleCounts, double health, double damage) {
        this.name = name;
        this.battleCounts = battleCounts;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBattleCounts() {
        return battleCounts;
    }

    public void setBattleCounts(int battleCounts) {
        this.battleCounts = battleCounts;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }


    public abstract void totalCredits();

    @Override
    public String toString() {
        return "\nForceWielder Name: " + getName() + "\n\tNumber of battles engaged: " + getBattleCounts() + "\n\tHealth: " + getHealth() + "\n\tDamage of Lightsaber: "
                + getDamage();
    }

    
}
