package sample;

public class Card{
    private String egw;
    private String cvv;
    private String exp_date;
    private String number;
    public Card(String name, String number, String  exp_date,String cvv) {
        this.name = name;
        this.number = number;
        this.exp_date = exp_date;
        this.cvv = cvv;
    }

    public String getnumber() {
        return number;
    }
}