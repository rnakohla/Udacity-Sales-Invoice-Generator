/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesinvoicegenerator.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author DELL
 */
public class InvoiceLineTableModel extends AbstractTableModel{

    private ArrayList<InvoiceLine> invoiceData;
    
    private String[]col={"Invoice Id","Item Name","Item Price","Count"};

    public ArrayList<InvoiceLine> getInvoiceData() {
        return invoiceData;
    }

    public InvoiceLineTableModel(ArrayList<InvoiceLine> invoiceData) {
        this.invoiceData = invoiceData;
    }
    
    
    
    @Override
    public int getRowCount() {
        return invoiceData.size();
    }

    @Override
    public int getColumnCount() {
        return col.length;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) { 
        InvoiceLine line=invoiceData.get(rowIndex);
        switch(columnIndex){
        case 0:
        return line.getHeader().getId();
        case 1:
        return line.getItemName();
        case 2:
        return line.getItemPrice();
        case 3:
        return line.getCount();
        case 4:
        return line.getLineTotal();
                    
        }
       return ""; 
    }

    @Override
    public String getColumnName(int column) {
        return col[column];
                }
    
    
}
