package solidprinciples.openandclosed.fix;

import solidprinciples.singleresponsibility.fix.Invoice;

public interface InvoiceDao {
    void saveInvoice(Invoice invoice);
}
