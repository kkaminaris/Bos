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

    public static void main(String[] args)
       {
         launch(args);
       }

 }
