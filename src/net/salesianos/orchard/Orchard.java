package net.salesianos.orchard;

import java.util.LinkedList;
import java.util.Queue;

public class Orchard {
private int capacidad;
    private Queue<String> verduras = new LinkedList<>();

    public Orchard(int capacidad) {
        this.capacidad = capacidad;
    }

    public synchronized void añadirVerdura(String verdura, String farmerId) throws InterruptedException {
        while (verduras.size() == capacidad) {
            wait();
        }
        verduras.add(verdura);
        System.out.println("Granjero " + farmerId + " ha producido: " + verdura);
        notifyAll();
    }

    public synchronized void retirarVerdura(String customerId) throws InterruptedException {
        while (verduras.isEmpty()) {
            wait();
        }
        String verdura = verduras.poll();
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
