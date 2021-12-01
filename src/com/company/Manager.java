package com.company;

import java.util.ArrayList;

public class Manager {
    private ArrayList<Product> p;
    private ArrayList<Client> c;
    private ArrayList<Sales> s;

    public static void main(String[] args) {
        Data d=new Data(10,12,2020);
        Data d1=new Data(12,12,2020);
        Data d2=new Data(11,12,2020);
        PayLess pro=new PayLess(d,d1);
        ThreeTakeFour pra =new ThreeTakeFour(d,d1);
        Food p = new Food(12345,"banana",1,12,pro,12,12);
        Furniture f =new Furniture(123,"cadeira",1,10,15,10);
        Cleaning pq = new Cleaning(1234,"banana",1,12,pra,8);
        Manager m=new Manager();
        Client c = new Client("luisao","cu de judas","luisao@gmail.com",d,true);
        m.p.add(p);
        //m.p.add(p);
        //m.p.add(pq);
        Sales s=new Sales(12, c, d2);
        s.setP(f);
        s.setP(p);
        s.setP(p);
        s.setP(p);
        s.setP(p);
        s.setP(pq);
        s.setP(pq);
        s.setP(pq);
        s.setP(pq);
        s.setP(pq);
        s.setP(pq);
        s.setP(pq);
        s.setP(pq);
        s.setP(pq);
        System.out.println(s);

    }

    public Manager() {
        p = new ArrayList<>();
        c = new ArrayList<>();
        s = new ArrayList<>();

    }

    public ArrayList<Product> getP() {
        return p;
    }

    public void setP(ArrayList<Product> p) {
        this.p = p;
    }

    public ArrayList<Client> getC() {
        return c;
    }

    public void setC(ArrayList<Client> c) {
        this.c = c;
    }

    public ArrayList<Sales> getS() {
        return s;
    }

    public void setS(ArrayList<Sales> s) {
        this.s = s;
    }

    public void login() {

    }

    public void buy() {

    }

    public void consultSales() {

    }

    private void promVerifier() {

    }

    private double finalPrice() {
        return 0;
    }
    private double dimensionCalc(){
        return 0;
    }
}
