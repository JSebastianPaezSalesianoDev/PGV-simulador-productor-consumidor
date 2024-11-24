package net.salesianos.consumer;

import net.salesianos.orchard.Orchard;
import net.salesianos.orchard.Vegetable;

public class Restaurant {
    private Orchard orchard; 

    
    public Restaurant(int capacidadAlmacen) {
        orchard = new Orchard(capacidadAlmacen); 
    }

    
    public void producirVerdura(String nombreGranjero) {
        try {
            String verdura = Vegetable.getVegetable(); 
            orchard.añadirVerdura(verdura, nombreGranjero);  
           
        } catch (InterruptedException e) {
            System.out.println("El granjero " + nombreGranjero + " fue interrumpido.");
            Thread.currentThread().interrupt(); 
        }
    }

   
    public void consumirVerdura(String nombreCliente) {
        try {
            orchard.retirarVerdura(nombreCliente);  
           
        } catch (InterruptedException e) {
            System.out.println("El cliente " + nombreCliente + " fue interrumpido .");
            Thread.currentThread().interrupt(); 
        }
    }

   
    public Orchard getOrchard() {
        return orchard;
    }
}