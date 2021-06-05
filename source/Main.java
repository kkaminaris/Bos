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


    public static void main(String[] args)
       {
         launch(args);
       }

 }
