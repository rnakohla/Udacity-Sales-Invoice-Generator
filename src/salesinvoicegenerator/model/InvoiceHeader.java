
package salesinvoicegenerator.model;

import java.util.ArrayList;


public class InvoiceHeader {
    private int id;
    private String customerName;
    private String Date;
    private ArrayList<InvoiceLine> lines;
    
    
    public InvoiceHeader(){
    }
    

    public InvoiceHeader(int id, String customerName, String Date) {
        this.id = id;
        this.customerName = customerName;
        this.Date = Date;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    

    public double getInvoiceTotal() {
        double total=0.0;
        for(InvoiceLine line :getLines()){
        total+=line.getLineTotal();
        }
      
        return total ;
    }

    @Override
    public String toString() {
        return "InvoiceHeader{" + "id=" + id + ", customerName=" + customerName + ", Date=" + Date + '}';
    }

    public ArrayList<InvoiceLine> getLines() {
         if(lines==null){
             lines=new ArrayList<>();
             
         }
     
        return lines;
        
    }
     public String getAsCSV() {
        return id + "," + Date + "," + customerName;
    }

}
