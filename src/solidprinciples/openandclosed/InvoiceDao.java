package solidprinciples.openandclosed;

import solidprinciples.singleresponsibility.fix.Invoice;

public class InvoiceDao {
    public void saveInvoice(Invoice invoice) {
        // Save invoice to database
    }
    public void saveInvoiceToPdf(Invoice invoice) {
        // Save invoice to pdf
    }
    // if new methods are added, this class will be modified which violates open and closed principle
}
