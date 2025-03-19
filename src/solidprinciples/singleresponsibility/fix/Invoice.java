package solidprinciples.singleresponsibility.fix;

import solidprinciples.singleresponsibility.Marker;

public class Invoice {
    private final Marker marker;
    private final int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public double calculateTotal() {
        // Calculate total amount based on quantity and rate of interest
        double rate = 10;
        return this.quantity * 10 * (rate / 100) * marker.getPrice();
    }
}
