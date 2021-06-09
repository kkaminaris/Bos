package sample;

import java.util.ArrayList;

public class Filters{
    private String cat;
    private ArrayList<String> filter = new ArrayList<>();

    public Filters(String cat) {
        this.cat = cat;
        this.filter.add("price ↑");
        this.filter.add("price ↓");
        this.filter.add("name ↑");
        this.filter.add("name ↓");
    }
    public void setcat(String editedcatname){ this.cat = editedcatname;}

    public ArrayList<String> getfilter() {
        return filter;
    }
}
