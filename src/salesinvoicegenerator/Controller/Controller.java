/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesinvoicegenerator.Controller;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import salesinvoicegenerator.model.InvoiceHeader;
import salesinvoicegenerator.model.InvoiceHeaderTableModel;
import salesinvoicegenerator.model.InvoiceLine;
import salesinvoicegenerator.model.InvoiceLineTableModel;
import salesinvoicegenerator.view.SalesView;

/**
 *
 * @author DELL
 */
public class Controller extends JFrame implements ActionListener,ListSelectionListener{
    
    
    private SalesView view;
    public Controller (SalesView view){
     
        this.view=view; 
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand=e.getActionCommand();
        switch(actionCommand){
            
        case "Create New Invoice":
            createNewInvoice();
            break;
        case "Create New Item":
            createNewItem();
            break;
        case "Create New line":
                createNewline();
                break;
        case "Save Invoice":
                saveInvoice();
                break;
        case "Load Files":
            loadFiles();
            break;
        case "Save Files":
            saveFiles();
            break;
        case "Delete Invoice":
            deleteInvoice();
            break;
        case "Delete Item":
            deleteItem();
            break;
        case "CancelItem":
                    cancelItem();     
        case "Cancel Invoice Dialog":
                    cancelInvoiceDialog();
                    break;
                   }
        
        
        
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
         int selectedRow=view.getInvHeaderTable().getSelectedRow();
      //  ArrayList<InvoiceLine> Lines= view.getInvoiceHeaderList().get(selectedRow).getLines();
     // view.getInvLineTable().setModel(new InvoiceLineTableModel(Lines));
        
        if (selectedRow != -1) {
            System.out.println("You have selected row: " + selectedRow);
            InvoiceHeader currentInvoice = view.getInvoiceHeaderList().get(selectedRow);
            view.getInvNumLbl().setText("" + currentInvoice.getId());
            view.getInvDateLbl().setText(currentInvoice.getDate());
            view.getCustomerNameLbl().setText(currentInvoice.getCustomerName());
            view.getInvoiceTotalLabel().setText("" + currentInvoice.getInvoiceTotal());
            InvoiceLineTableModel linesTableModel = new InvoiceLineTableModel(currentInvoice.getLines());
            view.getInvLineTable().setModel(linesTableModel);
            linesTableModel.fireTableDataChanged();
        }
    }

