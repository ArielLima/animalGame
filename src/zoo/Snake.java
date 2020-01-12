package TestForZoo;

import java.lang.Math;

public class Snake extends Reptile {


    // Class variables
    int attackPower = 60;
    int health = 100;
    int defense = 20;
    int speed = 15;
    int get_health;


    // Attack of the Animal
    public int attack() {
        if (critical_hit) {
            return (int) (Math.random() * ((attackPower - (attackPower / 2)) + 1)) * 2;
        } else {
            return (int) (Math.random() * ((attackPower - (attackPower / 2)) + 1));
        }
    }


    // Defense of the Animal and Evasion of Animal
    public void receive_damage(int damage) {
        if (dodge) {
            damage *= 0;
        } else {
            this.health = damage - (int) (Math.random() * (this.defense));
        }

    }

    //Health of the Animal
    public void healing(){
        health = health + healing;
    }

    //Setting Dodge
    public void evade_me() {
        dodging = (Math.random());

        if (dodging <= 0.2) {
            dodge = true;
        } if (dodging > 0.2) {
            dodge = false;
        }
    }

    //Setting Critical hit
    @Override
    public void critical_me() {
        critical = Math.random();
        if (critical < 0.25) {
            critical_hit = true;
        } if (critical > 0.25){
            critical_hit = false;
        }
    }

    @Override
    //Only reptile
    public boolean shed_skin() {
        return Math.random() < 0.7;
    }

    public int heal() {
        if (shed_skin()) {
            healing = 5;
        } else {
            healing = 0;
        }
        return healing;
    }
}

























