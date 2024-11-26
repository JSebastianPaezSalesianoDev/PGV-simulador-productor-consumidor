import net.salesianos.consumer.Client;
import net.salesianos.orchard.Orchard;
import net.salesianos.producer.Farmer;
import net.salesianos.consumer.Restaurant;

public class App {

    public static void main(String[] args) {

        int capacidadAlmacen = 10;


        Restaurant restaurante = new Restaurant(capacidadAlmacen);

  
        Orchard orchard = restaurante.getOrchard();

      
        Farmer paco = new Farmer("Paco", 10, 5000, orchard);  
        Farmer ramon = new Farmer("Ramón", 10, 5000, orchard); 

        
        Client faustino = new Client("Faustino", 5, 3000, orchard);  
        Client mrGentleman = new Client("Mr. Gentleman", 5, 3000, orchard);  
        Client loquendo = new Client("Loquendo", 5, 3000, orchard); 

        
        paco.start();
        ramon.start();

        
        faustino.start();
        mrGentleman.start();
        loquendo.start();

        
        try {
            paco.join();
            ramon.join();
            faustino.join();
            mrGentleman.join();
            loquendo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Simulación finalizada: Todas las verduras han sido producidas y consumidas.");
    }
}