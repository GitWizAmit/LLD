package solidprinciples.liskovsubstitution;

public class Motorcycle implements Bike {
    private int speed;

    @Override
    public void speedUp() {
        speed += 5;
    }

    @Override
    public void applyBrakes() {
        speed -= 5;
    }

    @Override
    public boolean turnOnEngine() {
        return false;
    }

    public int getSpeed() {
        return speed;
    }
}
