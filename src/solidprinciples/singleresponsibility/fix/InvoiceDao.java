package solidprinciples.singleresponsibility.fix;

public class InvoiceDao {
    private final Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void save() {
        // Save invoice to database or file system etc.
        // it has only one responsibility
    }
}
