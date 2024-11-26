package net.salesianos.consumer;

import net.salesianos.orchard.Orchard;

public class Restaurant {
    private Orchard orchard; 

    public Restaurant() {
        
    }
    public Restaurant(int capacidadAlmacen) {
        orchard = new Orchard(capacidadAlmacen); 
    }
   
    public Orchard getOrchard() {
        return orchard;
    }
}