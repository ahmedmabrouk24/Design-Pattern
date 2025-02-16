public class Traveler {
    private TransportStrategy strategy;

    public void setStrategy(TransportStrategy strategy) {
        this.strategy = strategy;
    }

    public void travel() {
        strategy.travel();
    }
}