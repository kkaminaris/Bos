package sample;


import java.util.ArrayList;

public class Store extends User{

    private String afm;
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<String> categories = new ArrayList<>();
    private ArrayList<Integer> prosekat = new ArrayList<>();//antistoixhsh proiontwn se categories -1 otan den exei cat alliws to i ths cat
    private ArrayList<Offer> offers = new ArrayList<>();
    private ArrayList<Filters> filt = new ArrayList<>();
    private String address;

    public Store(String name, String phone_number, String email ,String password,String afm,String address) {
        this.name = name;
        this.phone_number = phone_number;
        this.email = email;
        this.password = password;
        this.afm = afm;
        this.address=address;
    }
    public String getafm()
    {
        return afm;
    }
    public ArrayList<Product> getproducts() {
        return products;
    }
    public ArrayList<String> getcategories() {
        return categories;
    }
    public ArrayList<Offer> getoffers() {
        return offers;
    }
    public ArrayList<Integer> getprosekat() {
        return prosekat;
    }
    public ArrayList<Filters> getfilt() {
        return filt;
    }

    public void setafm(String editedafm){ this.afm = editedafm;}
    public void setcategories(ArrayList<String> categories) {
        this.categories = categories;
    }
    public void setproducts(ArrayList<Product> products) {
        this.products = products;
    }
    public void setprosekat(ArrayList<Integer> prosekat) {
        this.prosekat = prosekat;
    }
    public void setfilt(ArrayList<Filters> filt) {
        this.filt = filt;
    }
}
