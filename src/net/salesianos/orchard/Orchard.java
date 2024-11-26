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
            System.out.println("Esperando abastecimiento de verduras para el granjero " + farmerName);
            wait();
        }
        verduras.add(verdura);
        System.out.println("Granjero " + farmerName + " ha producido: " + verdura);
        notifyAll();
    }

    public synchronized void retirarVerdura(String customerId) throws InterruptedException {
        while (verduras.isEmpty()) {
            System.out.println("Esperando que se plante la verduras");
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
