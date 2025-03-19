package solidprinciples.openandclosed.fix;

import solidprinciples.singleresponsibility.fix.Invoice;

public class PdfInvoiceDao implements InvoiceDao {
    @Override
    public void saveInvoice(Invoice invoice) {
        // Save invoice to pdf
    }
}
