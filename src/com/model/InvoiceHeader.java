package com.model;

import java.util.ArrayList;
import java.util.Date;

public class InvoiceHeader {

    //fields of Invoice line

    private int invoiceNum;

    private Date invoiceDate;

    private String invoiceName;

    private ArrayList<InvoiceHeader> headers;


    public InvoiceHeader(int num, Date date, String name) {
        this.invoiceNum=num;
        this.invoiceDate=date;
        this.invoiceName=name;
    }

    public int getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(int invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getInvoiceName() {
        return invoiceName;
    }

    public void setInvoiceName(String invoiceName) {
        this.invoiceName = invoiceName;
    }

    public ArrayList<InvoiceHeader> getHeader() {
        return headers;
    }

    public void setHeader(ArrayList<InvoiceHeader> lines) {
        this.headers = headers;
    }

    public InvoiceHeader() {

    }
}