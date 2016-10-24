package com.ironyard.budget.Data;

/**
 * Created by sam on 10/12/16.
 */
public class LineItems {

    private long id;
    private String description;
    private String category;
    private double ba;
    private double aa;

    public long getId() { return id; }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getBa() {
        return ba;
    }

    public void setBa(double ba) {
        this.ba = ba;
    }

    public double getAa() {
        return aa;
    }

    public void setAa(double aa) {
        this.aa = aa;
    }




}
