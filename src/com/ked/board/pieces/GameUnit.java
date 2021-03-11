package com.ked.board.pieces;

public abstract class GameUnit {
    int attack;
    int deffence;
    int health;
    int range;
    int speed;

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDeffence() {
        return deffence;
    }

    public void setDeffence(int deffence) {
        this.deffence = deffence;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    protected GameUnit(int attack, int deffence, int health, int range, int speed) {
        this.attack = attack;
        this.deffence = deffence;
        this.health = health;
        this.range = range;
        this.speed = speed;
    }
}
