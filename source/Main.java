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


    public static void main(String[] args)
       {
         launch(args);
       }

 }
