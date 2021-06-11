package sample;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Main extends Application
 {
    ArrayList<Customer> customers = new ArrayList<>();
    ArrayList<Store> stores = new ArrayList<>();
    Stage window;
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("BOS");
        window = primaryStage;
        GridPane mypane = new GridPane();
        mypane.setPadding(new Insets(15));
        mypane.setHgap(5);
        mypane.setVgap(5);
        mypane.setAlignment(Pos.CENTER);
        Button button = new Button("WELCOME TO BOS!");
        mypane.add(button, 1, 1);
        button.setOnAction(e -> startapp());
        window.setScene(new Scene(mypane, 800, 700));
        window.show();
    }

    public void startapp(){
        GridPane mypane = new GridPane();
        mypane.setPadding(new Insets(15));
        mypane.setHgap(5);
        mypane.setVgap(5);
        mypane.setAlignment(Pos.CENTER);
        Button Button2 = new Button("REGISTER");
        mypane.add(Button2, 1, 3);
        GridPane.setHalignment(Button2, HPos.LEFT);
        Button2.setOnAction(e -> register());
        Button Button1 = new Button("SIGN IN");
        mypane.add(Button1, 1, 5);
        GridPane.setHalignment(Button1, HPos.LEFT);
        Button1.setOnAction(e -> signin());
        Button Button3 = new Button("REGISTER AS STORE");
        mypane.add(Button3, 1, 7);
        GridPane.setHalignment(Button3, HPos.LEFT);
        Button3.setOnAction(e -> registerstore());
        Button Button4 = new Button("SIGN IN AS STORE");
        mypane.add(Button4, 1, 9);
        GridPane.setHalignment(Button4, HPos.LEFT);
        Button4.setOnAction(e -> signinstore());
        window.setScene(new Scene(mypane, 800, 700));
        window.show();
    }

     public void register() {
         GridPane mypane = new GridPane();
         mypane.setPadding(new Insets(15));
         mypane.setHgap(5);
         mypane.setVgap(5);
         mypane.setAlignment(Pos.CENTER);
         TextField nametf = new TextField();
         TextField phonetf = new TextField();
         TextField emailtf = new TextField();
         TextField passwordtf = new TextField();
         mypane.add(nametf, 1, 1);
         mypane.add(phonetf, 1, 2);
         mypane.add(emailtf, 1, 3);
         mypane.add(passwordtf, 1, 4);
         mypane.add(new Label("PLEASE FILL THE INFO"), 0, 0);
         mypane.add(new Label("NAME:"), 0, 1);
         mypane.add(new Label("PHONE:"), 0, 2);
         mypane.add(new Label("EMAIL:"), 0, 3);
         mypane.add(new Label("PASSWORD:"), 0, 4);
         Button aButton = new Button("REGISTER");
         mypane.add(aButton, 1, 5);
         GridPane.setHalignment(aButton, HPos.LEFT);
         aButton.setOnAction(e -> {
             Customer temp = new Customer(nametf.getText(),phonetf.getText(),emailtf.getText(),passwordtf.getText());
             customers.add(temp);
             anazhthshkatasthmatos(customers.size()-1,-1,null);
         });
         Button bButton = new Button("BACK");
         mypane.add(bButton, 0, 5);
         GridPane.setHalignment(aButton, HPos.LEFT);
         bButton.setOnAction(e -> startapp());
         window.setScene(new Scene(mypane, 800, 700));
         window.show();
     }

     public void signin(){
         AtomicBoolean success= new AtomicBoolean(false);
         GridPane mypane = new GridPane();
         mypane.setPadding(new Insets(15));
         mypane.setHgap(5);
         mypane.setVgap(5);
         mypane.setAlignment(Pos.CENTER);
         TextField emailtf = new TextField();
         TextField passwordtf = new TextField();
         mypane.add(emailtf, 1, 1);
         mypane.add(passwordtf, 1, 2);
         mypane.add(new Label("PLEASE FILL THE INFO"), 0, 0);
         mypane.add(new Label("EMAIL:"), 0, 1);
         mypane.add(new Label("PASSWORD:"), 0, 2);
         Button signinButton = new Button("SIGN IN");
         mypane.add(signinButton, 1, 5);
         GridPane.setHalignment(signinButton, HPos.LEFT);
         signinButton.setOnAction(e -> {
             for (int i = 0; i < customers.size(); i++) {
                 if(customers.get(i).getemail().equals(emailtf.getText())){
                     if(customers.get(i).getpassword().equals(passwordtf.getText())){
                         anazhthshkatasthmatos(i,-1,null);
                         success.set(true);
                     }
                 }
             }
             if(!success.get()) mypane.add(new Label("INVALID INFO!"), 0, 6);
         });
         Button bButton = new Button("BACK");
         mypane.add(bButton, 0, 5);
         GridPane.setHalignment(signinButton, HPos.LEFT);
         bButton.setOnAction(e -> startapp());
         window.setScene(new Scene(mypane, 800, 700));
         window.show();
     }

     public void registerstore() {
         GridPane mypane = new GridPane();
         mypane.setPadding(new Insets(15));
         mypane.setHgap(5);
         mypane.setVgap(5);
         mypane.setAlignment(Pos.CENTER);
         TextField nametf = new TextField();
         TextField phonetf = new TextField();
         TextField emailtf = new TextField();
         TextField passwordtf = new TextField();
         TextField afmtf = new TextField();
         mypane.add(nametf, 1, 1);
         mypane.add(phonetf, 1, 2);
         mypane.add(emailtf, 1, 3);
         mypane.add(passwordtf, 1, 4);
         mypane.add(afmtf, 1, 5);
         mypane.add(new Label("PLEASE FILL THE INFO"), 0, 0);
         mypane.add(new Label("NAME:"), 0, 1);
         mypane.add(new Label("PHONE:"), 0, 2);
         mypane.add(new Label("EMAIL:"), 0, 3);
         mypane.add(new Label("PASSWORD:"), 0, 4);
         mypane.add(new Label("AFM:"), 0, 5);
         Button aButton = new Button("REGISTER YOUR STORE");
         mypane.add(aButton, 1, 6);
         GridPane.setHalignment(aButton, HPos.LEFT);
         aButton.setOnAction(e -> {
             Store temp = new Store(nametf.getText(),phonetf.getText(),emailtf.getText(),passwordtf.getText(),afmtf.getText());
             stores.add(temp);
             arxikhselidastore(stores.size()-1);
         });
         Button bButton = new Button("BACK");
         mypane.add(bButton, 0, 6);
         GridPane.setHalignment(aButton, HPos.LEFT);
         bButton.setOnAction(e -> startapp());
         window.setScene(new Scene(mypane, 800, 700));
         window.show();
     }

     public void signinstore(){
         AtomicBoolean success= new AtomicBoolean(false);
         GridPane mypane = new GridPane();
         mypane.setPadding(new Insets(15));
         mypane.setHgap(5);
         mypane.setVgap(5);
         mypane.setAlignment(Pos.CENTER);
         TextField emailtf = new TextField();
         TextField passwordtf = new TextField();
         mypane.add(emailtf, 1, 1);
         mypane.add(passwordtf, 1, 2);
         mypane.add(new Label("PLEASE FILL THE INFO"), 0, 0);
         mypane.add(new Label("EMAIL:"), 0, 1);
         mypane.add(new Label("PASSWORD:"), 0, 2);
         Button aButton = new Button("SIGN IN");
         mypane.add(aButton, 1, 5);
         GridPane.setHalignment(aButton, HPos.LEFT);
         aButton.setOnAction(e -> {
             for (int i = 0; i < stores.size(); i++) {
                 if(stores.get(i).getemail().equals(emailtf.getText())){
                     if(stores.get(i).getpassword().equals(passwordtf.getText())){
                         arxikhselidastore(i);
                         success.set(true);
                     }
                 }
             }
             if(!success.get()) mypane.add(new Label("INVALID INFO!"), 0, 6);
         });
         Button bButton = new Button("BACK");
         mypane.add(bButton, 0, 5);
         GridPane.setHalignment(aButton, HPos.LEFT);
         bButton.setOnAction(e -> startapp());
         window.setScene(new Scene(mypane, 800, 700));
         window.show();
     }

     public void editstock(int x){
         VBox mypane = new VBox();
         mypane.setPadding(new Insets(10));
         mypane.setSpacing(8);
         mypane.setAlignment(Pos.CENTER);
         ScrollPane scrollPane = new ScrollPane(mypane);
         scrollPane.setFitToHeight(true);
         BorderPane miniborder = new BorderPane(scrollPane);
         BorderPane border = new BorderPane();
         Text title = new Text("CATEGORIES");
         title.setFont(Font.font("Arial", FontWeight.BOLD, 14));
         mypane.getChildren().add(title);
         Button[] array = new Button[stores.get(x).getcategories().size()];
         if(stores.get(x).getcategories().size()==0){mypane.getChildren().add(new Label("NO CATEGORIES ADDED"));}
         else{
             for (int i = 0; i < stores.get(x).getcategories().size(); i++) {
                 array[i] = new Button(stores.get(x).getcategories().get(i));
                 mypane.getChildren().add(array[i]);
             }
         }
         for (int i = 0; i < stores.get(x).getcategories().size(); i++) {
             int finalI = i;
             array[i].setOnAction(e -> editcategory(x, finalI));
         }
         Button aButton = new Button("ADD CATEGORY");
         mypane.getChildren().add(aButton);
         GridPane.setHalignment(aButton, HPos.LEFT);
         aButton.setOnAction(e -> addcategory(x));

         VBox mypane5 = new VBox();
         mypane5.setPadding(new Insets(10));
         mypane5.setSpacing(8);
         mypane5.setAlignment(Pos.CENTER);
         Text title4 = new Text("OFFERS");
         title4.setFont(Font.font("Arial", FontWeight.BOLD, 14));
         mypane5.getChildren().add(title4);
         Button[] array3 = new Button[stores.get(x).getoffers().size()];
         if(stores.get(x).getoffers().size()==0){mypane5.getChildren().add(new Label("NO OFFERS ADDED"));}
         else{
             for (int i = 0; i < stores.get(x).getoffers().size(); i++) {
                 array3[i] = new Button(stores.get(x).getoffers().get(i).getoffername());
                 mypane5.getChildren().add(array3[i]);
             }
         }
         for (int i = 0; i < stores.get(x).getoffers().size(); i++) {
             int finalI = i;
             array3[i].setOnAction(e ->editoffer(x, finalI));
         }
         Button oButton = new Button("ADD OFFER");
         mypane5.getChildren().add(oButton);
         GridPane.setHalignment(oButton, HPos.LEFT);
         oButton.setOnAction(e -> {
             Offer temp = new Offer();
             addoffer(x,temp,-1);
         });


         VBox mypane2 = new VBox();
         mypane2.setPadding(new Insets(10));
         mypane2.setSpacing(8);
         mypane2.setAlignment(Pos.CENTER);
         Text title2 = new Text("PRODUCTS");
         title2.setFont(Font.font("Arial", FontWeight.BOLD, 14));
         mypane2.getChildren().add(title2);
         Button[] array2 = new Button[stores.get(x).getproducts().size()];
         if(stores.get(x).getproducts().size()==0){mypane2.getChildren().add(new Label("NO PRODUCTS ADDED"));}
         else{
             for (int i = 0; i < stores.get(x).getproducts().size(); i++) {
                 array2[i] = new Button(stores.get(x).getproducts().get(i).getname());
                 mypane2.getChildren().add(array2[i]);
             }
             for (int i = 0; i < stores.get(x).getproducts().size(); i++) {
                 int finalI = i;
                 array2[i].setOnAction(e -> editproduct(x, finalI));
             }
         }
         Button aButton2 = new Button("ADD PRODUCT");
         mypane2.getChildren().add(aButton2);
         GridPane.setHalignment(aButton2, HPos.CENTER);
         aButton2.setOnAction(e -> addproduct(x));
         VBox mypane4 = new VBox();
         mypane4.setPadding(new Insets(10));
         mypane4.setSpacing(8);
         mypane4.setAlignment(Pos.BOTTOM_RIGHT);
         Button aButton3 = new Button("BACK");
         mypane4.getChildren().add(aButton3);
         aButton3.setOnAction(e -> arxikhselidastore(x));

         miniborder.setRight(mypane5);
         miniborder.setLeft(mypane);
         miniborder.setCenter(mypane2);
         border.setCenter(miniborder);
         border.setRight(mypane4);
         Text title3 = new Text("BOS");
         title3.setFill(Color.GREEN);
         title3.setFont(Font.font ("Verdana", 20));
         VBox mypane3 = new VBox();
         mypane3.setAlignment(Pos.CENTER);
         mypane3.getChildren().add(title3);
         border.setTop(mypane3);
         window.setScene(new Scene(border, 800, 700));
         window.show();
     }

    public void anazhthshkatasthmatos(int y,int mod,String b){ //opou y thesh tou pelath sto arraylist, mod=mode opou -1 den exoume filtro kathgorias alliws h kathgoria -2 search bar
         int mode;
         mode=mod;
         ArrayList<Store> storestoshow = new ArrayList<>();
         GridPane mypane = new GridPane();
         mypane.setPadding(new Insets(15));
         mypane.setHgap(5);
         mypane.setVgap(5);
         mypane.setAlignment(Pos.TOP_RIGHT);
         BorderPane mypane2= new BorderPane();
         MenuItem userEditButton = new MenuItem("edit account");
         MenuItem logoutButton = new MenuItem("log out");
         MenuItem orderHIstoryButton = new MenuItem("order history");
         MenuButton menuButton = new MenuButton(customers.get(y).getname(), null, userEditButton, orderHIstoryButton ,logoutButton);
         mypane.add(menuButton, 1, 1);
         userEditButton.setOnAction(e -> editcustomer(y));
         logoutButton.setOnAction(e -> {
             ArrayList<Product> productsincart2= customers.get(y).getkalathi().getproductsincart();
             productsincart2.clear();
             customers.get(y).getkalathi().setproductsincart(productsincart2);
             ArrayList<Integer> clearlists = new ArrayList<>();
             ArrayList<Offer> clearoffers = new ArrayList<>();
             customers.get(y).getkalathi().setquantity(clearlists);
             customers.get(y).getkalathi().setprices(clearlists);
             customers.get(y).getkalathi().setoffersincart(clearoffers);
             customers.get(y).getkalathi().setofferquantity(clearlists);
             customers.get(y).getkalathi().setofferprices(clearlists);
             customers.get(y).getkalathi().setkostos(0);
             startapp();
         });
         VBox mypane5 = new VBox();
         mypane5.setPadding(new Insets(10));
         mypane5.setSpacing(8);
         mypane5.setAlignment(Pos.CENTER);
         TextField nametf = new TextField();
         mypane5.getChildren().add(nametf);
         Button searchButton = new Button("search");
         searchButton.setOnAction(e -> anazhthshkatasthmatos(y,-2,nametf.getText()));
         mypane5.getChildren().add(searchButton);
         VBox mypane3 = new VBox();
         mypane3.setPadding(new Insets(10));
         mypane3.setSpacing(8);
         mypane3.setAlignment(Pos.CENTER);
         Text title2 = new Text("STORES");
         title2.setFont(Font.font("Arial", FontWeight.BOLD, 14));
         mypane3.getChildren().add(title2);
         VBox mypane4 = new VBox();
         mypane4.setPadding(new Insets(10));
         mypane4.setSpacing(8);
         mypane4.setAlignment(Pos.CENTER);
         Text title3 = new Text("CATEGORIES");
         title3.setFont(Font.font("Arial", FontWeight.BOLD, 14));
         mypane4.getChildren().add(title3);
         ArrayList<String> cat = new ArrayList<>();
         for (int i = 0; i <stores.size() ; i++) {
             cat.addAll(stores.get(i).getcategories());
         }
         cat.add("all categories");
         Set<String> set = new LinkedHashSet<>(cat);
         cat.clear();
         cat.addAll(set);
         Button[] categoriesArrayButton = new Button[cat.size()];
         if(cat.size()==0){mypane4.getChildren().add(new Label("NO CATEGORIES"));}
         else{
             for (int j = 0; j < cat.size(); j++) {
                 categoriesArrayButton[j] = new Button(cat.get(j));
                 mypane4.getChildren().add(categoriesArrayButton[j]);
             }
         }
         for (int i = 0; i < cat.size()-1; i++) {
             int finalI = i;
             categoriesArrayButton[i].setOnAction(e ->anazhthshkatasthmatos(y,finalI,null));
         }
         categoriesArrayButton[cat.size()-1].setOnAction(e ->anazhthshkatasthmatos(y,-1,null));
         if(mode==-1)
             storestoshow=stores;
         else if(mod==-2)
         {
             for (int i = 0; i <stores.size() ; i++) {
                 if(stores.get(i).getname().equals(b))
                     storestoshow.add(stores.get(i));
             }
         }
         else{
             for (int i = 0; i <stores.size() ; i++) {
                 for (int j = 0; j <stores.get(i).getcategories().size() ; j++) {
                     if(cat.get(mod).equals(stores.get(i).getcategories().get(j))){
                         storestoshow.add(stores.get(i));
                         break;
                     }
                 }
             }
         }
         Button[] storesButtonArray = new Button[storestoshow.size()];
         if(storestoshow.size()==0){mypane3.getChildren().add(new Label("NO STORES AVAILABLE"));}
         else{
             for (int j = 0; j < storestoshow.size(); j++) {
                 storesButtonArray[j] = new Button(storestoshow.get(j).getname());
                 mypane3.getChildren().add(storesButtonArray[j]);
             }
         }
         for (int i = 0; i < storestoshow.size(); i++) {
             int finalI = i;
             storesButtonArray[i].setOnAction(e -> sellproducts(finalI,y,-1,0));
         }
         mypane2.setRight(mypane5);
         mypane2.setLeft(mypane4);
         mypane2.setCenter(mypane3);
         mypane2.setTop(mypane);
         window.setScene(new Scene(mypane2, 800, 700));
         window.show();
     }

    public void sellproducts(int x,int y,int w,int mode){//x to store y o customer w o tupos tou product mode deixnei to sorting pou zhtame
         VBox mypane = new VBox();
         mypane.setPadding(new Insets(10));
         mypane.setSpacing(8);
         mypane.setAlignment(Pos.CENTER);
         ScrollPane scrollPane = new ScrollPane(mypane);
         scrollPane.setFitToHeight(true);
         BorderPane border = new BorderPane(scrollPane);
         Text title = new Text("CATEGORIES");
         title.setFont(Font.font("Arial", FontWeight.BOLD, 14));
         mypane.getChildren().add(title);
         Button buttonKalathi = new Button("my cart\n"+customers.get(y).getkalathi().getkostos()+"€");
         buttonKalathi.setOnAction(e -> editcart(x,y));
         if(stores.get(x).getcategories().size()==0){mypane.getChildren().add(new Label("NO CATEGORIES ADDED"));}
         else
         {
             Button[] categoriesButtonArray = new Button[stores.get(x).getcategories().size()];
             for (int i = 0; i < stores.get(x).getcategories().size(); i++)
             {
                 categoriesButtonArray[i] = new Button(stores.get(x).getcategories().get(i));
                 mypane.getChildren().add(categoriesButtonArray[i]);
             }
             Button button = new Button("all categories");
             mypane.getChildren().add(button);
             button.setOnAction(e -> sellproducts( x,y,-1,0));
             for (int i = 0; i < stores.get(x).getcategories().size(); i++) {
                 int finalI = i;
                 categoriesButtonArray[i].setOnAction(e -> sellproducts( x,y, finalI,0));
             }
         }
         if(w!=-1) {
             Text titlef = new Text("Sort by");
             title.setFont(Font.font("Arial", FontWeight.BOLD, 14));
             mypane.getChildren().add(titlef);
             Button[] sortButtonArray= new Button[stores.get(x).getfilt().get(w).getfilter().size()];
             for (int j = 0; j < stores.get(x).getfilt().get(w).getfilter().size(); j++) {
                 sortButtonArray[j] = new Button(stores.get(x).getfilt().get(w).getfilter().get(j));
                 mypane.getChildren().add(sortButtonArray[j]);
             }
             for (int i = 0; i < stores.get(x).getfilt().get(w).getfilter().size(); i++) {
                 int finalI = i;
                 sortButtonArray[i].setOnAction(e -> sellproducts(x, y, w, finalI + 1));
             }
         }
         ArrayList<Product> productstoshow = new ArrayList<>();
         VBox mypane2 = new VBox();
         mypane2.setPadding(new Insets(10));
         mypane2.setSpacing(8);
         mypane2.setAlignment(Pos.CENTER);
         if(w==-1) {
             Button[] offerarray = new Button[stores.get(x).getoffers().size()];
             Text title3 = new Text("OFFERS");
             title3.setFont(Font.font("Arial", FontWeight.BOLD, 14));
             mypane2.getChildren().add(title3);
             if(stores.get(x).getoffers().size()==0){mypane2.getChildren().add(new Label("NO OFFERS ADDED"));}
             else{
                 for (int i = 0; i < stores.get(x).getoffers().size(); i++) {
                     offerarray[i] = new Button(stores.get(x).getoffers().get(i).getoffername()+"   "+stores.get(x).getoffers().get(i).getofferprice()+"€");
                     mypane2.getChildren().add(offerarray[i]);
                 }
             }
             for (int i = 0; i < stores.get(x).getoffers().size(); i++) {
                 int finalI = i;
                 offerarray[i].setOnAction(e -> {
                     Alert alert = new Alert(Alert.AlertType.INFORMATION);
                     alert.setTitle("BOS");
                     alert.setHeaderText("Information about offer "+stores.get(x).getoffers().get(finalI).getoffername());
                     String t="products in the offer: \n";
                     for (int k = 0; k < stores.get(x).getoffers().get(finalI).getproductsinoffer().size(); k++) {
                         t=t.concat(stores.get(x).getoffers().get(finalI).getproductsinoffer().get(k).getname()+" times "+stores.get(x).getoffers().get(finalI).getquantity().get(k)+" with price: "+stores.get(x).getoffers().get(finalI).getproductsinoffer().get(k).gettimh()+"€\n");
                     }
                     alert.setContentText("price : "+stores.get(x).getoffers().get(finalI).getofferprice()+"\n"+t);
                     alert.showAndWait();
                     TextInputDialog dialog = new TextInputDialog("1");
                     dialog.setTitle("BOS");
                     dialog.setHeaderText("You are buying "+stores.get(x).getoffers().get(finalI).getoffername());
                     dialog.setContentText("how many do you want:");
                     Optional<String> result = dialog.showAndWait();
                     if (result.isPresent()){
                         addoffertocart(x,y,result.get(), finalI);////x to store y o customer ,quantity,offer
                         buttonKalathi.setText("my cart\n"+customers.get(y).getkalathi().getkostos()+"€");
                     }
                 });
             }

         }
         Text title2 = new Text("PRODUCTS");
         title2.setFont(Font.font("Arial", FontWeight.BOLD, 14));
         mypane2.getChildren().add(title2);

         Button[] productButtonArray = new Button[stores.get(x).getproducts().size()];
         if(stores.get(x).getproducts().size()==0){mypane2.getChildren().add(new Label("NO PRODUCTS ADDED"));}
         else{
             for (int i = 0; i < stores.get(x).getproducts().size(); i++) {
                 if(stores.get(x).getprosekat().get(i)==w)
                 {
                     if(mode==0){
                         productButtonArray[i] = new Button(stores.get(x).getproducts().get(i).getname()+"   "+stores.get(x).getproducts().get(i).gettimh()+"€");
                         mypane2.getChildren().add(productButtonArray[i]);
                     }
                     productstoshow.add(stores.get(x).getproducts().get(i));
                 }
                 else if(w==-1)
                 {
                     if(mode==0){
                         productButtonArray[i] = new Button(stores.get(x).getproducts().get(i).getname()+"   "+stores.get(x).getproducts().get(i).gettimh()+"€");
                         mypane2.getChildren().add(productButtonArray[i]);
                     }
                     productstoshow.add(stores.get(x).getproducts().get(i));
                 }
             }
             if(mode==1){
                 Collections.sort(productstoshow, new Main.Sortbytimhauksousa());
                 for (int i = 0; i <productstoshow.size() ; i++) {
                     productButtonArray[i] = new Button(productstoshow.get(i).getname()+"   "+productstoshow.get(i).gettimh()+"€");
                     mypane2.getChildren().add(productButtonArray[i]);
                 }
             }
             else if(mode==2){
                 Collections.sort(productstoshow, new Main.Sortbytimhfthinousa());
                 for (int i = 0; i <productstoshow.size() ; i++) {
                     productButtonArray[i] = new Button(productstoshow.get(i).getname()+"   "+productstoshow.get(i).gettimh()+"€");
                     mypane2.getChildren().add(productButtonArray[i]);
                 }
             }
             else if(mode==3){
                 Collections.sort(productstoshow, new Main.Sortbynameauksousa());
                 for (int i = 0; i <productstoshow.size() ; i++) {
                     productButtonArray[i] = new Button(productstoshow.get(i).getname()+"   "+productstoshow.get(i).gettimh()+"€");
                     mypane2.getChildren().add(productButtonArray[i]);
                 }
             }
             else if(mode==4){
                 Collections.sort(productstoshow, new Main.Sortbynameftinousa());
                 for (int i = 0; i <productstoshow.size() ; i++) {
                     productButtonArray[i] = new Button(productstoshow.get(i).getname()+"   "+productstoshow.get(i).gettimh()+"€");
                     mypane2.getChildren().add(productButtonArray[i]);
                 }
             }

         }
         if(mode==0 ||mode==-1){
             for (int i = 0; i < stores.get(x).getproducts().size(); i++)
             { int finalI = i;
                 if(w==-1){
                     productButtonArray[i].setOnAction(e -> {
                         TextInputDialog dialog = new TextInputDialog("1");
                         dialog.setTitle("BOS");
                         dialog.setHeaderText("You are buying "+stores.get(x).getproducts().get(finalI).getname());
                         dialog.setContentText("how many do you want:");
                         Optional<String> result = dialog.showAndWait();
                         if (result.isPresent()){
                             addtocart(x,y,result.get(), finalI);////x to store y o customer ,quantity,proion
                             buttonKalathi.setText("my cart\n"+customers.get(y).getkalathi().getkostos()+"€");
                         }
                     });
                 }
                 else if(stores.get(x).getprosekat().get(i)==w)
                 {
                     productButtonArray[i].setOnAction(e -> {
                         TextInputDialog dialog = new TextInputDialog("1");
                         dialog.setTitle("BOS");
                         dialog.setHeaderText("You are buying "+stores.get(x).getproducts().get(finalI).getname());
                         dialog.setContentText("how many do you want:");
                         Optional<String> result = dialog.showAndWait();
                         if (result.isPresent()){
                             addtocart(x,y,result.get(), finalI);////x to store y o customer ,quantity,proion
                             buttonKalathi.setText("my cart\n"+customers.get(y).getkalathi().getkostos()+"€");
                         }
                     });
                 }
             }
         }
         else {
             for (int i = 0; i < productstoshow.size(); i++)
             { int finalI = i;
                 AtomicInteger pro = new AtomicInteger();
                 productButtonArray[i].setOnAction(e -> {
                     TextInputDialog dialog = new TextInputDialog("1");
                     dialog.setTitle("BOS");
                     dialog.setHeaderText("You are buying "+productstoshow.get(finalI).getname());
                     dialog.setContentText("how many do you want:");
                     Optional<String> result = dialog.showAndWait();
                     for (int j = 0; j < stores.get(x).getproducts().size() ; j++) {
                         if(productstoshow.get(finalI).getname().equals(stores.get(x).getproducts().get(j).getname())){
                             pro.set(j);
                             break;
                         }
                     }
                     if (result.isPresent()){
                         addtocart(x,y,result.get(),pro.get());////x to store y o customer ,quantity,proion
                         buttonKalathi.setText("my cart\n"+customers.get(y).getkalathi().getkostos()+"€");
                     }
                 });

             }

         }
         VBox mypane4 = new VBox();
         mypane4.setPadding(new Insets(10));
         mypane4.setSpacing(8);
         mypane4.setAlignment(Pos.BOTTOM_RIGHT);
         Button returnButton = new Button("BACK");
         mypane4.getChildren().add(returnButton);
         returnButton.setOnAction(e -> {
             if(customers.get(y).getkalathi().getkostos()!=0){
                 Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                 alert.setTitle("BOS");
                 alert.setHeaderText("if you leave the store your cart will be empty!");
                 alert.setContentText("Are you ok with this?");
                 Optional<ButtonType> result = alert.showAndWait();
                 if (result.get() == ButtonType.OK){
                     ArrayList<Product> productsincart2= customers.get(y).getkalathi().getproductsincart();
                     productsincart2.clear();
                     customers.get(y).getkalathi().setproductsincart(productsincart2);
                     ArrayList<Integer> clearlists = new ArrayList<>();
                     ArrayList<Offer> clearoffers = new ArrayList<>();
                     customers.get(y).getkalathi().setquantity(clearlists);
                     customers.get(y).getkalathi().setprices(clearlists);
                     customers.get(y).getkalathi().setoffersincart(clearoffers);
                     customers.get(y).getkalathi().setofferquantity(clearlists);
                     customers.get(y).getkalathi().setofferprices(clearlists);
                     customers.get(y).getkalathi().setkostos(0);
                     anazhthshkatasthmatos(y,-1,null);
                 }
             }
             else
             {
                 anazhthshkatasthmatos(y,-1,null);
             }
         });
         GridPane mypane5 = new GridPane();
         mypane5.setPadding(new Insets(15));
         mypane5.setHgap(5);
         mypane5.setVgap(5);
         mypane5.setAlignment(Pos.TOP_RIGHT);
         MenuItem userEditButton = new MenuItem("edit account");
         MenuItem logoutButton = new MenuItem("log out");
         MenuItem orderHistoryButton = new MenuItem("order history");
         MenuButton menuButton = new MenuButton(customers.get(y).getname(), null, userEditButton, logoutButton ,orderHistoryButton);
         mypane5.add(menuButton, 1, 1);
         mypane5.add(buttonKalathi, 1, 4);
         userEditButton.setOnAction(e -> editcustomer(y));
         logoutButton.setOnAction(e -> startapp());
         border.setLeft(mypane);
         border.setCenter(mypane2);
         border.setBottom(mypane4);
         Text title3 = new Text("BOS");
         title3.setFill(Color.GREEN);
         title3.setFont(Font.font ("Verdana", 20));
         Text title4 = new Text(stores.get(x).getname());
         title4.setFont(Font.font ("Verdana", 20));
         HBox mypane3 = new HBox();
         mypane3.setPadding(new Insets(10));
         mypane3.setSpacing(38);
         mypane3.setAlignment(Pos.CENTER);
         mypane3.getChildren().add(title3);
         mypane3.getChildren().add(title4);
         border.setRight(mypane5);
         border.setTop(mypane3);
         window.setScene(new Scene(border, 800, 700));
         window.show();
     }

     public void completeorder(int x,int y,int s){//x=store y=customer s=status
         Order temp= new Order();
         temp.settropos_plhrwmhs(s);//0=den exei dialleksei 1=metrhta 2=card
         BorderPane border = new BorderPane();
         GridPane mypane = new GridPane();
         mypane.setPadding(new Insets(10));
         mypane.setHgap(5);
         mypane.setVgap(3);
         mypane.setAlignment(Pos.CENTER);
         int i;
         for ( i = 0; i < customers.get(y).getkalathi().getproductsincart().size(); i++) {
             Text text1 = new Text(customers.get(y).getkalathi().getquantity().get(i)+"x   "+customers.get(y).getkalathi().getproductsincart().get(i).getname()+"    "+customers.get(y).getkalathi().getprices().get(i)*customers.get(y).getkalathi().getquantity().get(i)+"€");
             mypane.add(text1,1, i);
         }
         Button editorder = new Button("EDIT ORDER");
         mypane.add(editorder,1,i);
         editorder.setOnAction(e -> editcart(x,y));
         VBox mypane2 = new VBox();
         mypane2.setPadding(new Insets(10));
         mypane2.setSpacing(8);
         mypane2.setAlignment(Pos.CENTER);
         Button buttonplhrwmhs = new Button("CHOOSE PAYMENT METHOD");
         mypane2.getChildren().add(buttonplhrwmhs);
         buttonplhrwmhs.setOnAction(e -> plhrwmh(x,y,temp));
         TextField sxoliotf = new TextField();
         sxoliotf.setPromptText("add comments for the store...");
         temp.setsxolia(sxoliotf.getText());
         Text title3 = new Text("BOS");
         title3.setFill(Color.GREEN);
         title3.setFont(Font.font ("Verdana", 20));
         Text title4 = new Text("TOTAL COST:"+customers.get(y).getkalathi().getkostos());
         VBox mypane3 = new VBox();
         mypane3.setPadding(new Insets(20));
         mypane3.setSpacing(18);
         mypane3.setAlignment(Pos.CENTER);
         mypane3.getChildren().add(title4);
         Button buttonapostolh = new Button("SEND ORDER");
         mypane3.getChildren().add(buttonapostolh);
         buttonapostolh.setOnAction(e -> {
             if(temp.gettropos_plhrwmhs()==2){
                 Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                 alert.setTitle("BOS");
                 alert.setHeaderText(null);
                 alert.setContentText("το σύστημα επικοινωνεί με την τράπεζα και αυτη:");
                 ButtonType buttona = new ButtonType("πραγματοποιεί την συναλλαγή");
                 ButtonType buttonb= new ButtonType("δεν πραγματοποιεί την συναλλαγή");
                 alert.getButtonTypes().setAll(buttona, buttonb);
                 Optional<ButtonType> result = alert.showAndWait();
                 if (result.get() == buttona){
                     Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
                     alert2.setTitle("BOS");
                     alert2.setHeaderText(null);
                     alert2.setContentText("YOUR ORDER HAS BEEN SAVED!");
                     alert2.showAndWait();
                     temp.setstatus(0);
                     temp.setkatasthma(x);
                     temp.setpelaths(y);
                     ArrayList<Product> productsincart2= customers.get(y).getkalathi().getproductsincart();
                     productsincart2.clear();
                     customers.get(y).getkalathi().setproductsincart(productsincart2);
                     ArrayList<Integer> clearlists = new ArrayList<>();
                     ArrayList<Offer> clearoffers = new ArrayList<>();
                     customers.get(y).getkalathi().setquantity(clearlists);
                     customers.get(y).getkalathi().setprices(clearlists);
                     customers.get(y).getkalathi().setoffersincart(clearoffers);
                     customers.get(y).getkalathi().setofferquantity(clearlists);
                     customers.get(y).getkalathi().setofferprices(clearlists);
                     customers.get(y).getkalathi().setkostos(0);
                     temp.settropos_plhrwmhs(0);
                     anazhthshkatasthmatos(y,-1,null); }
                 else {
                     Alert alert3 = new Alert(Alert.AlertType.ERROR);
                     alert3.setTitle("BOS");
                     alert3.setHeaderText(null);
                     alert3.setContentText("THE TRANSACTION FAILED");
                     alert3.showAndWait();
                     completeorder(x,y,2);
                 }
             }
             else if(temp.gettropos_plhrwmhs()==1){
                 Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
                 alert2.setTitle("BOS");
                 alert2.setHeaderText(null);
                 alert2.setContentText("YOUR ORDER HAS BEEN SAVED!");
                 alert2.showAndWait();
                 temp.setstatus(0);
                 temp.setkatasthma(x);
                 temp.setpelaths(y);
                 ArrayList<Product> productsincart2= customers.get(y).getkalathi().getproductsincart();
                 productsincart2.clear();
                 customers.get(y).getkalathi().setproductsincart(productsincart2);
                 ArrayList<Integer> clearlists = new ArrayList<>();
                 ArrayList<Offer> clearoffers = new ArrayList<>();
                 customers.get(y).getkalathi().setquantity(clearlists);
                 customers.get(y).getkalathi().setprices(clearlists);
                 customers.get(y).getkalathi().setoffersincart(clearoffers);
                 customers.get(y).getkalathi().setofferquantity(clearlists);
                 customers.get(y).getkalathi().setofferprices(clearlists);
                 customers.get(y).getkalathi().setkostos(0);
                 temp.settropos_plhrwmhs(0);
                 anazhthshkatasthmatos(y,-1,null);
             }
             else{
                 Alert alert = new Alert(Alert.AlertType.WARNING);
                 alert.setTitle("BOS");
                 alert.setHeaderText(null);
                 alert.setContentText("YOU NEED TO CHOOSE PAYMENT METHOD!");
                 alert.showAndWait();
             }
         });
         Button buttonback= new Button("BACK");
         mypane3.getChildren().add(buttonback);
         buttonback.setOnAction(e ->editcart(x,y));
         border.setRight(mypane3);
         border.setCenter(mypane);
         border.setLeft(mypane2);
         border.setBottom(sxoliotf);
         border.setTop(title3);
         window.setScene(new Scene(border, 800, 700));
         window.show();
     }

    public void editcart(int x,int y){
         GridPane mypane = new GridPane();
         mypane.setPadding(new Insets(10));
         mypane.setHgap(5);
         mypane.setVgap(3);
         mypane.setAlignment(Pos.CENTER);
         int i = 0;
         int j = 0;
         ArrayList<Button> offerButtonArray = new ArrayList<>();
         ArrayList <Text> array2 = new ArrayList<>();
         ArrayList<Button> onemoreButton = new ArrayList<>();
         ArrayList<Button> onelessButton = new ArrayList<>();
         ArrayList <Text> array5 = new ArrayList<>();
         ArrayList<Button> array6 = new ArrayList<>();
         ArrayList<Button> productButtonArray = new ArrayList<>();
         ArrayList <Text> aarray2 = new ArrayList<>();
         ArrayList<Button> onemoreofferButton = new ArrayList<>();
         ArrayList<Button> onelessofferButton = new ArrayList<>();
         ArrayList <Text> aarray5 = new ArrayList<>();
         ArrayList<Button> aarray6 = new ArrayList<>();
         Text text4 = new Text("TOTAL COST="+customers.get(y).getkalathi().getkostos());
         Text text1 = new Text("ITEM");
         Text text2 = new Text("№");
         Text text3 = new Text("PRICE");
         mypane.add(text1,1, 1);
         mypane.add(text2,2, 1);
         mypane.add(text3,5, 1);
         mypane.add(text4,3,0);
         Cart kalathi2 = customers.get(y).getkalathi();
         if(customers.get(y).getkalathi().getoffersincart().size()!=0) {
             for (i = 0; i < kalathi2.getoffersincart().size(); i++) {
                 offerButtonArray.add(new Button(kalathi2.getoffersincart().get(i).getoffername()));
                 mypane.add(offerButtonArray.get(i), 1, i+2);
                 array2.add(new Text(String.valueOf(kalathi2.getofferquantity().get(i))));
                 mypane.add(array2.get(i), 2, i+2);
                 onemoreButton.add(new Button("+"));
                 mypane.add(onemoreButton.get(i), 3, i+2);
                 onelessButton.add(new Button("-"));
                 mypane.add(onelessButton.get(i), 4, i+2);
                 array5.add(new Text(String.valueOf(kalathi2.getofferprices().get(i))));
                 mypane.add(array5.get(i), 5, i+2);
                 array6.add(new Button("DELETE"));
                 mypane.add(array6.get(i), 6, i+2);
             }
             for ( i = 0; i < kalathi2.getoffersincart().size(); i++) {
                 int finalI = i;
                 offerButtonArray.get(i).setOnAction(e -> {
                     Alert alert = new Alert(Alert.AlertType.INFORMATION);
                     alert.setTitle("BOS");
                     alert.setHeaderText("Information about offer "+kalathi2.getoffersincart().get(finalI).getoffername());
                     String t="products in the offer: \n";
                     for (int k = 0; k < kalathi2.getoffersincart().get(finalI).getproductsinoffer().size(); k++) {
                         t=t.concat(kalathi2.getoffersincart().get(finalI).getproductsinoffer().get(k).getname()+" times "+customers.get(y).getkalathi().getoffersincart().get(finalI).getquantity().get(k)+" with price: "+customers.get(y).getkalathi().getoffersincart().get(finalI).getproductsinoffer().get(k).gettimh()+"€\n");
                     }
                     alert.setContentText("price : "+kalathi2.getoffersincart().get(finalI).getofferprice()+"\n"+t);
                     alert.showAndWait();
                 });
             }
             for ( i = 0; i < customers.get(y).getkalathi().getoffersincart().size(); i++) {
                 int final1 = i;
                 onemoreButton.get(i).setOnAction(e -> {
                     int temp = kalathi2.getofferquantity().get(final1);
                     kalathi2.getofferquantity().set(final1, temp + 1);
                     array2.remove(final1);
                     array2.add(final1,new Text(String.valueOf(kalathi2.getofferquantity().get(final1))));
                     array5.remove(final1);
                     array5.add(final1,new Text(String.valueOf(kalathi2.getofferprices().get(final1)*customers.get(y).getkalathi().getofferquantity().get(final1))));
                     kalathi2.setkostos(kalathi2.getkostos()+ Integer.parseInt(kalathi2.getoffersincart().get(final1).getofferprice()));
                     text4.setText("TOTAL COST=" + kalathi2.getkostos() + "€");
                     customers.get(y).setkalathi(kalathi2);
                     editcart(x,y);
                 });
             }
             for ( i = 0; i < kalathi2.getoffersincart().size(); i++) {
                 int final2 = i;
                 onelessButton.get(i).setOnAction(e -> {
                     int temp=kalathi2.getofferquantity().get(final2);
                     kalathi2.getofferquantity().set(final2,temp-1);
                     array2.remove(final2);
                     array2.add(final2,new Text(String.valueOf(kalathi2.getofferquantity().get(final2))));
                     array5.remove(final2);
                     array5.add(final2,new Text(String.valueOf(kalathi2.getofferprices().get(final2)*kalathi2.getofferquantity().get(final2))));
                     customers.get(y).getkalathi().setkostos(kalathi2.getkostos()-Integer.parseInt(kalathi2.getoffersincart().get(final2).getofferprice()));
                     text4.setText("TOTAL COST=" + kalathi2.getkostos() + "€");
                     if(kalathi2.getofferquantity().get(final2)==0){
                         kalathi2.setkostos(kalathi2.getkostos()-(Integer.parseInt(kalathi2.getoffersincart().get(final2).getofferprice())*kalathi2.getofferquantity().get(final2)));
                         kalathi2.getoffersincart().remove(final2);
                         kalathi2.getofferquantity().remove(final2);
                         kalathi2.getofferprices().remove(final2);}
                         customers.get(y).setkalathi(kalathi2);
                         editcart(x,y);
                 });
             }
             for ( i = 0; i < kalathi2.getoffersincart().size(); i++) {
                 int final3 = i;
                 array6.get(i).setOnAction(e -> {
                     kalathi2.setkostos(kalathi2.getkostos()-(Integer.parseInt(kalathi2.getoffersincart().get(final3).getofferprice())*kalathi2.getofferquantity().get(final3)));
                     kalathi2.getoffersincart().remove(final3);
                     kalathi2.getofferquantity().remove(final3);
                     kalathi2.getofferprices().remove(final3);
                     customers.get(y).setkalathi(kalathi2);
                     editcart(x,y);
                 });
             }
         }
         if(kalathi2.getproductsincart().size()!=0) {
             for (j = 0; j < kalathi2.getproductsincart().size(); j++) {
                 productButtonArray.add(new Button(kalathi2.getproductsincart().get(j).getname()));
                 mypane.add(productButtonArray.get(j), 1, i+j+2);
                 aarray2.add(new Text(String.valueOf(kalathi2.getquantity().get(j))));
                 mypane.add(aarray2.get(j), 2, i+j+2);
                 onemoreofferButton.add(new Button("+"));
                 mypane.add(onemoreofferButton.get(j), 3, i+j+2);
                 onelessofferButton.add(new Button("-"));
                 mypane.add(onelessofferButton.get(j), 4, i+j+2);
                 aarray5.add(new Text(String.valueOf(kalathi2.getprices().get(j))));
                 mypane.add(aarray5.get(j), 5, i+j+2);
                 aarray6.add(new Button("DELETE"));
                 mypane.add(aarray6.get(j), 6, i+j+2);
             }
             for ( j = 0; j < kalathi2.getproductsincart().size(); j++) {
                 int finalI = j;
                 productButtonArray.get(j).setOnAction(e -> {
                     Alert alert = new Alert(Alert.AlertType.INFORMATION);
                     alert.setTitle("BOS");
                     alert.setHeaderText("Information about product "+kalathi2.getproductsincart().get(finalI).getname());
                     alert.setContentText("price : "+kalathi2.getproductsincart().get(finalI).gettimh());
                     alert.showAndWait();
                 });
             }
             for ( j = 0; j < kalathi2.getproductsincart().size(); j++) {
                 int final1 = j;
                 onemoreofferButton.get(j).setOnAction(e -> {
                     int temp = kalathi2.getquantity().get(final1);
                     kalathi2.getquantity().set(final1, temp + 1);
                     aarray2.remove(final1);
                     aarray2.add(final1,new Text(String.valueOf(kalathi2.getquantity().get(final1))));
                     aarray5.remove(final1);
                     aarray5.add(final1,new Text(String.valueOf(kalathi2.getprices().get(final1)*kalathi2.getquantity().get(final1))));
                     kalathi2.setkostos(kalathi2.getkostos() + Integer.parseInt(kalathi2.getproductsincart().get(final1).gettimh()));
                     text4.setText("TOTAL COST=" + kalathi2.getkostos() + "€");
                     customers.get(y).setkalathi(kalathi2);
                     editcart(x,y);
                 });
             }
             for ( j = 0; j < kalathi2.getproductsincart().size(); j++) {
                 int final2 = j;
                 onelessofferButton.get(j).setOnAction(e -> {
                     int temp=kalathi2.getquantity().get(final2);
                     kalathi2.getquantity().set(final2,temp-1);
                     aarray2.remove(final2);
                     aarray2.add(final2,new Text(String.valueOf(kalathi2.getquantity().get(final2))));
                     aarray5.remove(final2);
                     aarray5.add(final2,new Text(String.valueOf(kalathi2.getprices().get(final2)*kalathi2.getquantity().get(final2))));
                     customers.get(y).getkalathi().setkostos(kalathi2.getkostos()-Integer.parseInt(kalathi2.getproductsincart().get(final2).gettimh()));
                     text4.setText("TOTAL COST=" + kalathi2.getkostos() + "€");
                     if(kalathi2.getquantity().get(final2)==0){
                         kalathi2.setkostos(customers.get(y).getkalathi().getkostos()-(Integer.parseInt(customers.get(y).getkalathi().getproductsincart().get(final2).gettimh())*customers.get(y).getkalathi().getquantity().get(final2)));
                         kalathi2.getproductsincart().remove(final2);
                         kalathi2.getquantity().remove(final2);
                         kalathi2.getprices().remove(final2);}
                         customers.get(y).setkalathi(kalathi2);
                         editcart(x,y);
                 });
             }
             for ( j = 0; j < kalathi2.getproductsincart().size(); j++) {
                 int final3 = j;
                 aarray6.get(j).setOnAction(e -> {
                     kalathi2.setkostos(kalathi2.getkostos()-(Integer.parseInt(kalathi2.getproductsincart().get(final3).gettimh())*kalathi2.getquantity().get(final3)));
                     kalathi2.getproductsincart().remove(final3);
                     kalathi2.getquantity().remove(final3);
                     kalathi2.getprices().remove(final3);
                     customers.get(y).setkalathi(kalathi2);
                     editcart(x,y);
                 });
             }
         }
         else
         {
             mypane.getChildren().add(new Label("NO PRODUCTS ADDED"));
         }
         Button oloklhrwshButton = new Button("READY");
         mypane.add(oloklhrwshButton, 6, j+i+2);
         GridPane.setHalignment(oloklhrwshButton, HPos.LEFT);
         oloklhrwshButton.setOnAction(e -> {
             if(kalathi2.getkostos()>0) {
                 customers.get(y).setkalathi(kalathi2);
                 completeorder(x, y, 0);//x store y customer
             }
             else{
                 Alert alert = new Alert(Alert.AlertType.WARNING);
                 alert.setTitle("BOS");
                 alert.setHeaderText(null);
                 alert.setContentText("You need to add products!");
                 alert.showAndWait();
                 customers.get(y).setkalathi(kalathi2);
                 completeorder(x, y, 0);//x store y customer
             }

         });
         Button returnButton = new Button("BACK");
         mypane.add(returnButton, 0, j+i+2);
         GridPane.setHalignment(returnButton, HPos.LEFT);
         returnButton.setOnAction(e -> {
             for (int h = 0; h < customers.get(y).getkalathi().getproductsincart().size(); h++) {
                 if(kalathi2.getquantity().get(h)==0){kalathi2.getproductsincart().remove(h);customers.get(y).getkalathi().getquantity().remove(h);}
             }
             customers.get(y).setkalathi(kalathi2);
             sellproducts(x,y,-1,0);
         });
         window.setScene(new Scene(mypane, 800, 700));
         window.show();
     }

     public void plhrwmh(int x,int y,Order temp){
         BorderPane border = new BorderPane();
         VBox mypane = new VBox();
         mypane.setPadding(new Insets(10));
         mypane.setSpacing(8);
         mypane.setAlignment(Pos.CENTER);
         ScrollPane scrollPane = new ScrollPane(mypane);
         scrollPane.setFitToHeight(true);
         Text title = new Text("CARDS");
         title.setFont(Font.font("Arial", FontWeight.BOLD, 14));
         mypane.getChildren().add(title);
         Button[] cardButtonArray = new Button[customers.get(y).getcards().size()];
         if(customers.get(y).getcards().size()==0){mypane.getChildren().add(new Label("NO CARDS ADDED"));}
         else{
             for (int i = 0; i < customers.get(y).getcards().size(); i++) {
                 cardButtonArray[i] = new Button(customers.get(y).getcards().get(i).getnumber());
                 mypane.getChildren().add(cardButtonArray[i]);
             }
         }
         for (int i = 0; i < customers.get(y).getcards().size(); i++) {
             int finalI = i;
             cardButtonArray[i].setOnAction(e -> {
                 temp.settropos_plhrwmhs(2,customers.get(y).getcards().get(finalI));
                 completeorder(x,y,2);
             });
         }
         Button addButton = new Button("ADD CARD");
         mypane.getChildren().add(addButton);
         GridPane.setHalignment(addButton, HPos.LEFT);
         addButton.setOnAction(e -> prosthikhkartassthnlista(x,y,temp));
         VBox mypane2 = new VBox();
         mypane2.setPadding(new Insets(10));
         mypane2.setSpacing(8);
         mypane2.setAlignment(Pos.BOTTOM_RIGHT);
         Button backButton = new Button("BACK");
         mypane2.getChildren().add(backButton);
         backButton.setOnAction(e -> completeorder(x,y,0));
         Button cashButton = new Button("CASH");
         mypane.getChildren().add(cashButton);
         GridPane.setHalignment(cashButton, HPos.LEFT);
         cashButton.setOnAction(e -> { temp.settropos_plhrwmhs(1);completeorder(x,y,1);});
         border.setCenter(mypane);
         border.setBottom(mypane2);
         window.setScene(new Scene(border, 800, 700));
         window.show();
     }

     public void prosthikhkartassthnlista(int x,int y,Order temp){// y = customer , x = sotre
         GridPane mypane = new GridPane();
         mypane.setPadding(new Insets(10));
         mypane.setHgap(5);
         mypane.setVgap(3);
         mypane.setAlignment(Pos.CENTER);
         TextField nametf = new TextField();
         TextField cardtf = new TextField();
         TextField datetf = new TextField();
         TextField cvvtf = new TextField();
         mypane.add(nametf, 1, 1);
         mypane.add(cardtf, 1, 2);
         mypane.add(datetf, 1, 3);
         mypane.add(cvvtf, 1, 4);
         mypane.add(new Label("NAME:"), 0, 1);
         mypane.add(new Label("CARD:"), 0, 2);
         mypane.add(new Label("DATE:"), 0, 3);
         mypane.add(new Label("CVV:"), 0, 4);
         Button confirmButton = new Button("READY");
         mypane.add(confirmButton, 1, 5);
         GridPane.setHalignment(confirmButton, HPos.LEFT);
         confirmButton.setOnAction(e -> {
             Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
             alert.setTitle("BOS");
             alert.setHeaderText(null);
             alert.setContentText("το σύστημα επικοινωνεί με την τράπεζα και αυτη:");
             ButtonType buttona = new ButtonType("επικυρώνει την κάρτα");
             ButtonType buttonb= new ButtonType("απορρίπτει κάρτα");
             alert.getButtonTypes().setAll(buttona, buttonb);
             Optional<ButtonType> result = alert.showAndWait();
             if (result.get() == buttona){
                 temp.setkarta(new Card(nametf.getText(),cardtf.getText(),datetf.getText(),cvvtf.getText()));
                 ArrayList<Card> cards2 =customers.get(y).getcards();
                 cards2.add(temp.getkarta());
                 customers.get(y).setcards(cards2);
                 completeorder(x,y,2);
             } else {
                 Alert alert2 = new Alert(Alert.AlertType.ERROR);
                 alert2.setTitle("BOS");
                 alert2.setHeaderText(null);
                 alert2.setContentText("CARD NOT ACCEPTED");
                 alert2.showAndWait();
                 completeorder(x, y, 0);
             }
         });
         Button bButton = new Button("BACK");
         mypane.add(bButton, 0, 5);
         GridPane.setHalignment(bButton, HPos.LEFT);
         bButton.setOnAction(e -> completeorder(x,y,0));
         window.setScene(new Scene(mypane, 800, 700));
         window.show();
     }

   public void arxikhselidastore(int x){
         GridPane mypane = new GridPane();
         mypane.setPadding(new Insets(15));
         mypane.setHgap(5);
         mypane.setVgap(5);
         mypane.setAlignment(Pos.CENTER);
         Button button = new Button("orders");
         mypane.add(button, 1, 1);
         button.setOnAction(e -> {
             startapp();
         });
         Button button1 = new Button("edit stock");
         mypane.add(button1, 1, 2);
         button1.setOnAction(e -> editstock(x));
         Button button2 = new Button("edit account");
         mypane.add(button2, 1, 3);
         button2.setOnAction(e -> editstore(x));
         Button button3 = new Button("log out");
         mypane.add(button3, 1, 4);
         button3.setOnAction(e -> startapp());
         window.setScene(new Scene(mypane, 800, 700));
         window.show();
     }

    public static void main(String[] args)
       {
         launch(args);
       }

     class Sortbytimhauksousa implements Comparator<Product> {
         public int compare(Product a, Product b)
         {
             return Integer.parseInt( a.gettimh())-Integer.parseInt(b.gettimh());
         }
     }
     class Sortbytimhfthinousa implements Comparator<Product> {
         public int compare(Product a, Product b)
         {
             return -(Integer.parseInt( a.gettimh())-Integer.parseInt(b.gettimh()));
         }
     }
     class Sortbynameauksousa implements Comparator<Product> {
         public int compare(Product a, Product b)
         {
             int x;
             x=a.getname().compareTo(b.getname());
             return x;
         }
    }
     class Sortbynameftinousa implements Comparator<Product> {
         public int compare(Product a, Product b)
         {
             int x;
             x=a.getname().compareTo(b.getname());
             return -x;
         }
     }

     public void addoffer(int x,Offer temp,int ctgr){//x to store
         VBox mypane = new VBox();
         mypane.setPadding(new Insets(10));
         mypane.setSpacing(8);
         mypane.setAlignment(Pos.CENTER);
         ScrollPane scrollPane = new ScrollPane(mypane);
         scrollPane.setFitToHeight(true);
         BorderPane border = new BorderPane(scrollPane);
         Text title = new Text("CATEGORIES");
         title.setFont(Font.font("Arial", FontWeight.BOLD, 14));
         mypane.getChildren().add(title);
         if(stores.get(x).getcategories().size()==0){mypane.getChildren().add(new Label("NO CATEGORIES ADDED"));}
         else
         {
             Button[] array2 = new Button[stores.get(x).getcategories().size()];
             for (int i = 0; i < stores.get(x).getcategories().size(); i++)
             {
                 array2[i] = new Button(stores.get(x).getcategories().get(i));
                 mypane.getChildren().add(array2[i]);
             }
             for (int i = 0; i < stores.get(x).getcategories().size(); i++) {
                 int finalI = i;
                 array2[i].setOnAction(e -> addoffer(x,temp, finalI));
             }
         }
         VBox mypane2 = new VBox();
         mypane2.setPadding(new Insets(10));
         mypane2.setSpacing(8);
         mypane2.setAlignment(Pos.CENTER);
         Text title2 = new Text("PRODUCTS");
         title2.setFont(Font.font("Arial", FontWeight.BOLD, 14));
         mypane2.getChildren().add(title2);
         if(ctgr==-1) {
             Button[] array = new Button[stores.get(x).getproducts().size()];
             if (stores.get(x).getproducts().size() == 0) {
                 mypane2.getChildren().add(new Label("NO PRODUCTS ADDED"));
             } else {
                 for (int i = 0; i < stores.get(x).getproducts().size(); i++) {
                     array[i] = new Button(stores.get(x).getproducts().get(i).getname() + "   " + stores.get(x).getproducts().get(i).gettimh() + "€");
                     mypane2.getChildren().add(array[i]);
                 }
             }
             for (int i = 0; i < stores.get(x).getproducts().size(); i++) {
                 int finalI = i;
                 array[i].setOnAction(e -> {
                     TextInputDialog dialog = new TextInputDialog("1");
                     dialog.setTitle("BOS");
                     dialog.setHeaderText("You are adding " + stores.get(x).getproducts().get(finalI).getname() + " to the offer");
                     dialog.setContentText("how many do you want to add:");
                     Optional<String> result = dialog.showAndWait();
                     if (result.isPresent()) {
                         ArrayList<Product> productsinoffer2;
                         ArrayList<Integer> quantity2;
                         ArrayList<Integer> prices2;
                         productsinoffer2 = temp.getproductsinoffer();
                         productsinoffer2.add(stores.get(x).getproducts().get(finalI));
                         temp.setproductsinoffer(productsinoffer2);
                         quantity2 = temp.getquantity();
                         quantity2.add(Integer.parseInt(result.get()));
                         temp.setquantity(quantity2);
                         prices2 = temp.getprices();
                         prices2.add(Integer.parseInt(stores.get(x).getproducts().get(finalI).gettimh()));
                         temp.setprices(prices2);
                         temp.setoldprice(temp.getoldprice() + (Integer.parseInt(result.get()) * Integer.parseInt(stores.get(x).getproducts().get(finalI).gettimh())));
                     }
                 });
             }
         }
         else
         {
             Button[] array = new Button[stores.get(x).getproducts().size()+1];
             if (stores.get(x).getproducts().size() == 0) {
                 mypane2.getChildren().add(new Label("NO PRODUCTS ADDED"));
             }
             else{
                 for (int i = 0; i < stores.get(x).getproducts().size(); i++) {
                     if(stores.get(x).getprosekat().get(i)==ctgr) {
                         array[i] = new Button(stores.get(x).getproducts().get(i).getname() + "   " + stores.get(x).getproducts().get(i).gettimh() + "€");
                         mypane2.getChildren().add(array[i]);
                     }
                 }
                 array[stores.get(x).getproducts().size()] = new Button("all categories");
                 mypane2.getChildren().add(array[stores.get(x).getproducts().size()]);
             }
             for (int i = 0; i < stores.get(x).getproducts().size(); i++)
             { int finalI = i;
                 if(stores.get(x).getprosekat().get(i)==ctgr)
                 {
                     array[i].setOnAction(e -> {
                         TextInputDialog dialog = new TextInputDialog("1");
                         dialog.setTitle("BOS");
                         dialog.setHeaderText("You are adding "+stores.get(x).getproducts().get(finalI).getname()+" to the offer");
                         dialog.setContentText("how many do you want to add:");
                         Optional<String> result = dialog.showAndWait();
                         if (result.isPresent()){
                             ArrayList<Product> productsinoffer2;
                             ArrayList<Integer> quantity2;
                             ArrayList<Integer> prices2;
                             productsinoffer2=temp.getproductsinoffer();
                             productsinoffer2.add(stores.get(x).getproducts().get(finalI));
                             temp.setproductsinoffer(productsinoffer2);
                             quantity2=temp.getquantity();
                             quantity2.add(Integer.parseInt(result.get()));
                             temp.setquantity(quantity2);
                             prices2=temp.getprices();
                             prices2.add(Integer.parseInt(stores.get(x).getproducts().get(finalI).gettimh()));
                             temp.setprices(prices2);
                             temp.setoldprice(temp.getoldprice() +( Integer.parseInt(result.get()) * Integer.parseInt(stores.get(x).getproducts().get(finalI).gettimh())));
                         }
                     });
                 }
             }
             array[stores.get(x).getproducts().size()].setOnAction(e->addoffer(x,temp,-1));
         }
         VBox mypane4 = new VBox();
         mypane4.setPadding(new Insets(10));
         mypane4.setSpacing(8);
         mypane4.setAlignment(Pos.BOTTOM_RIGHT);
         Button aButton3 = new Button("BACK");
         mypane4.getChildren().add(aButton3);
         aButton3.setOnAction(e -> editstock(x));
         Button bButton3 = new Button("READY");
         mypane4.getChildren().add(bButton3);
         bButton3.setOnAction(e -> {
             TextInputDialog dialog = new TextInputDialog(null);
             dialog.setTitle("BOS");
             dialog.setHeaderText(null);
             dialog.setContentText("Please enter your offers name:");
             Optional<String> result = dialog.showAndWait();
             result.ifPresent(s -> temp.setoffername (s));
             do {
                 TextInputDialog dialog2 = new TextInputDialog(null);
                 dialog2.setTitle("BOS");
                 dialog2.setHeaderText(null);
                 dialog2.setContentText("Please enter your offers price:");
                 Optional<String> result2 = dialog2.showAndWait();
                 if (result2.isPresent()) {
                     temp.setofferprice(result2.get());
                     if(Integer.parseInt(result2.get())>=temp.getoldprice()){
                         Alert alert = new Alert(Alert.AlertType.ERROR);
                         alert.setTitle("BOS");
                         alert.setHeaderText(null);
                         alert.setContentText("Offer price must be lower than "+temp.getoldprice());
                         alert.showAndWait();
                     }
                 }
             }while(Integer.parseInt(temp.getofferprice())>=temp.getoldprice());
             stores.get(x).getoffers().add(temp);
             editstock(x);
         });
         GridPane mypane5 = new GridPane();
         mypane5.setPadding(new Insets(15));
         mypane5.setHgap(5);
         mypane5.setVgap(5);
         mypane5.setAlignment(Pos.TOP_RIGHT);
         border.setLeft(mypane);
         border.setCenter(mypane2);
         border.setBottom(mypane4);
         Text title3 = new Text("BOS");
         title3.setFill(Color.GREEN);
         title3.setFont(Font.font ("Verdana", 20));
         Text title4 = new Text(stores.get(x).getname());
         title4.setFont(Font.font ("Verdana", 20));
         HBox mypane3 = new HBox();
         mypane3.setPadding(new Insets(10));
         mypane3.setSpacing(38);
         mypane3.setAlignment(Pos.CENTER);
         mypane3.getChildren().add(title3);
         mypane3.getChildren().add(title4);
         border.setRight(mypane5);
         border.setTop(mypane3);
         window.setScene(new Scene(border, 800, 700));
         window.show();
     }

     public void addcategory(int x){
         GridPane mypane = new GridPane();
         mypane.setPadding(new Insets(15));
         mypane.setHgap(5);
         mypane.setVgap(5);
         mypane.add(new Label("CATEGORY NAME:"), 0, 1);
         TextField catname = new TextField();
         mypane.add(catname, 1, 1);
         Button Button2 = new Button("ADD CATEGORY");
         mypane.add(Button2, 1, 3);
         GridPane.setHalignment(Button2, HPos.LEFT);
         Button2.setOnAction(e -> {
             ArrayList<String> categories2;
             categories2=stores.get(x).getcategories();
             categories2.add(catname.getText());
             stores.get(x).setcategories(categories2);
             Filters temp = new Filters(catname.getText());
             ArrayList<Filters> filt2;
             filt2=stores.get(x).getfilt();
             filt2.add(temp);
             stores.get(x).setfilt(filt2);
             catname.setText("");
         });
         Button Button1 = new Button("BACK");
         mypane.add(Button1, 1, 5);
         GridPane.setHalignment(Button1, HPos.LEFT);
         Button1.setOnAction(e -> editstock(x));
         window.setScene(new Scene(mypane, 800, 700));
         window.show();
     }

     public void addproduct(int x){
         GridPane mypane = new GridPane();
         mypane.setPadding(new Insets(15));
         mypane.setHgap(5);
         mypane.setVgap(5);
         mypane.add(new Label("PRODUCT NAME:"), 0, 1);
         TextField proname = new TextField();
         mypane.add(proname, 1, 1);
         mypane.add(new Label("PRODUCT CODE:"), 0, 2);
         TextField procode = new TextField();
         mypane.add(procode, 1, 2);
         mypane.add(new Label("PRODUCT PRICE:"), 0, 3);
         TextField proprice = new TextField();
         mypane.add(proprice, 1, 3);
         Button Button2 = new Button("ADD PRODUCT");
         mypane.add(Button2, 1, 4);
         GridPane.setHalignment(Button2, HPos.LEFT);
         List<String> choices = new ArrayList<>(stores.get(x).getcategories());
         ChoiceDialog<String> dialog = new ChoiceDialog<>("no category", choices);
         dialog.setTitle("BOS");
         dialog.setHeaderText("your product is almost added!");
         dialog.setContentText("Choose your product's category :");
         Optional<String> result = dialog.showAndWait();
         if (result.isPresent()){
             if(result.get().equals("no category")){
                 ArrayList<Integer> prosekat2;
                 prosekat2=stores.get(x).getprosekat();
                 prosekat2.add(-1);
                 stores.get(x).setprosekat(prosekat2);
             }
             else{
                 for (int i = 0; i < stores.get(x).getcategories().size() ; i++) {
                     if(stores.get(x).getcategories().get(i).equals(result.get())) {
                         ArrayList<Integer> prosekat2;
                         prosekat2=stores.get(x).getprosekat();
                         prosekat2.add(i);
                         stores.get(x).setprosekat(prosekat2);
                     }
                 }
             }
         }
         else{ArrayList<Integer> prosekat2;
             prosekat2=stores.get(x).getprosekat();
             prosekat2.add(-1);
             stores.get(x).setprosekat(prosekat2);}
         Button2.setOnAction(e -> {
             Product temp2 = new Product(proprice.getText(),procode.getText(),proname.getText());
             ArrayList<Product> products2;
             products2=stores.get(x).getproducts();
             products2.add(temp2);
             stores.get(x).setproducts(products2);
             editstock(x);
         });
         Button Button1 = new Button("BACK");
         mypane.add(Button1, 1, 5);
         GridPane.setHalignment(Button1, HPos.LEFT);
         Button1.setOnAction(e -> editstock(x));
         window.setScene(new Scene(mypane, 800, 700));
         window.show();
     }

   public void addtocart(int x,int y,String z,int w) {////x to store y o customer ,quantity,proion
         ArrayList<Product> productsincart2 = customers.get(y).getkalathi().getproductsincart();
         productsincart2.add(stores.get(x).getproducts().get(w));
         customers.get(y).getkalathi().setproductsincart(productsincart2);
         ArrayList<Integer> quantity2 =customers.get(y).getkalathi().getquantity();
         quantity2.add(Integer.parseInt(z));
         customers.get(y).getkalathi().setquantity(quantity2);
         ArrayList<Integer> prices2 =customers.get(y).getkalathi().getprices();
         prices2.add(Integer.parseInt(stores.get(x).getproducts().get(w).gettimh()));
         customers.get(y).getkalathi().setprices(prices2);
         customers.get(y).getkalathi().setkostos(customers.get(y).getkalathi().getkostos()+(Integer.parseInt(stores.get(x).getproducts().get(w).gettimh())*Integer.parseInt(z)));
     }

   public void addoffertocart(int x,int y,String z,int w) {////x to store y o customer ,quantity,offer
         ArrayList<Offer> offersincart2 = customers.get(y).getkalathi().getoffersincart();
         offersincart2.add(stores.get(x).getoffers().get(w));
         customers.get(y).getkalathi().setoffersincart(offersincart2);
         ArrayList<Integer> offerquantity2 = customers.get(y).getkalathi().getofferquantity();
         offerquantity2.add(Integer.parseInt(z));
         customers.get(y).getkalathi().setofferquantity(offerquantity2);
         ArrayList<Integer> offerprices2 = customers.get(y).getkalathi().getofferprices();
         offerprices2.add(Integer.parseInt(stores.get(x).getoffers().get(w).getofferprice()));
         customers.get(y).getkalathi().setofferprices(offerprices2);
         customers.get(y).getkalathi().setkostos(customers.get(y).getkalathi().getkostos()+(Integer.parseInt(stores.get(x).getoffers().get(w).getofferprice())*Integer.parseInt(z)));
     }

 public void editcustomer(int y){
         GridPane mypane = new GridPane();
         mypane.setPadding(new Insets(10));
         mypane.setHgap(5);
         mypane.setVgap(3);
         mypane.setAlignment(Pos.CENTER);
         TextField nametf = new TextField();
         nametf.setPromptText(customers.get(y).getname());
         TextField phonetf = new TextField();
         phonetf.setPromptText(customers.get(y).getphone_number());
         TextField emailtf = new TextField();
         emailtf.setPromptText(customers.get(y).getemail());
         TextField passwordtf = new TextField();
         passwordtf.setPromptText(customers.get(y).getpassword());
         mypane.add(nametf, 1, 1);
         mypane.add(phonetf, 1, 2);
         mypane.add(emailtf, 1, 3);
         mypane.add(passwordtf, 1, 4);
         mypane.add(new Label("NAME:"), 0, 1);
         mypane.add(new Label("PHONE:"), 0, 2);
         mypane.add(new Label("EMAIL:"), 0, 3);
         mypane.add(new Label("PASSWORD:"), 0, 4);
         Button aButton = new Button("READY");
         mypane.add(aButton, 1, 5);
         GridPane.setHalignment(aButton, HPos.LEFT);
         aButton.setOnAction(e -> anazhthshkatasthmatos(y,-1,null));
         Button bButton = new Button("BACK");
         mypane.add(bButton, 0, 5);
         GridPane.setHalignment(bButton, HPos.LEFT);
         bButton.setOnAction(e -> anazhthshkatasthmatos(y,-1,null));
         Button cButton = new Button("EDIT");
         mypane.add(cButton, 3, 1);
         GridPane.setHalignment(cButton, HPos.LEFT);
         cButton.setOnAction(e -> customers.get(y).setname(nametf.getText()));
         Button eButton = new Button("EDIT");
         mypane.add(eButton, 3, 4);
         GridPane.setHalignment(eButton, HPos.LEFT);
         eButton.setOnAction(e -> customers.get(y).setpassword(passwordtf.getText()));
         Button fButton = new Button("EDIT");
         mypane.add(fButton, 3, 2);
         GridPane.setHalignment(fButton, HPos.LEFT);
         fButton.setOnAction(e -> customers.get(y).setphone_number(phonetf.getText()));
         Button gButton = new Button("EDIT");
         mypane.add(gButton, 3, 3);
         GridPane.setHalignment(gButton, HPos.LEFT);
         gButton.setOnAction(e -> customers.get(y).setemail(emailtf.getText()));
         window.setScene(new Scene(mypane, 800, 700));
         window.show();
     }

   public void editstore(int x){
         GridPane mypane = new GridPane();
         mypane.setPadding(new Insets(10));
         mypane.setHgap(5);
         mypane.setVgap(3);
         mypane.setAlignment(Pos.CENTER);
         TextField nametf = new TextField();
         nametf.setPromptText(stores.get(x).getname());
         TextField phonetf = new TextField();
         phonetf.setPromptText(stores.get(x).getphone_number());
         TextField emailtf = new TextField();
         emailtf.setPromptText(stores.get(x).getemail());
         TextField passwordtf = new TextField();
         passwordtf.setPromptText(stores.get(x).getpassword());
         TextField afmtf = new TextField();
         afmtf.setPromptText(stores.get(x).getafm() );
         mypane.add(nametf, 1, 1);
         mypane.add(phonetf, 1, 2);
         mypane.add(emailtf, 1, 3);
         mypane.add(passwordtf, 1, 4);
         mypane.add(afmtf, 1, 5);
         mypane.add(new Label("NAME:"), 0, 1);
         mypane.add(new Label("PHONE:"), 0, 2);
         mypane.add(new Label("EMAIL:"), 0, 3);
         mypane.add(new Label("PASSWORD:"), 0, 4);
         mypane.add(new Label("AFM:"), 0, 5);
         Button aButton = new Button("READY");
         mypane.add(aButton, 1, 6);
         GridPane.setHalignment(aButton, HPos.LEFT);
         aButton.setOnAction(e -> arxikhselidastore(x));
         Button bButton = new Button("BACK");
         mypane.add(bButton, 0, 6);
         GridPane.setHalignment(bButton, HPos.LEFT);
         bButton.setOnAction(e -> arxikhselidastore(x));
         Button cButton = new Button("EDIT");
         mypane.add(cButton, 3, 1);
         GridPane.setHalignment(cButton, HPos.LEFT);
         cButton.setOnAction(e -> stores.get(x).setname(nametf.getText()));
         Button eButton = new Button("EDIT");
         mypane.add(eButton, 3, 4);
         GridPane.setHalignment(eButton, HPos.LEFT);
         eButton.setOnAction(e -> stores.get(x).setpassword(passwordtf.getText()));
         Button fButton = new Button("EDIT");
         mypane.add(fButton, 3, 2);
         GridPane.setHalignment(fButton, HPos.LEFT);
         fButton.setOnAction(e -> stores.get(x).setphone_number(phonetf.getText()));
         Button gButton = new Button("EDIT");
         mypane.add(gButton, 3, 3);
         GridPane.setHalignment(gButton, HPos.LEFT);
         gButton.setOnAction(e -> stores.get(x).setemail(emailtf.getText()));
         Button hButton = new Button("EDIT");
         mypane.add(hButton, 3, 5);
         GridPane.setHalignment(gButton, HPos.LEFT);
         hButton.setOnAction(e -> stores.get(x).setafm(afmtf.getText()));
         window.setScene(new Scene(mypane, 800, 700));
         window.show();
     }

     public void editoffer(int x,int y){
         GridPane mypane = new GridPane();
         mypane.setPadding(new Insets(10));
         mypane.setHgap(5);
         mypane.setVgap(3);
         mypane.setAlignment(Pos.CENTER);
         int i = 0;
         if(stores.get(x).getoffers().get(y).getproductsinoffer().size()!=0) {
             ArrayList<Button> array = new ArrayList<>();
             ArrayList <Text> array2 = new ArrayList<>();
             ArrayList<Button> array3 = new ArrayList<>();
             ArrayList<Button> array4 = new ArrayList<>();
             ArrayList <Text> array5 = new ArrayList<>();
             ArrayList<Button> array6 = new ArrayList<>();
             Text text4 = new Text("TOTAL ORIGINAL COST="+stores.get(x).getoffers().get(y).getoldprice());
             Text text1 = new Text("ITEM");
             Text text2 = new Text("№");
             Text text3 = new Text("PRICE");
             mypane.add(text1,1, 1);
             mypane.add(text2,2, 1);
             mypane.add(text3,5, 1);
             mypane.add(text4,3,0);
             for (i = 0; i < stores.get(x).getoffers().get(y).getproductsinoffer().size(); i++) {
                 array.add(new Button(stores.get(x).getoffers().get(y).getproductsinoffer().get(i).getname()));
                 mypane.add(array.get(i), 1, i+2);
                 array2.add(new Text(String.valueOf(stores.get(x).getoffers().get(y).getquantity().get(i))));
                 mypane.add(array2.get(i), 2, i+2);
                 array3.add(new Button("+"));
                 mypane.add(array3.get(i), 3, i+2);
                 array4.add(new Button("-"));
                 mypane.add(array4.get(i), 4, i+2);
                 array5.add(new Text(String.valueOf(stores.get(x).getoffers().get(y).getprices().get(i))));
                 mypane.add(array5.get(i), 5, i+2);
                 array6.add(new Button("DELETE"));
                 mypane.add(array6.get(i), 6, i+2);
             }
             for ( i = 0; i < stores.get(x).getoffers().get(y).getproductsinoffer().size(); i++) {
                 int finalI = i;
                 array.get(i).setOnAction(e -> {
                     Alert alert = new Alert(Alert.AlertType.INFORMATION);
                     alert.setTitle("BOS");
                     alert.setHeaderText("Information about product "+stores.get(x).getoffers().get(y).getproductsinoffer().get(finalI).getname());
                     alert.setContentText("price : "+stores.get(x).getoffers().get(y).getproductsinoffer().get(finalI).gettimh());
                     alert.showAndWait();
                 });
             }
             for ( i = 0; i < stores.get(x).getoffers().get(y).getproductsinoffer().size(); i++) {
                 int final1 = i;
                 array3.get(i).setOnAction(e -> {
                     int temp = stores.get(x).getoffers().get(y).getquantity().get(final1);
                     stores.get(x).getoffers().get(y).getquantity().set(final1, temp + 1);
                     array2.remove(final1);
                     array2.add(final1,new Text(String.valueOf(stores.get(x).getoffers().get(y).getquantity().get(final1))));
                     array5.remove(final1);
                     array5.add(final1,new Text(String.valueOf(stores.get(x).getoffers().get(y).getprices().get(final1)*stores.get(x).getoffers().get(y).getquantity().get(final1))));
                     stores.get(x).getoffers().get(y).setoldprice(stores.get(x).getoffers().get(y).getoldprice()+ Integer.parseInt(stores.get(x).getoffers().get(y).getproductsinoffer().get(final1).gettimh()));
                     text4.setText("TOTAL ORIGINAL COST=" + stores.get(x).getoffers().get(y).getoldprice() + "€");
                     editoffer(x,y);
                 });
             }
             for ( i = 0; i < stores.get(x).getoffers().get(y).getproductsinoffer().size(); i++) {
                 int final2 = i;
                 array4.get(i).setOnAction(e -> {
                     int temp=stores.get(x).getoffers().get(y).getquantity().get(final2);
                     stores.get(x).getoffers().get(y).getquantity().set(final2,temp-1);
                     array2.remove(final2);
                     array2.add(final2,new Text(String.valueOf(stores.get(x).getoffers().get(y).getquantity().get(final2))));
                     array5.remove(final2);
                     array5.add(final2,new Text(String.valueOf(stores.get(x).getoffers().get(y).getprices().get(final2)*stores.get(x).getoffers().get(y).getquantity().get(final2))));
                     stores.get(x).getoffers().get(y).setoldprice(stores.get(x).getoffers().get(y).getoldprice()-Integer.parseInt(stores.get(x).getoffers().get(y).getproductsinoffer().get(final2).gettimh()));
                     text4.setText(("TOTAL ORIGINAL COST="+stores.get(x).getoffers().get(y).getoldprice()+"€"));
                     if(stores.get(x).getoffers().get(y).getquantity().get(final2)==0)
                     {
                         stores.get(x).getoffers().get(y).getproductsinoffer().remove(final2);
                         stores.get(x).getoffers().get(y).getquantity().remove(final2);
                         stores.get(x).getoffers().get(y).getprices().remove(final2);
                     }
                     editoffer(x,y);
                 });
             }
             for ( i = 0; i < stores.get(x).getoffers().get(y).getproductsinoffer().size(); i++) {
                 int final3 = i;
                 array6.get(i).setOnAction(e -> {
                     stores.get(x).getoffers().get(y).setofferprice(String.valueOf(Integer.parseInt(stores.get(x).getoffers().get(y).getofferprice())-(Integer.parseInt(stores.get(x).getoffers().get(y).getproductsinoffer().get(final3).gettimh())*stores.get(x).getoffers().get(y).getquantity().get(final3))));
                     stores.get(x).getoffers().get(y).getproductsinoffer().remove(final3);
                     stores.get(x).getoffers().get(y).getquantity().remove(final3);
                     stores.get(x).getoffers().get(y).getprices().remove(final3);
                     editoffer(x,y);
                 });
             }
         }
         else
         {
             mypane.getChildren().add(new Label("NO PRODUCTS ADDED"));
         }
         Button aButton = new Button("READY");
         mypane.add(aButton, 6, i+2);
         GridPane.setHalignment(aButton, HPos.LEFT);
         aButton.setOnAction(e -> {
             if(stores.get(x).getoffers().get(y).getproductsinoffer().isEmpty()){
                 Alert alert = new Alert(Alert.AlertType.WARNING);
                 alert.setTitle("BOS");
                 alert.setHeaderText(null);
                 alert.setContentText("no products added in the offer!");
                 alert.showAndWait();
             }
             else {
                 TextInputDialog dialog = new TextInputDialog(null);
                 dialog.setTitle("BOS");
                 dialog.setHeaderText(null);
                 dialog.setContentText("Please enter your offers name:");
                 Optional<String> result = dialog.showAndWait();
                 result.ifPresent(s -> stores.get(x).getoffers().get(y).setoffername(s));
                 do {
                     TextInputDialog dialog2 = new TextInputDialog(null);
                     dialog2.setTitle("BOS");
                     dialog2.setHeaderText(null);
                     dialog2.setContentText("Please enter your offers price:");
                     Optional<String> result2 = dialog2.showAndWait();
                     if (result2.isPresent()) {
                         stores.get(x).getoffers().get(y).setofferprice(result2.get());
                         if (Integer.parseInt(result2.get()) >= stores.get(x).getoffers().get(y).getoldprice()) {
                             Alert alert = new Alert(Alert.AlertType.ERROR);
                             alert.setTitle("BOS");
                             alert.setHeaderText(null);
                             alert.setContentText("Offer price must be lower than " + stores.get(x).getoffers().get(y).getoldprice());
                             alert.showAndWait();
                         }
                     }
                 } while (Integer.parseInt(stores.get(x).getoffers().get(y).getofferprice()) >= stores.get(x).getoffers().get(y).getoldprice());
                 editstock(x);
             }});
         Button bButton = new Button("BACK");
         mypane.add(bButton, 0, i+2);
         GridPane.setHalignment(bButton, HPos.LEFT);
         bButton.setOnAction(e -> {
             if(stores.get(x).getoffers().get(y).getproductsinoffer().isEmpty()){
                 stores.get(x).getoffers().remove(y);
                 Alert alert = new Alert(Alert.AlertType.INFORMATION);
                 alert.setTitle("BOS");
                 alert.setHeaderText(null);
                 alert.setContentText("offer has no products so it will be deleted!");
                 alert.showAndWait();
             }
             for (int h = 0; h < stores.get(x).getoffers().get(y).getproductsinoffer().size(); h++) {
                 if(stores.get(x).getoffers().get(y).getquantity().get(h)==0){stores.get(x).getoffers().get(y).getproductsinoffer().remove(h);stores.get(x).getoffers().get(y).getquantity().remove(h);}
             }
             editstock(x);
         });
         window.setScene(new Scene(mypane, 800, 700));
         window.show();
     }

     public void editcategory(int x,int i){//x store i category
         GridPane mypane = new GridPane();
         mypane.setPadding(new Insets(10));
         mypane.setHgap(5);
         mypane.setVgap(3);
         mypane.setAlignment(Pos.CENTER);
         TextField nametf = new TextField();
         mypane.add(nametf, 0, 2);
         mypane.add(new Label("CATEGORY NAME:"+stores.get(x).getcategories().get(i)), 0, 1);
         Button aButton = new Button("READY");
         mypane.add(aButton, 1, 6);
         GridPane.setHalignment(aButton, HPos.LEFT);
         aButton.setOnAction(e -> editstock(x));
         Button vButton = new Button("DELETE");
         mypane.add(vButton, 0, 5);
         GridPane.setHalignment(vButton, HPos.LEFT);
         vButton.setOnAction(e -> {
             stores.get(x).getcategories().remove(i);
             stores.get(x).getfilt().remove(i);
             for (int j = 0; j < stores.get(x).getprosekat().size(); j++) {
                 if(stores.get(x).getprosekat().get(j)==i){stores.get(x).getprosekat().set(j,-1);}
                 else if(stores.get(x).getprosekat().get(j)>i){stores.get(x).getprosekat().set(j,stores.get(x).getprosekat().get(j)-1);}
             }
             editstock(x);
         });
         Button bButton = new Button("BACK");
         mypane.add(bButton, 0, 6);
         GridPane.setHalignment(bButton, HPos.LEFT);
         bButton.setOnAction(e -> editstock(x));
         Button cButton = new Button("EDIT");
         mypane.add(cButton, 3, 2);
         GridPane.setHalignment(cButton, HPos.LEFT);
         cButton.setOnAction(e -> {
             stores.get(x).getcategories().set(i,nametf.getText());
             stores.get(x).getfilt().get(i).setcat(nametf.getText());
         });
         window.setScene(new Scene(mypane, 800, 700));
         window.show();
     }

     public void editproduct(int x,int i){//x store i product
         GridPane mypane = new GridPane();
         mypane.setPadding(new Insets(10));
         mypane.setHgap(5);
         mypane.setVgap(3);
         mypane.setAlignment(Pos.CENTER);

         TextField nametf = new TextField();
         mypane.add(new Label("PRODUCT NAME: "),0, 1);
         nametf.setPromptText(stores.get(x).getproducts().get(i).getname());
         mypane.add(nametf, 1, 1);

         TextField timhtf = new TextField();
         mypane.add(new Label("PRODUCT PRICE: "),0, 2);
         timhtf.setPromptText(stores.get(x).getproducts().get(i).gettimh());
         mypane.add(timhtf, 1, 2);

         TextField kwdikostf = new TextField();
         mypane.add(new Label("PRODUCT CODE: "),0, 3);
         kwdikostf.setPromptText(stores.get(x).getproducts().get(i).getkwdikos());
         mypane.add(kwdikostf, 1, 3);
         if(stores.get(x).getprosekat().get(i)!=-1)
             mypane.add(new Label("PRODUCT CATEGORY:"+stores.get(x).getcategories().get(stores.get(x).getprosekat().get(i))),0, 4);
         else
             mypane.add(new Label("PRODUCT ISNT CATEGORIZED:"),0, 4);
         MenuItem option1 = new MenuItem("no category");
         ArrayList<MenuItem> menu = new ArrayList<>();
         MenuButton menuButton = new MenuButton("change category ", null);
         for (int j = 0; j < stores.get(x).getcategories().size(); j++) {
             menu.add(new MenuItem(stores.get(x).getcategories().get(j)));
             menuButton.getItems().add(menu.get(j));
         }
         menuButton.getItems().add(option1);
         mypane.add(menuButton, 1, 4);
         option1.setOnAction(event -> stores.get(x).getprosekat().set(i,-1));
         for (int j = 0; j <stores.get(x).getcategories().size() ; j++) {
             int finalJ = j;
             menu.get(j).setOnAction(event -> stores.get(x).getprosekat().set(i, finalJ));
         }
         Button aButton = new Button("READY");
         mypane.add(aButton, 1, 6);
         GridPane.setHalignment(aButton, HPos.LEFT);
         aButton.setOnAction(e -> editstock(x));
         Button vButton = new Button("DELETE");
         mypane.add(vButton, 0, 5);
         GridPane.setHalignment(vButton, HPos.LEFT);
         vButton.setOnAction(e -> {
             stores.get(x).getproducts().remove(i);
             stores.get(x).getprosekat().remove(i);
             editstock(x);
         });
         Button bButton = new Button("BACK");
         mypane.add(bButton, 0, 6);
         GridPane.setHalignment(bButton, HPos.LEFT);
         bButton.setOnAction(e -> editstock(x));
         Button cButton = new Button("EDIT");
         mypane.add(cButton, 2, 1);
         GridPane.setHalignment(cButton, HPos.LEFT);
         cButton.setOnAction(e -> stores.get(x).getproducts().get(i).setname(nametf.getText()));
         Button dButton = new Button("EDIT");
         mypane.add(dButton, 2, 2);
         GridPane.setHalignment(dButton, HPos.LEFT);
         dButton.setOnAction(e -> stores.get(x).getproducts().get(i).settimh(timhtf.getText()));
         Button eButton = new Button("EDIT");
         mypane.add(eButton, 2, 3);
         GridPane.setHalignment(eButton, HPos.LEFT);
         eButton.setOnAction(e -> stores.get(x).getproducts().get(i).setkwdikos(kwdikostf.getText()));
         window.setScene(new Scene(mypane, 800, 700));
         window.show();
     }

 }
