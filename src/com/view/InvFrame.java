package com.view;

import com.model.InvoiceHeader;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import com.controller.InvController;
import com.model.InvoiceHeader;
public class InvFrame extends JFrame {



    private InvController controller=new InvController(this);
    public static SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy"); ;
    private JPanel invoiceFrame;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JButton deleteInvoiceButton;
    private JButton createNewInvoiceButton;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel invoiceNumberLabel;
    private JLabel invoiceDateLabel;
    private JLabel numberOfInvoices;
    private JLabel totalOfInvoices;
    private JTable invoiceItemsTable;
    private JButton saveButton;
    private JButton cancelButton;
    private JTable invoiceTable;


    private String[] headerInvoiceTbl = {"N0.", "Date", "Customer", "Total"};

    private String[][] dataInvoiceTbl = {
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""},
    };

    private String[] headerInvoiceItem = {"N0.", "Item Name", "Item Price", "Count", "Item Total"};

    private String[][] dataInvoiceItem = {
            {"", "", "", "", "", ""},
            {"", "", "", "", "", ""},
            {"", "", "", "", "", ""},
            {"", "", "", "", "", ""},
    };
    private JMenuBar menuBar;

    private JMenu fileMenu;
    private JMenuItem loadFileItem;
    private JMenuItem savaFileItem;

    public void setInvoices(ArrayList<InvoiceHeader> invoices) {
        this.invoices = invoices;
    }

    private ArrayList<InvoiceHeader> invoices;


    public InvController getController() {
        return controller;
    }
    public InvFrame() {

        super("Sales Invoice Generator");


        setContentPane(invoiceFrame);
        //to handle the   layout
        //setLayout(new FlowLayout());

        //creation of menu and its items
        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        InvController load=new InvController();

        loadFileItem = new JMenuItem("Load File", 'l');



        savaFileItem = new JMenuItem("Save File", 'S');

        loadFileItem.setAccelerator(KeyStroke.getKeyStroke('L', KeyEvent.ALT_DOWN_MASK));

        loadFileItem.addActionListener(load);

        savaFileItem.setAccelerator(KeyStroke.getKeyStroke('S', KeyEvent.ALT_DOWN_MASK));

        fileMenu.add(loadFileItem);

        fileMenu.add(savaFileItem);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        //creation of table
        // setLayout(new FlowLayout());
        invoiceTable.setModel(new DefaultTableModel(dataInvoiceTbl, headerInvoiceTbl));

        invoiceItemsTable.setModel(new DefaultTableModel(dataInvoiceItem, headerInvoiceItem));

        //add(invoiceTable);
        setSize(1000, 800);

        setLocation(180, 100);
        pack();


        //close when clicking on th X
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

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
            java.util.logging.Logger.getLogger(InvFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new InvFrame().setVisible(true);
                InvFrame f = new InvFrame();
                //f.controller.loadFile("InvoiceHeader.csv", "InvoiceLine.csv");
                f.setVisible(true);
            }
        });
    }

    public ArrayList<InvoiceHeader>getInvoices() {
        if (invoices == null) {
            invoices = new ArrayList<>();


        }
        return invoices;
    }


    public JTable getInvoiceItemsTable() {
        return invoiceItemsTable;
    }

    public void setInvoiceItemsTable(JTable invoiceItemsTable) {
        this.invoiceItemsTable = invoiceItemsTable;
    }

    public JTable getInvoiceTable() {
        return invoiceTable;
    }

    public void setInvoiceTable(JTable invoiceTable) {
        this.invoiceTable = invoiceTable;
    }

    public String[] getHeaderInvoiceTbl() {
        return headerInvoiceTbl;
    }

    public void setHeaderInvoiceTbl(String[] headerInvoiceTbl) {
        this.headerInvoiceTbl = headerInvoiceTbl;
    }

    public String[][] getDataInvoiceTbl() {
        return dataInvoiceTbl;
    }

    public void setDataInvoiceTbl(String[][] dataInvoiceTbl) {
        this.dataInvoiceTbl = dataInvoiceTbl;

        this.invoiceTable.setModel(new DefaultTableModel(this.dataInvoiceTbl, headerInvoiceTbl));
    }
    public void test ()
    {
        System.out.println(getInvoices()+"sss" );

    }
}





