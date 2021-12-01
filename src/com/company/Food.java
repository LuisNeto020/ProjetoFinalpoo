
package com.company;
public class Food extends Product {
    private double nCalorie;
    private double fatPercent;

    public Food(int id, String name, double unitPrice, int stock, Promotion prom, double nCalorie, double fatPercent) {
        super(id, name, unitPrice, stock, prom);
        this.nCalorie = nCalorie;
        this.fatPercent = fatPercent;
    }

    public Food(int id, String name, double unitPrice, int stock, double nCalorie, double fatPercent) {
        super(id, name, unitPrice, stock);
        this.nCalorie = nCalorie;
        this.fatPercent = fatPercent;
    }

    public double getnCalorie() {
        return nCalorie;
    }

    public void setnCalorie(double nCalorie) {
        this.nCalorie = nCalorie;
    }

    public double getFatPercent() {
        return fatPercent;
    }

    public void setFatPercent(double fatPercent) {
        this.fatPercent = fatPercent;
    }

    @Override
    public String toString() {
        return "Food{" +
                "nCalorie=" + nCalorie +
                ", fatPercent=" + fatPercent +
                '}';
    }
    public int costextra(){
        return 0;
    }
}
