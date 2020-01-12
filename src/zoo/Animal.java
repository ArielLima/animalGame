package zoo;

import java.lang.Math;

class Animal {


    // Class variables
    int attackPower = 25;
    int health = 100;
    int defense = 50;
    int speed = 25;

    //Add ons
    double dodging;
    boolean dodge;

    double critical;
    boolean critical_hit;

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

    //Setting Critical
    public void critical_me() {
        critical = (Math.random());
        if (critical < 0.15) {
            critical_hit = true;
        } if (critical > 0.15 ) {
            critical_hit = false;
        }
    }

    public static void main(String[] args) {

        Animals fight = new Animals();
        Animals reptile = new Reptile();

        fight.critical_me();


    }

}
























