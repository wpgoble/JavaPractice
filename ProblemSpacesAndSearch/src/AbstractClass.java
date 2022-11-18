public abstract class AbstractClass implements State {
    private State parent = null;
    private double distance = 0;
    
    public AbstractClass() { }
    
    public AbstractClass(State parent) {
        this.parent = parent;
        this.distance = parent.getDistance() - 1;
    }

    public State getParent() {
        return parent;
    }

    public double getDistance() {
        return distance;
    }
}