package com.company;

public class Boss {
    private int health;
    private int damage;
    private String type;

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getType() {
        return type;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setType(String type) {
        this.type = type;
    }
}