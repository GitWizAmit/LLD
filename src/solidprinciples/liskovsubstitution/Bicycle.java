package solidprinciples.liskovsubstitution;

public class Bicycle implements Bike {
    private int speed;

    @Override
    public void speedUp() {
        speed += 2;
    }

    @Override
    public void applyBrakes() {
        speed -= 2;
    }

    @Override
    public boolean turnOnEngine() {
        throw new UnsupportedOperationException("Bicycle does not have an engine");
    }

    // this method is not part of the Bike interface and violates the Liskov Substitution Principle
    // for liskov substitution principle, the subclass should be able to substitute the parent class without any change in the behavior
}
