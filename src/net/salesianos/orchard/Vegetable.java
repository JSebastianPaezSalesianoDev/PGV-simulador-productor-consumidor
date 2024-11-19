package net.salesianos.orchard;

public class Vegetable {

    private String type;
    private int timeOfRaise;
    private boolean state;
    
    public Vegetable(String type, int timeOfRaise) {
        this.type = type;
        this.timeOfRaise = timeOfRaise;
        this.state = false;
    }

    public String getType() {
        return type;
    }

    public int getTimeOfRaise() {
        return timeOfRaise;
    }

    public boolean isState() {
        return state;
    }
    
    public void setState(boolean state) {
        this.state = state;
    }
}
