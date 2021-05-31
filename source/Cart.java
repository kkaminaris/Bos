package sample;

import java.util.ArrayList;

public class Cart {
    private int kostos;
    private ArrayList<Product> productsincart = new ArrayList<>();
    private ArrayList<Offer> offersincart = new ArrayList<>();
    private ArrayList<Integer> quantity = new ArrayList<>();
    private ArrayList<Integer> prices = new ArrayList<>();
    private ArrayList<Integer> offerquantity = new ArrayList<>();
    private ArrayList<Integer> offerprices = new ArrayList<>();

    public void setoffersincart(ArrayList<Offer> offersincart) {
        this.offersincart = offersincart;
    }
    public void setofferprices(ArrayList<Integer> offerprices) {
        this.offerprices = offerprices;
    }
    public void setquantity(ArrayList<Integer> quantity) {
        this.quantity = quantity;
    }
    public void setprices(ArrayList<Integer> prices) {
        this.prices = prices;
    }
    public void setofferquantity(ArrayList<Integer> offerquantity) {
        this.offerquantity = offerquantity;
    }
    public void setkostos(int x) {
        kostos = x;
    }
    public void setproductsincart(ArrayList<Product> productsincart) {
        this.productsincart = productsincart;
    }

    public ArrayList<Product> getproductsincart() {
        return productsincart;
    }
    public ArrayList<Integer> getquantity() {
        return quantity;
    }
    public ArrayList<Integer> getprices() {
        return prices;
    }
    public ArrayList<Integer> getofferprices() {
        return offerprices;
    }
    public ArrayList<Integer> getofferquantity() {
        return offerquantity;
    }
    public ArrayList<Offer> getoffersincart() {
        return offersincart;
    }
    public int getkostos() {
        return kostos;
    }


}