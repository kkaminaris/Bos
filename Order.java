package sample;

import java.util.ArrayList;

public class Order{
    private int katasthma;
    private int pelaths;
    private String date;
    private String sxolia;
    private Card karta;
    private int troposPlhrwmhs;//0=den exei dialleksei 1=metrhta 2=card
    private ArrayList<Product> proiontaorder = new ArrayList<>();
    private int status;//0 oxi olklhrwmenh 1 oloklhrwmneh

    public void settroposplhrwmhs(int x){this.troposPlhrwmhs=x;}
    public void settroposplhrwmhs(int x,Card y){this.troposPlhrwmhs=x;this.karta=y;}

    public void setsxolia(String sxolia) {
        this.sxolia = sxolia;
    }

    public void setkarta(Card karta) {
        this.karta = karta;
    }

    public Card getkarta() {
        return karta;
    }

    public void setpelaths(int pelaths) {
        this.pelaths = pelaths;
    }

    public void setkatasthma(int katasthma) {
        this.katasthma = katasthma;
    }

    public void setstatus(int status) {
        this.status = status;
    }

    public int gettroposplhrwmhs() {
        return troposPlhrwmhs;
    }

    public void setproiontaorder(ArrayList<Product> proiontaorder) {
        this.proiontaorder = proiontaorder;
    }
}
