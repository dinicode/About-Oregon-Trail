package org.yup.oregontrail;

import javax.swing.*;

public class Traveler {
    private String name;
    private int health;

    private boolean isHealthy;

    private int food;


    public Traveler(String name, int health, int food) {
        this.name = name;
        this.health = health;
        this.isHealthy = true;
        this.food = food;
    }

    public String hunt() {

        //user needs to hunt
        //they have a 50 percent change of being successful
        if (Math.random() > .5) {

            //if they are successful we add 100 to their food and 0 to their food if not
            this.setFood(this.food + 100);

            return "The hunt was successful for" + this.getName() + " And their food is now at: " + this.getFood();
        }

        return "The hunt was a huge failure" + this.getName() + " And they let their family down. the food is still at " + this.getFood();
    }

    public String eat() {

        //comsumes 20 of the traveler's food. If the traveler doesn't have 20 food, the traveler in no longer healthy
        if ( this.getFood() >=20) {
            this.setFood(this.getFood() - 20);
            return "OMG that was good";

        }else{

            this.setHealthy(false);
        }
        return "You have failed yourself";



    }


    public String getName() {
        return name;
    }




         public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}