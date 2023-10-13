public class Boss {
    private int bossHealth;
    private  int bossDamage;
    private String defence;

    public int getDamage() {
        return bossDamage;
    }

    public void setDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public int getHealth() {
        return bossHealth;
    }

    public void setHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public String getDefence() {
        return defence;
    }

    public void setDefence(String defence) {
        this.defence = defence;
    }
    public Boss(){

    }

}
