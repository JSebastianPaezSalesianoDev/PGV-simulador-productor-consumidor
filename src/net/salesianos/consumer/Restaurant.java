package net.salesianos.consumer;

import net.salesianos.orchard.Orchard;

public class Restaurant {
    private Orchard orchard; 

    public Restaurant() {
        
    }
    public Restaurant(int capacityStorage) {
        orchard = new Orchard(capacityStorage); 
    }
   
    public Orchard getOrchard() {
        return orchard;
    }
}