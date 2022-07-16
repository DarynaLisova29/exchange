package com.example.exchange;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button button;

    @FXML
    private TextField det_sum;

    @FXML
    private TextField dollar;

    @FXML
    private TextField sum;

    @FXML
    void initialize() throws IOException {

        Document doc=Jsoup.connect("https://minfin.com.ua/ua/currency/usd/").get();
        button.setOnAction(event->{
        String str=doc.getElementsByClass("mfm-posr").text();
        String [] num1=str.split(" ");
        double dol;
        for(String num:num1){
            System.out.println(num);
        }
        if(Double.valueOf(num1[2])==0.00){
        dollar.setText(num1[3]);
         dol=Double.valueOf(num1[3]);
        }else{
            dollar.setText(num1[2]);
            dol=Double.valueOf(num1[2]);
        }
        String mon=sum.getText();
        double money=Double.valueOf(sum.getText());
        double result=money/dol;
        det_sum.setText(String.valueOf(result));


        });


    }

}