package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(100);
        boss.setDamage(20);
        boss.setType("щит");
        System.out.println(boss.getHealth() + " " + boss.getDamage() + " " + boss.getType());
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getHealth() + " " + createHeroes()[i].getDamage()
                    + " " + createHeroes()[i].getSuperpower());
        }
    }

    public static Hero[] createHeroes() {
        Hero hero = new Hero(120, 20, "Байдулла");
        Hero hero1 = new Hero(110, 15, "Дастан");
        Hero hero2 = new Hero(105, 10, "Рустам");
        Hero[] heroes = {hero, hero1, hero2};
        return heroes;
    }
}