    private void loadFiles() {
        JFileChooser fc=new  JFileChooser();
        try {
          JOptionPane.showMessageDialog(null, " please select Invoice header",
                " Invoice Header", JOptionPane.WARNING_MESSAGE);
        int result =fc.showOpenDialog(view);
        if(result==JFileChooser.APPROVE_OPTION){
             File headerFile=fc.getSelectedFile();
             String headerStrgPath =headerFile.getAbsolutePath();
             Path headerPath= Paths.get(headerStrgPath);
             List<String> headerLines= Files.lines(headerPath).collect(Collectors.toList());
             System.out.println("Invoices header have been read");
             ArrayList<InvoiceHeader> invoiceHeaderList =new ArrayList<>();
             for(String headerLine:headerLines){
               String[] parts=headerLine.split(",");
               int id =Integer.parseInt(parts[0]);
               InvoiceHeader invHeader=new InvoiceHeader(id, parts[2], parts[1]);  
               invoiceHeaderList.add(invHeader);
               System.out.println(invoiceHeaderList);
               view.setInvoiceHeaderList(invoiceHeaderList);
             InvoiceHeaderTableModel invoicesTableModel=new InvoiceHeaderTableModel(invoiceHeaderList);
             view.setHeaderTableModel(invoicesTableModel);
             view.getInvHeaderTable().setModel(invoicesTableModel);
             view.getHeaderTableModel().fireTableDataChanged();
        }
         
             JOptionPane.showMessageDialog(null, " please select Invoice Line File",
                " Invoice Line", JOptionPane.WARNING_MESSAGE);
             result=fc.showOpenDialog(view);
        if(result==JFileChooser.APPROVE_OPTION){
              String lineStrgPath=fc.getSelectedFile().getAbsolutePath();
              Path linePath =Paths.get(lineStrgPath);
              List<String>linesOflines =Files.lines(linePath).collect(Collectors.toList());
              for (String lineLine:linesOflines){
                 String[] parts=lineLine.split(",");
                 int invId= Integer.parseInt(parts[0]);
                 double price =Double.parseDouble(parts[2]);
                 int count = Integer.parseInt(parts[3]);
                 
                 InvoiceHeader header= getInvHeaderById(invoiceHeaderList, invId);
                  InvoiceLine invLine= new InvoiceLine(parts[1], price, count, header);
                  header.getLines().add(invLine);
            }
             view.setInvoiceHeaderList(invoiceHeaderList);
             InvoiceHeaderTableModel invoicesTableModel=new InvoiceHeaderTableModel(invoiceHeaderList);
             view.setHeaderTableModel(invoicesTableModel);
             view.getInvHeaderTable().setModel(invoicesTableModel);
             view.getHeaderTableModel().fireTableDataChanged();
             
             
          }
        }
      }catch (IOException ex){
             ex.printStackTrace();
        }  
    }
   private InvoiceHeader getInvHeaderById(ArrayList<InvoiceHeader> invoices,int id){
       for(InvoiceHeader invoice :invoices){
       if(invoice.getId()==id){
       return invoice;
       
       }
     }
       
       return null;
       
   }
    
    
    private void saveFiles() { ArrayList<InvoiceHeader> invoices = view.getInvoiceHeaderList();
      
        ////////////////  
        String headers = "";
        String lines = "";
        for (InvoiceHeader invoice : invoices) {
            String invCSV = invoice.getAsCSV();
            headers += invCSV;
            headers += "\n";

            for (InvoiceLine line : invoice.getLines()) {
                String lineCSV = line.getAsCSV();
                lines += lineCSV;
                lines += "\n";
            }
        }
        System.out.println("Checky");
        try {
            JFileChooser fc = new JFileChooser();
            File SelectedFile=new File ("InvoiceHeader.csv");
            SelectedFile.createNewFile();
            File SelectedFile2=new File("InvoiceLine.csv");
            SelectedFile2.createNewFile();

            int result = fc.showSaveDialog(view);
            if (result == JFileChooser.APPROVE_OPTION) {
                File headerFile = fc.getSelectedFile();
                FileWriter hfw = new FileWriter(headerFile);
                hfw.write(headers);
                hfw.flush();
                hfw.close();
                result = fc.showSaveDialog(view);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File lineFile = fc.getSelectedFile();
                    FileWriter lfw = new FileWriter(lineFile);
                    lfw.write(lines);
                    lfw.flush();
                    lfw.close();
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "File Not Found","Invoice Header ", JOptionPane.ERROR_MESSAGE);

        }
        
        
    }

    private void createNewInvoice() {
        view.getjDialog1().setVisible(true);
        view.getjDialog1().setSize(450, 300);
        view.getjDialog1().setLocation(50, 50);
        
    }

    private void deleteInvoice() {
        int selectedRow = view.getInvHeaderTable().getSelectedRow();
        if (selectedRow != -1) {
            view.getInvoiceHeaderList().remove(selectedRow);
            view.getHeaderTableModel().fireTableDataChanged();
        }
    }

    private void createNewItem() {
           
      if(view.getInvNumLbl().getText().equals("")){
          JOptionPane.showMessageDialog(this,"Please Select Invoice");
      }else{
         view.getjDialog2().setVisible(true);
         view.getjDialog2().setSize(450, 400);
         view.getjDialog2().setLocation(350, 150);;
      }
    }

