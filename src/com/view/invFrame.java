package com.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.KeyEvent;

public class invFrame extends JFrame {
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

    public invFrame() {

        super("Sales Invoice Generator");


        setContentPane(invoiceFrame);
        //to handle the   layout
        //setLayout(new FlowLayout());

        //creation of menu and its items
        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");


        loadFileItem = new JMenuItem("Load File", 'l');

        savaFileItem = new JMenuItem("Save File", 'S');

        loadFileItem.setAccelerator(KeyStroke.getKeyStroke('L', KeyEvent.ALT_DOWN_MASK));

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
        setSize(1000,800);

        setLocation(180,100);
        pack();

        //close when clicking on th X
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
