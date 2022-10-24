package com.model;
;

public class InvoiceLine extends InvoiceHeader {
    //fields of Invoice line

    private String itemName;

    private int invoicenum;
    private double itemPrice;
    //private InvoiceHeader invoice;
    private int count;



    public InvoiceLine(int num,String itemName, double itemPrice, int count){
        super();

        this.itemName=itemName;

        this.itemPrice=itemPrice;

        this.count=count;

        this.invoicenum=num;


    }

    public double getTotal(){
        return count* itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getCount() {
        return count;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setCount(int count) {
        this.count = count;
    }
}