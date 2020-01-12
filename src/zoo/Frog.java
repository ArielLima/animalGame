package zoo;

import java.lang.Math;

public class Frog extends Reptile{
    // Class variables
    int attackPower = 30;
    int health = 200;
    int defense = 30;
    int speed = 35;
    int get_health;


    // Attack of the Animal
    public int attack() {
        if (hydrate) {
            return (int) (Math.random() * ((attackPower - (attackPower / 2)) + 1)) * 3;
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

    //Setting Hydrate
    public void hydrate() {
        double Hydrate = Math.random();

        if (Hydrate < 0.50) {
            hydrate = true;
        } if (Hydrate > 0.50){
            hydrate = false;
        }
    }

    @Override
    //Only reptile
    public boolean shed_skin() {
        return Math.random() < 0.7;
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

























