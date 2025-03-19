package solidprinciples.singleresponsibility;

import lombok.Getter;

@Getter
public class Marker {
    private final String color;
    private final String brand;
    private final int price;

    public Marker(String color, String brand, int price) {
        this.color = color;
        this.brand = brand;
        this.price = price;
    }
}
