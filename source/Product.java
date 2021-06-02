package sample;

public class Product {
    private String timh;
    private String kwdikos;
    private String name;

    public Product(String timh, String kwdikos, String name) {
        this.name = name;
        this.timh = timh;
        this.kwdikos = kwdikos;
    }

    public String gettimh() {
        return timh;
    }

    public void settimh(String editedtimh) {
        this.timh = editedtimh;
    }

    public String getkwdikos() {
        return kwdikos;
    }

    public void setkwdikos(String editedkwdikos) {
        this.kwdikos = editedkwdikos;
    }

    public String getname() {
        return name;
    }

    public void setname(String editedname) {
        this.name = editedname;
    }
}