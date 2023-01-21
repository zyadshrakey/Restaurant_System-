package com.example.restraurantsystem;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class Desart {
    //Texts
    @FXML
    Text textForPrice=new Text();
    @FXML
    Text textForOm3li =new Text();
    @FXML
    Text textForB2lawa = new Text();
    @FXML
    Text textForglash=new Text();
    @FXML
    Text textForrozblabn=new Text();
    @FXML
    Text textForzalapya =new Text();
    @FXML
    Text textFor2atayf =new Text();
    @FXML
    Text textForMahlbya =new Text();

    //Prices
    private int PriceForOm3li =0;
    private int PriceForB2lawa=0;
    private int PriceForglash=0;
    private int PriceForrozblabn=0;
    private int PriceForzalapya=0;
    private int PriceFor2atayf=0;
    private int PriceForMahlbya=0;
    //Counters
    private int countOm3li=0;
    private int countB2lawa=0;
    private int countglash=0;
    private int countrozblabn=0;
    private int countzalapya=0;
    private int count2atayf=0;
    private int countMahlbya=0;
    //Fuctions
    @FXML
    void AddOm3liPrice(){
        PriceForOm3li+=4;
        countOm3li++;
        textForOm3li.setText(" number of Forzalapya = "+ countOm3li+ " Price for Forzalapya ="+ PriceForOm3li);
    }
    @FXML
    void removeOm3li(){
        if(PriceForOm3li==0)
            return;
        PriceForOm3li-=4;
        countOm3li--;
        textForOm3li.setText(" number of Forzalapya = "+ countOm3li+ " Price for Forzalapya ="+ PriceForOm3li);
    }
    @FXML
    void AddB2lawaPrice(){
        PriceForB2lawa+=4;
        countB2lawa++;
        textForB2lawa.setText(" number of Forzalapya = "+ countB2lawa+ " Price for Forzalapya ="+ PriceForB2lawa);
    }
    @FXML
    void removeB2lawa(){
        if(PriceForB2lawa==0)
            return;
        PriceForB2lawa-=4;
        countB2lawa--;
        textForB2lawa.setText(" number of Forzalapya = "+ countB2lawa+ " Price for Forzalapya ="+ PriceForB2lawa);
    }
    @FXML
    void AddglashPrice(){
        PriceForglash+=4;
        countglash++;
        textForglash.setText(" number of Forzalapya = "+ countglash+ " Price for Forzalapya ="+ PriceForglash);
    }
    @FXML
    void removeglash(){
        if(PriceForglash==0)
            return;
        PriceForglash-=4;
        countglash--;
        textForglash.setText(" number of Forzalapya = "+ countglash+ " Price for Forzalapya ="+ PriceForglash);
    }
    @FXML
    void AddrozblabnPrice(){
        PriceForrozblabn+=4;
        countrozblabn++;
        textForrozblabn.setText(" number of Forzalapya = "+ countrozblabn+ " Price for Forzalapya ="+ PriceForrozblabn);
    }
    @FXML
    void removerozblabn(){
        if(PriceForrozblabn==0)
            return;
        PriceForrozblabn-=4;
        countrozblabn--;
        textForrozblabn.setText(" number of Forzalapya = "+ countrozblabn+ " Price for Forzalapya ="+ PriceForrozblabn);
    }
    @FXML
    void AddzalapyaPrice(){
        PriceForzalapya+=4;
        countzalapya++;
        textForzalapya.setText(" number of Forzalapya = "+ countzalapya+ " Price for Forzalapya ="+ PriceForzalapya);
    }
    @FXML
    void removezalapya(){
        if(PriceForzalapya==0)
            return;
        PriceForzalapya-=4;
        countzalapya--;
        textForzalapya.setText(" number of Forzalapya = "+ countzalapya+ " Price for Forzalapya ="+ PriceForzalapya);
    }
    @FXML
    void Add2atayfPrice(){
        PriceFor2atayf+=4;
        count2atayf++;
        textFor2atayf.setText(" number of 2atayf ="+ count2atayf+" Price for 2atayf ="+ PriceFor2atayf);
    }
    @FXML
    void remove2atayf(){
        if(PriceFor2atayf==0)
            return;
        PriceFor2atayf-=4;
        count2atayf--;
        textFor2atayf.setText(" number of Ta3mya = "+ count2atayf+ " Price for ta3mya ="+ PriceFor2atayf);
    }
    @FXML
    void AddMahlbyaPrice(){
        PriceForMahlbya+=4;
        countMahlbya++;
        textForMahlbya.setText(" number of Mahlbya ="+ countMahlbya+" Price for Mahlbya ="+ PriceForMahlbya);
    }
    @FXML
    void removeMahlbya(){
        if(PriceForMahlbya==0)
            return;
        PriceForMahlbya-=4;
        countMahlbya--;
        textForMahlbya.setText(" number of Ta3mya = "+ countMahlbya+ " Price for ta3mya ="+ PriceForMahlbya);
    }
    int sum(){
        return PriceForB2lawa+PriceForglash+PriceFor2atayf+PriceForrozblabn+PriceForMahlbya+PriceForOm3li+PriceForzalapya;
    }
    @FXML
    void PrintSum(){
        textForPrice.setText("Price ="+sum());
    }
}
