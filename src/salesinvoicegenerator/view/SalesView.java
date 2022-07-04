/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesinvoicegenerator.view;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import salesinvoicegenerator.Controller.Controller;
import salesinvoicegenerator.model.InvoiceHeader;
import salesinvoicegenerator.model.InvoiceHeaderTableModel;

/**
 *
 * @author DELL
 */
public class SalesView extends javax.swing.JFrame {

    
    public SalesView() {
        controller=new Controller(this);
                
        initComponents();
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        NumTxtField = new javax.swing.JTextField();
        CustomerNametxtfield = new javax.swing.JTextField();
        InvoiceDateTxtField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DialogSaveBtn = new javax.swing.JButton();
        DialogSaveBtn.addActionListener(controller);
        DialogCancel = new javax.swing.JButton();
        DialogCancel.addActionListener(controller);
        jDialog2 = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CreateNewLine = new javax.swing.JButton();
        CreateNewLine.addActionListener(controller);

        CancelItem = new javax.swing.JButton();
        CancelItem.addActionListener(controller);
        itemTxtField = new javax.swing.JTextField();
        priceTxt = new javax.swing.JTextField();
        CountTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        invHeaderTable = new javax.swing.JTable();
        invHeaderTable.getSelectionModel().addListSelectionListener(controller);
        jScrollPane2 = new javax.swing.JScrollPane();
        invLineTable = new javax.swing.JTable();
        createInvoiceBtn = new javax.swing.JButton();
        createInvoiceBtn.addActionListener(controller);

        deleteInvoiceBtn = new javax.swing.JButton();
        deleteInvoiceBtn.addActionListener(controller);

        createItemBtn = new javax.swing.JButton();
        createItemBtn.addActionListener(controller);

        deleteItemBtn = new javax.swing.JButton();
        deleteItemBtn.addActionListener(controller);
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        invNumLbl = new javax.swing.JLabel();
        customerNameLbl = new javax.swing.JLabel();
        invDateLbl = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        InvoiceTotalLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadFilesBtn = new javax.swing.JMenuItem();
        loadFilesBtn.addActionListener(controller);
        saveFilesBtn = new javax.swing.JMenuItem();
        saveFilesBtn.addActionListener(controller);

        jDialog1.setTitle("Create New Invoice");

        NumTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumTxtFieldActionPerformed(evt);
            }
        });

        InvoiceDateTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvoiceDateTxtFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Invoice Id");

        jLabel2.setText("Customer Name");

        jLabel3.setText("Invoice Date");

        DialogSaveBtn.setText("Save");
        DialogSaveBtn.setActionCommand("Save Invoice");

        DialogCancel.setText("Cancel");
        DialogCancel.setActionCommand("Cancel Invoice Dialog");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(91, 91, 91)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NumTxtField)
                            .addComponent(CustomerNametxtfield)
                            .addComponent(InvoiceDateTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(DialogSaveBtn)
                        .addGap(84, 84, 84)
                        .addComponent(DialogCancel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NumTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CustomerNametxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InvoiceDateTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DialogSaveBtn)
                    .addComponent(DialogCancel))
                .addGap(34, 34, 34))
        );

        jLabel4.setText("Item Name");

        jLabel5.setText("Item Price");

        jLabel6.setText("Item Count");

        CreateNewLine.setText("Create New Item");
        CreateNewLine.setActionCommand("Create New line");
        CreateNewLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateNewLineActionPerformed(evt);
            }
        });

        CancelItem.setText("Cancel");
        CancelItem.setActionCommand("CancelItem");

        itemTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTxtFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(72, 72, 72)
                        .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CountTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(priceTxt)
                            .addComponent(itemTxtField)))
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(CreateNewLine)
                        .addGap(101, 101, 101)
                        .addComponent(CancelItem)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(itemTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(CountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateNewLine)
                    .addComponent(CancelItem))
                .addGap(37, 37, 37))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invHeaderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Invoice ID", "Customer Name", "Invoice Date"
            }
        ));
        jScrollPane1.setViewportView(invHeaderTable);

        invLineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(invLineTable);

        createInvoiceBtn.setText("Create New Invoice");
        createInvoiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createInvoiceBtnActionPerformed(evt);
            }
        });

        deleteInvoiceBtn.setText("Delete Invoice");

        createItemBtn.setText("Create New Item");
        createItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createItemBtnActionPerformed(evt);
            }
        });

        deleteItemBtn.setText("Delete Item");

        jLabel7.setText("Invoice ID");

        jLabel8.setText("Customer Name");

        jLabel9.setText("Invoice Date");

        jLabel10.setText("Invoice Total");

        jMenu1.setText("File");

        loadFilesBtn.setText("Load Files");
        jMenu1.add(loadFilesBtn);

        saveFilesBtn.setText("Save Files");
        jMenu1.add(saveFilesBtn);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(createInvoiceBtn)
                        .addGap(48, 48, 48)
                        .addComponent(deleteInvoiceBtn)
                        .addGap(131, 131, 131)
                        .addComponent(createItemBtn)
                        .addGap(45, 45, 45)
                        .addComponent(deleteItemBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(InvoiceTotalLabel))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(invDateLbl))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8))
                                    .addGap(28, 28, 28)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(invNumLbl)
                                        .addComponent(customerNameLbl)))))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(invNumLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customerNameLbl)
                    .addComponent(jLabel8))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(invDateLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(InvoiceTotalLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createInvoiceBtn)
                    .addComponent(deleteInvoiceBtn)
                    .addComponent(createItemBtn)
                    .addComponent(deleteItemBtn))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NumTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumTxtFieldActionPerformed

    private void InvoiceDateTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvoiceDateTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InvoiceDateTxtFieldActionPerformed

    private void createInvoiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createInvoiceBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createInvoiceBtnActionPerformed

    private void itemTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemTxtFieldActionPerformed

    private void createItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createItemBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createItemBtnActionPerformed

    private void CreateNewLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateNewLineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateNewLineActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SalesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelItem;
    private javax.swing.JTextField CountTxt;
    private javax.swing.JButton CreateNewLine;
    private javax.swing.JTextField CustomerNametxtfield;
    private javax.swing.JButton DialogCancel;
    private javax.swing.JButton DialogSaveBtn;
    private javax.swing.JTextField InvoiceDateTxtField;
    private javax.swing.JLabel InvoiceTotalLabel;
    private javax.swing.JTextField NumTxtField;
    private javax.swing.JButton createInvoiceBtn;
    private javax.swing.JButton createItemBtn;
    private javax.swing.JLabel customerNameLbl;
    private javax.swing.JButton deleteInvoiceBtn;
    private javax.swing.JButton deleteItemBtn;
    private javax.swing.JLabel invDateLbl;
    private javax.swing.JTable invHeaderTable;
    private javax.swing.JTable invLineTable;
    private javax.swing.JLabel invNumLbl;
    private javax.swing.JTextField itemTxtField;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem loadFilesBtn;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JMenuItem saveFilesBtn;
    // End of variables declaration//GEN-END:variables
    private Controller controller;
    private ArrayList<InvoiceHeader> invoiceHeaderList ;
    private InvoiceHeaderTableModel headerTableModel;
    

    public Controller getController() {
        return controller;
    }

    public ArrayList<InvoiceHeader> getInvoiceHeaderList() {
        if (invoiceHeaderList == null) invoiceHeaderList = new ArrayList<>();
        return invoiceHeaderList;
    }

    public void setInvoiceHeaderList(ArrayList<InvoiceHeader> invoiceHeaderList) {
        this.invoiceHeaderList = invoiceHeaderList;
        headerTableModel=new InvoiceHeaderTableModel(invoiceHeaderList);
        this.invHeaderTable.setModel(headerTableModel);
 
    }

    public void setHeaderTableModel(InvoiceHeaderTableModel headerTableModel) {
        this.headerTableModel = headerTableModel;
    }

    public InvoiceHeaderTableModel getHeaderTableModel() {
        if (headerTableModel == null) {
            headerTableModel = new InvoiceHeaderTableModel(getInvoiceHeaderList());
        }
        return headerTableModel;
    }

    public void setInvHeaderTable(JTable invHeaderTable) {

        this.invHeaderTable = invHeaderTable;
        
    }

    public JLabel getInvoiceTotalLabel() {
        return InvoiceTotalLabel;
    }
    

    public JTable getInvHeaderTable() {
        
        return invHeaderTable;
    }

    public JLabel getCustomerNameLbl() {
        return customerNameLbl;
    }

    public JLabel getInvDateLbl() {
        return invDateLbl;
    }

    public JLabel getInvNumLbl() {
        return invNumLbl;
    }

    public JTable getInvLineTable() {
        return invLineTable;
    }

    public JTextField getNumTxtField() {
        return NumTxtField;
    }

    public JTextField getCustomerNametxtfield() {
        return CustomerNametxtfield;
    }

    public JButton getDialogCancel() {
        return DialogCancel;
    }

    public JButton getDialogSaveBtn() {
        return DialogSaveBtn;
    }

    public JTextField getInvoiceDateTxtField() {
        return InvoiceDateTxtField;
    }

    public JButton getCreateInvoiceBtn() {
        return createInvoiceBtn;
    }

    public JButton getCreateItemBtn() {
        return createItemBtn;
    }

    public JButton getDeleteInvoiceBtn() {
        return deleteInvoiceBtn;
    }

    public JButton getDeleteItemBtn() {
        return deleteItemBtn;
    }

    public JDialog getjDialog1() {
        return jDialog1;
    }

    public JButton getCancelItem() {
        return CancelItem;
    }

    public JTextField getCountTxt() {
        return CountTxt;
    }

    public JButton getCreateNewLine() {
        return CreateNewLine;
    }

    public JTextField getItemTxtField() {
        return itemTxtField;
    }

    public JDialog getjDialog2() {
        return jDialog2;
    }

    public JTextField getPriceTxt() {
        return priceTxt;
    }
     public int getNextInvoiceNum() {
        int num = 0;
        
        for (InvoiceHeader invoice : getInvoiceHeaderList()) {
            if (invoice.getId()> num) 
                num = invoice.getId();
        }
        
        return ++num;
    }
    


}

