package solidprinciples.openandclosed.fix;

import solidprinciples.singleresponsibility.fix.Invoice;

public class DatabaseInvoiceDao implements InvoiceDao {
    @Override
    public void saveInvoice(Invoice invoice) {
        // Save invoice to database
    }
}
