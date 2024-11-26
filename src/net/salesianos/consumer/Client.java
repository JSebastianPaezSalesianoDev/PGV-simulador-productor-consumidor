package net.salesianos.consumer;

import net.salesianos.orchard.Orchard;

public class Client extends Thread {
    private int vegLimit;
    private int maxConsumptionTime;
    private Orchard orchard;

    public Client(String name, int vegLimit, int maxConsumptionTime, Orchard orchard) {
        super(name);
        this.vegLimit = vegLimit;
        this.maxConsumptionTime = maxConsumptionTime/1000;
        this.orchard = orchard;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < vegLimit; i++) {
                orchard.retirarVerdura(this.getName());
                int tiempoConsumo = (int) (Math.random() * maxConsumptionTime);
                Thread.sleep(tiempoConsumo);
                System.out.println(this.getName() + " ha consumido una verdura en " + tiempoConsumo + " segundos.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
