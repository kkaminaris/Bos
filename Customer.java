package sample;

import java.util.ArrayList;

public class Customer extends User{
    private Cart kalathi = new Cart();
    private ArrayList<Card> cards = new ArrayList<>();
    public Customer(String name, String phone_number, String email ,String password) {
        this.name = name;
        this.phone_number = phone_number;
        this.email = email;
        this.password = password;
    }

    public Cart getkalathi() {
        return kalathi;
    }
    public ArrayList<Card> getcards() {
        return cards;
    }

    public void setkalathi(Cart kalathi) {
        this.kalathi = kalathi;
    }
    public void setcards(ArrayList<Card> cards) {
        this.cards = cards;
    }
}
