package com.ironyard.budget.Data;

import java.util.List;

/**
 * Created by sam on 10/12/16.
 */
public class Budget {
    private long id;
    private double alltotal;
    private double leisure;
    private double eating;
    private double rent;
    private int transport;
    private List<LineItems> lineitems;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAlltotal() {
        return alltotal;
    }

    public void setAlltotal(double alltotal) {
        this.alltotal = alltotal;
    }

    public double getLeisure() {
        return leisure;
    }

    public void setLeisure(double leisure) {
        this.leisure = leisure;
    }

    public double getEating() {
        return eating;
    }

    public void setEating(double eating) {
        this.eating = eating;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public int getTransport() {
        return transport;
    }

    public void setTransport(int transport) {
        this.transport = transport;
    }

    public List<LineItems> getLineitems() {
        return lineitems;
    }

    public void setLineitems(List<LineItems> lineitems) {
        this.lineitems = lineitems;
    }

}