/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesinvoicegenerator.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class InvoiceHeaderTableModel extends AbstractTableModel{

    private ArrayList<InvoiceHeader> data;

    private String[]col ={"Invoice Id","Customer Name","Invoice Date","Total"};

    public InvoiceHeaderTableModel(ArrayList<InvoiceHeader> data) {
        this.data = data;
    }

    public void setData(ArrayList<InvoiceHeader> data) {
        this.data = data;
    }
    

    
    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return col.length;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         
        InvoiceHeader header = data.get(rowIndex);
        switch(columnIndex){
        case 0:
        return header.getId();
        case 1:
        return header.getCustomerName();
        case 2:
        return header.getDate();
        case 3:
        return header.getInvoiceTotal();
        
        }
        
        
        
        return "";
        
    }
    

    @Override
    public String getColumnName(int column) {
        return col[column]; 
    }
    
}
     

    

