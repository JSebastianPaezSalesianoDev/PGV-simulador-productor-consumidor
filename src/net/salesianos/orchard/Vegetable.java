package net.salesianos.orchard;

import java.util.Random;

public class Vegetable {

    private static final String[] VEGETABLES = {
        "lettuce", "cabbage", "onion", "spinach", "potato", "celery", "asparagus", "radish", "broccoli",
        "artichoke", "tomato", "cucumber", "eggplant", "carrot", "green", "bean"
};
    public static String getVegetable() {
        Random random = new Random();
        int index = random.nextInt(VEGETABLES.length);
        return VEGETABLES[index];
    }
  
}
