import net.salesianos.consumer.Client;
import net.salesianos.consumer.Restaurant;
import net.salesianos.orchard.Orchard;
import net.salesianos.producer.Farmer;

public class App {
    public static void main(String[] args) {
        int capacidadAlmacen = 2;

        Restaurant restaurant = new Restaurant(capacidadAlmacen);
        Orchard orchard = restaurant.getOrchard();

        Farmer paco = new Farmer("Paco", 5, 5000, orchard);
        Client faustino = new Client("Faustino", 5, 1000, orchard);

        paco.setPriority(Thread.MAX_PRIORITY);
        faustino.setPriority(Thread.MIN_PRIORITY); 

        paco.start();
        faustino.start();

        try {
            paco.join();
            faustino.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Simulación finalizada: Todas las verduras han sido producidas y consumidas.");
    }
}