    private void deleteItem() {
          int selectedRow = view.getInvLineTable().getSelectedRow();

        if (selectedRow != -1) {
            InvoiceLineTableModel linesTableModel = (InvoiceLineTableModel ) view.getInvLineTable().getModel();
            linesTableModel.getInvoiceData().remove(selectedRow); 
            linesTableModel.fireTableDataChanged();
            view.getHeaderTableModel().fireTableDataChanged();
        }
    }

    private void saveInvoice() {
        
      /*  

         
         InvoiceHeader invoice= new InvoiceHeader(id, customer, date);
         view.getInvoiceHeaderList().add(invoice);
         view.getHeaderTableModel().fireTableDataChanged();
         */
         
        try {
   
         if (view.getNumTxtField().getText().equals("")||view.getCustomerNametxtfield().getText().equals("")||view.getInvoiceDateTxtField().getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please Enter All Data ");
         }
         else{
               // String newInvoice[]={view.getNumTxtField().getText(),
                //view.getCustomerNametxtfield().getText(),view.getInvoiceDateTxtField().getText()};  
             ArrayList<InvoiceHeader> viewInvoice=new ArrayList<>();
             int id =Integer.parseInt(view.getNumTxtField().getText());
                      int num=view.getNextInvoiceNum();
             InvoiceHeader invheaderdisplay=new InvoiceHeader(num, view.getCustomerNametxtfield().getText(), view.getInvoiceDateTxtField().getText());
             viewInvoice.add(invheaderdisplay);
             view.setInvoiceHeaderList(viewInvoice);
             InvoiceHeaderTableModel headerTableModel = (InvoiceHeaderTableModel) view.getInvHeaderTable().getModel();
             headerTableModel.fireTableDataChanged();
             view.getHeaderTableModel().fireTableDataChanged();
         
             System.out.println("new invoice has been added ");
             
             
            view.getNumTxtField().setText("");
            view.getCustomerNametxtfield().setText("");
            view. getInvoiceDateTxtField().setText("");
            
        
            view.getjDialog1().setVisible(false);
            JOptionPane.showMessageDialog(this, "A new Invoice has been created Successfully");
                          
           
                
         }
         } catch (HeadlessException | NumberFormatException e) {
           JOptionPane.showMessageDialog(this, "Wrong Date Format","Date Format! ", JOptionPane.ERROR_MESSAGE);

        }
    }

    private void cancelInvoiceDialog() {
 
     view.getNumTxtField().setText("");
     view.getCustomerNametxtfield().setText("");
     view.getInvoiceDateTxtField().setText("");
     view.getjDialog1().setVisible(false);
    
    
    }

    private void createNewline() {
        //ArrayList<InvoiceLine> viewItem=new ArrayList<>();
        
        
        String item = view.getItemTxtField().getText();
        String countStr = view.getCountTxt().getText();
        String priceStr = view.getPriceTxt().getText();
        int count = Integer.parseInt(countStr);
        double price = Double.parseDouble(priceStr);
        int selectedInvoice = view.getInvHeaderTable().getSelectedRow();
        if (selectedInvoice != -1) {
            InvoiceHeader invoice = view.getInvoiceHeaderList().get(selectedInvoice);
            InvoiceLine line = new InvoiceLine(item, price, count, invoice);
            //invoice.getLines().add(line);
            InvoiceLineTableModel linesTableModel = (InvoiceLineTableModel) view.getInvLineTable().getModel();
            linesTableModel.getInvoiceData().add(line);

            linesTableModel.fireTableDataChanged();
            view.getHeaderTableModel().fireTableDataChanged();
        }
        view.getjDialog2().setVisible(false);
        view.getItemTxtField().setText("");
        view.getPriceTxt().setText("");
        view.getCountTxt().setText("");
        
 
        
    }
    
    private void cancelItem() {
     view.getItemTxtField().setText("");
     view.getPriceTxt().setText("");
     view.getCountTxt().setText("");
     view.getjDialog2().setVisible(false);
     
        
    }
    
    
}
