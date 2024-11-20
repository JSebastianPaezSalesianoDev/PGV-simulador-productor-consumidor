package net.salesianos.producer;
import java.util.Random;
import net.salesianos.orchard.Vegetable;

public class Farmer extends Thread{
    
    private int vegLimit;
    private int maxGrowingTime;
    private Random random;

    public Farmer(String name) {
        super(name);
        vegLimit = 20;
        maxGrowingTime = 20;
    }
    private void plantarVerdura() throws Exception {

        try{

            for (int i = 0; i < vegLimit; i++) {
                String verdura = Vegetable.getVegetable();
                int tiempoCrecimiento = random.nextInt(maxGrowingTime);
                Thread.sleep(tiempoCrecimiento);
                System.out.println(this.getName() + " ha plantado una " + verdura + " que ha crecido en " + tiempoCrecimiento + " ms.");
            
            }
        }catch(Exception e){
            e.printStackTrace();
        }
      
    }
}

