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

 }
