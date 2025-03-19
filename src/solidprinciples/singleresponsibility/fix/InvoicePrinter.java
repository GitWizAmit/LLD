package solidprinciples.singleresponsibility.fix;

public class InvoicePrinter {
    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void print() {
        // Print invoice details to console or printer etc.
        // it has only one responsibility
    }
}
