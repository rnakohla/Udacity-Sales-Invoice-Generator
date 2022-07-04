
package salesinvoicegenerator.model;


public class InvoiceLine {
    private String itemName;
    private double itemPrice;
    private int count;
    private InvoiceHeader header;

    public InvoiceLine(){
    }
    
    public InvoiceLine(String itemName, double itemPrice, int count, InvoiceHeader header) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.count = count;
        this.header = header;
    }

    public InvoiceHeader getHeader() {
        return header;
    }

    public void setHeader(InvoiceHeader header) {
        this.header = header;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getLineTotal() {
        return count*itemPrice;
    }

    @Override
    public String toString() {
        return "InvoiceLine{" + "itemName=" + itemName + ", itemPrice=" + itemPrice + ", count=" + count + ", lineTotal=" +getLineTotal()+ '}';
    }
 public String getAsCSV() {
        return header.getId()+ "," + itemName + "," + itemPrice + "," + count;
    }


    
}
