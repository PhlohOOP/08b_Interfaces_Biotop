package com.cc.java;

import com.cc.java.bees.*;
import com.cc.java.birds.Bird;

public class App {
    
    public static void main(String[] args) {
     
        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();
        Bird bird = new Bird();

        pollObj(queen);
        pollObj(worker);
        pollObj(drone);
        pollObj(bird);

        //-- Das geht jetzt nicht mehr ! -- // 
        // HoneyBee bee = new HoneyBee(); // abstrakte Superklasse!
        // pollObj(bee);

        
    }

    // ---- 4. Iteration Polymorphie -----//
    private static void pollObj(HoneyBee obj){
        output(obj.doYourJob());
        output(obj.fly());
        output("-----------------");
    }

    private static void pollObj(Bird obj){ // Überladene Methode
        output(obj.hasFeathers());
        output(obj.fly());
        output("-----------------");
    }
    

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

