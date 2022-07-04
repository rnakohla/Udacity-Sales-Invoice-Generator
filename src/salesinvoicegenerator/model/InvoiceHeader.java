
package salesinvoicegenerator.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class InvoiceHeader {
    private int id;
    private String customerName;
    private String Date;
    private ArrayList<InvoiceLine> lines;
    private Date dates;
    
    
    
    public InvoiceHeader(){
    }
    

    public InvoiceHeader(int id, String customerName, String Date) {
        this.id = id;
        this.customerName = customerName;
        this.Date = Date;
    }
  /*  public Date getFormat() throws ParseException{
        DateFormat df=new SimpleDateFormat(getDate());
        df.setLenient(false);
        Date d1=df.parse(getDate());
        
    return dates; 
    }
*/
    public String getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.dates = Date;
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
