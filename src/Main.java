public class Main {
    public static Hero[] createHeroes(){
        Hero sua = new Hero(200, 10, "Physical");
        Hero amora = new Hero(220, 15);
        Hero rai = new Hero(225, 25, "Kinetic");
        Hero[] heroes = {sua, amora, rai};
        return heroes ;

    }
    public static void main(String[] args) {
        Boss boss = new Boss( );
        boss.setDamage(25);
        boss.setHealth(300);
        boss.setDefence("Magic");
        System.out.println("Boss damage: " + boss.getDamage());
        System.out.println("Boss Health: " + boss.getHealth());
        System.out.println("Boss Defence: " + boss.getDefence());
        Hero[] heroes = createHeroes();
        for (Hero hero : heroes) {
            System.out.println("Hero health: " + hero.getHealth());
            System.out.println("Hero damage: " + hero.getDamage());
            System.out.println("Hero superpower: " + hero.getSuperpower());
    }


    }

}