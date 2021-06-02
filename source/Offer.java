package sample;

import java.util.ArrayList;


public class Offer{
    private int oldprice=0;
    private String price;
    private String offername;
    private ArrayList<Product> productsinoffer = new ArrayList<>();
    private ArrayList<Integer> quantity = new ArrayList<>();
    private ArrayList<Integer> prices = new ArrayList<>();

    public ArrayList<Product> getproductsinoffer() {
        return productsinoffer;
    }
    public ArrayList<Integer> getquantity() {
        return quantity;
    }
    public ArrayList<Integer> getprices() {
        return prices;
    }
    public int getoldprice() {
        return oldprice;
    }

    public void setproductsinoffer(ArrayList<Product> productsinoffer) {
        this.productsinoffer = productsinoffer;
    }
    public void setquantity(ArrayList<Integer> quantity) {
        this.quantity = quantity;
    }
    public void setprices(ArrayList<Integer> prices) {
        this.prices = prices;
    }
    public void setoldprice(int oldprice) {
        this.oldprice = oldprice;
    }

    public String getoffername() {
        return offername;
    }
    public void setoffername(String editedname){ this.offername = editedname;}
    public String getofferprice() {
        return price;
    }
    public void setofferprice(String editedprice){ this.price= editedprice;}
}
