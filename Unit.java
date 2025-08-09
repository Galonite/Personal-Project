public class Unit{
    private int damage;
    private int health;
    private double speed;
    private double range;
    private String unitName;

    Unit(int damage, int health, double speed, double range, String unitName){
        this.setDamage(damage);
        this.setHealth(health);
        this.setSpeed(speed);
        this.setRange(range);
        this.setName(unitName);
    }

    public int getDamage(){
        return this.damage;
    }

    public void setDamage(int changeDmg){
        if(damage < 0){
            this.damage = 0;
        }
        this.damage = changeDmg;
    }

    public int getHealth(){
        return this.health;
    }

    public void setHealth(int changeHP){
        if(health < 0){
            this.health = 0;
        }
        this.damage = changeHP;
    }

    public double getSpeed(){
        return this.speed;
    }

    public void setSpeed(double changeSpd){
        if(speed < 0){
            this.speed = 0;
        }
        this.speed = changeSpd;
    }

    public double getRange(){
        return this.range;
    }

    public void setRange(double changeRng){
        if(range < 0){
            this.range = 0;
        }
        this.range = changeRng;
    }

    public String getName() {
        return this.unitName;
    }

    public void setName(String unitName) {
        if(unitName.length() == 0){
            this.unitName = "N/A";
        }
        this.unitName = unitName;
    }
}