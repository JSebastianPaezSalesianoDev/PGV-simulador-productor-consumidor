package net.salesianos.orchard;

import java.util.ArrayList;
import java.util.List;

public class Orchard {
    private int capacity;
    private List<String> vegetables;

    public Orchard(int capacity) {
        this.capacity = capacity;
        this.vegetables = new ArrayList<>(capacity);
    }

    public synchronized void añadirVerdura(String vegetable, String farmerName) throws InterruptedException {
        while (vegetables.size() == capacity) {
            System.out.println("Esperando abastecimiento de verduras para el granjero " + farmerName);
            wait();
        }
        vegetables.add(vegetable);
        System.out.println("Granjero " + farmerName + " ha producido: " + vegetable);
        notifyAll();
    }

    public synchronized void retirarVerdura(String customerId) throws InterruptedException {
        while (vegetables.isEmpty()) {
            System.out.println("Esperando que se plante la verduras");
            wait();
        }
        String verdura = vegetables.remove(0);
        System.out.println("Cliente " + customerId + " ha consumido: " + verdura);
        notifyAll();
    }

    public boolean isItFull() {
        return vegetables.size() == capacity;
    }

    public boolean estaVacio() {
        return vegetables.isEmpty();
    }
}
