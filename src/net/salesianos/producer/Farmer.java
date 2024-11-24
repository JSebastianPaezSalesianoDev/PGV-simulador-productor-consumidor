package net.salesianos.producer;

import java.util.Random;

import net.salesianos.orchard.Orchard;
import net.salesianos.orchard.Vegetable;

public class Farmer extends Thread {

    private int vegLimit;
    private int maxGrowingTime;
    private Random random;
    private Orchard orchard;

   
    public Farmer(String name, int vegLimit, int maxGrowingTime, Orchard orchard) {
        super(name);
        this.vegLimit = vegLimit;
        this.maxGrowingTime = maxGrowingTime;
        this.orchard = orchard;  
        this.random = new Random();
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i < vegLimit; i++) {
                String verdura = Vegetable.getVegetable();
                int tiempoCrecimiento = random.nextInt(maxGrowingTime);
                Thread.sleep(tiempoCrecimiento);  
                System.out.println(this.getName() + " ha plantado una " + verdura + " que ha crecido en "
                        + (tiempoCrecimiento / 1000) + " segundos.");
                orchard.añadirVerdura(verdura, this.getName());  
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
