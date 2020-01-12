package TestForZoo;

import java.lang.Math;

public class Reptile extends Animals {


    // Class variables
    int attackPower = 60;
    int health = 100;
    int defense = 20;
    int speed = 15;
    int get_health;
    boolean hydrate;
    int healing;



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
    public void critical_me() {
        critical = Math.random();
        if (critical < 0.15) {
            critical_hit = true;
        } if(critical > 0.15) {
            critical_hit = false;
        }
    }


    //Only reptile
    public boolean shed_skin() {
        return Math.random() < 0.5;
    }

    public int heal() {
        if (shed_skin()) {
            health = health + 5;
            return health;
        } else {
            health = health;
            return health;
        }
    }
}
























