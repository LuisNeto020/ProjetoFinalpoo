package com.company;

public abstract class Promotion {
    private Data startDate;
    private Data finalDate;


    public Promotion(Data startDate ,Data finalDate) {
        this.startDate=startDate;
        this.finalDate=finalDate;
    }

    public Data getStartDate() {
        return startDate;
    }

    public void setStartDate(Data startDate) {
        this.startDate = startDate;
    }

    public Data getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Data finalDate) {
        this.finalDate = finalDate;
    }
    public abstract double calculaDesconto(double unitprice , int count);

}
