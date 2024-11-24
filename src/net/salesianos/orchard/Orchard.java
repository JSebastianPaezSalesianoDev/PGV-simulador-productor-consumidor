package net.salesianos.orchard;

import java.util.ArrayList;
import java.util.List;

public class Orchard {
    private int capacidad;
    private List<String> verduras;

    public Orchard(int capacidad) {
        this.capacidad = capacidad;
        this.verduras = new ArrayList<>(capacidad);
    }

    public synchronized void añadirVerdura(String verdura, String farmerName) throws InterruptedException {
        while (verduras.size() == capacidad) {
            wait();
        }
        verduras.add(verdura);
        System.out.println("Granjero " + farmerName + " ha producido: " + verdura);
        notifyAll();
    }

    public synchronized void retirarVerdura(int customerId) throws InterruptedException {
        while (verduras.isEmpty()) {
            wait();
        }
        String verdura = verduras.remove(0);
        System.out.println("Cliente " + customerId + " ha consumido: " + verdura);
        notifyAll();
    }

    public boolean estaLleno() {
        return verduras.size() == capacidad; 
    }


    public boolean estaVacio() {
        return verduras.isEmpty(); 
    }
}
