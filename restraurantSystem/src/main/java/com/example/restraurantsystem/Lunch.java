package com.example.restraurantsystem;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class Lunch {
    //Texts
    @FXML
    Text textForPrice=new Text();
    @FXML
    Text textForChicken =new Text();
    @FXML
    Text textForMakronaBashmel = new Text();
    @FXML
    Text textForMa7shy=new Text();
    @FXML
    Text textForRice=new Text();
    @FXML
    Text textForKofta =new Text();
    @FXML
    Text textForMolo5ya =new Text();
    @FXML
    Text textForBamya =new Text();
    @FXML
    Text textForMombar =new Text();
    @FXML
    Text textForShesh =new Text();
    @FXML
    Text textForShorba =new Text();
    @FXML
    Text textForFish =new Text();
    @FXML
    Text textForGampry =new Text();
    //Prices
    private int PriceForChicken =0;
    private int PriceForMakronaBashmel=0;
    private int PriceForMa7shy=0;
    private int PriceForRice=0;
    private int PriceForKofta=0;
    private int PriceForMolo5ya=0;
    private int PriceForBamya=0;
    private int PriceForMombar=0;
    private int PriceForShesh=0;
    private int PriceForShorba=0;
    private int PriceForFish=0;
    private int PriceForGampry=0;
    //Counters
    private int countChicken=0;
    private int countMakronaBashmel=0;
    private int countMa7shy=0;
    private int countRice=0;
    private int countKofta=0;
    private int countMolo5ya=0;
    private int countBamya=0;
    private int countMombar=0;
    private int countShesh=0;
    private int countShorba=0;
    private int countFish=0;
    private int countGampry=0;
    //Fuctions
    @FXML
    void AddChickenPrice(){
        PriceForChicken+=4;
        countChicken++;
        textForChicken.setText(" number of ForKofta = "+ countChicken+ " Price for ForKofta ="+ PriceForChicken);
    }
    @FXML
    void removeChicken(){
        if(PriceForChicken==0)
            return;
        PriceForChicken-=4;
        countChicken--;
        textForChicken.setText(" number of ForKofta = "+ countChicken+ " Price for ForKofta ="+ PriceForChicken);
    }
    @FXML
    void AddMakronaBashmelPrice(){
        PriceForMakronaBashmel+=4;
        countMakronaBashmel++;
        textForMakronaBashmel.setText(" number of ForKofta = "+ countMakronaBashmel+ " Price for ForKofta ="+ PriceForMakronaBashmel);
    }
    @FXML
    void removeMakronaBashmel(){
        if(PriceForMakronaBashmel==0)
            return;
        PriceForMakronaBashmel-=4;
        countMakronaBashmel--;
        textForMakronaBashmel.setText(" number of ForKofta = "+ countMakronaBashmel+ " Price for ForKofta ="+ PriceForMakronaBashmel);
    }
    @FXML
    void AddMa7shyPrice(){
        PriceForMa7shy+=4;
        countMa7shy++;
        textForMa7shy.setText(" number of ForKofta = "+ countMa7shy+ " Price for ForKofta ="+ PriceForMa7shy);
    }
    @FXML
    void removeMa7shy(){
        if(PriceForMa7shy==0)
            return;
        PriceForMa7shy-=4;
        countMa7shy--;
        textForMa7shy.setText(" number of ForKofta = "+ countMa7shy+ " Price for ForKofta ="+ PriceForMa7shy);
    }
    @FXML
    void AddRicePrice(){
        PriceForRice+=4;
        countRice++;
        textForRice.setText(" number of ForKofta = "+ countRice+ " Price for ForKofta ="+ PriceForRice);
    }
    @FXML
    void removeRice(){
        if(PriceForRice==0)
            return;
        PriceForRice-=4;
        countRice--;
        textForRice.setText(" number of ForKofta = "+ countRice+ " Price for ForKofta ="+ PriceForRice);
    }
    @FXML
    void AddKoftaPrice(){
        PriceForKofta+=4;
        countKofta++;
        textForKofta.setText(" number of ForKofta = "+ countKofta+ " Price for ForKofta ="+ PriceForKofta);
    }
    @FXML
    void removeKofta(){
        if(PriceForKofta==0)
            return;
        PriceForKofta-=4;
        countKofta--;
        textForKofta.setText(" number of ForKofta = "+ countKofta+ " Price for ForKofta ="+ PriceForKofta);
    }
    @FXML
    void AddMolo5yaPrice(){
        PriceForMolo5ya+=4;
        countMolo5ya++;
        textForMolo5ya.setText(" number of Molo5ya ="+ countMolo5ya+" Price for Molo5ya ="+ PriceForMolo5ya);
    }
    @FXML
    void removeMolo5ya(){
        if(PriceForMolo5ya==0)
            return;
        PriceForMolo5ya-=4;
        countMolo5ya--;
        textForMolo5ya.setText(" number of Ta3mya = "+ countMolo5ya+ " Price for ta3mya ="+ PriceForMolo5ya);
    }
    @FXML
    void AddBamyaPrice(){
        PriceForBamya+=4;
        countBamya++;
        textForBamya.setText(" number of Bamya ="+ countBamya+" Price for Bamya ="+ PriceForBamya);
    }
    @FXML
    void removeBamya(){
        if(PriceForBamya==0)
            return;
        PriceForBamya-=4;
        countBamya--;
        textForBamya.setText(" number of Ta3mya = "+ countBamya+ " Price for ta3mya ="+ PriceForBamya);
    }
    @FXML
    void AddMombarPrice(){
        PriceForMombar+=4;
        countMombar++;
        textForMombar.setText(" number of Mombar ="+ countMombar+" Price for Mombar ="+ PriceForMombar);
    }
    @FXML
    void removeMombar(){
        if(PriceForMombar==0)
            return;
        PriceForMombar-=4;
        countMombar--;
        textForMombar.setText(" number of Ta3mya = "+ countMombar+ " Price for ta3mya ="+ PriceForMombar);
    }
    @FXML
    void AddSheshPrice(){
        PriceForShesh+=4;
        countShesh++;
        textForShesh.setText(" number of Shesh ="+ countShesh+" Price for Shesh ="+ PriceForShesh);
    }
    @FXML
    void removeShesh(){
        if(PriceForShesh==0)
            return;
        PriceForShesh-=4;
        countShesh--;
        textForShesh.setText(" number of Ta3mya = "+ countShesh+ " Price for ta3mya ="+ PriceForShesh);
    }
    @FXML
    void AddShorbaPrice(){
        PriceForShorba+=4;
        countShorba++;
        textForShorba.setText(" number of Shorba ="+ countShorba+" Price for fool ="+ PriceForShorba);
    }
    @FXML
    void removeShorba(){
        if(PriceForShorba==0)
            return;
        PriceForShorba-=4;
        countShorba--;
        textForShorba.setText(" number of Ta3mya = "+ countShorba+ " Price for ta3mya ="+ PriceForShorba);
    }
    @FXML
    void AddFishPrice(){
        PriceForFish+=4;
        countFish++;
        textForFish.setText(" number of Fish ="+ countFish+" Price for fool ="+ PriceForFish);
    }
    @FXML
    void removeFish(){
        if(PriceForFish==0)
            return;
        PriceForFish-=4;
        countFish--;
        textForFish.setText(" number of Ta3mya = "+ countFish+ " Price for ta3mya ="+ PriceForFish);
    }
    @FXML
    void AddGampryPrice(){
        PriceForGampry+=4;
        countGampry++;
        textForGampry.setText(" number of Gampry ="+ countGampry+" Price for fool ="+ PriceForGampry);
    }
    @FXML
    void removeGampry(){
        if(PriceForGampry==0)
            return;
        PriceForGampry-=4;
        countGampry--;
        textForGampry.setText(" number of Ta3mya = "+ countGampry+ " Price for ta3mya ="+ PriceForGampry);
    }
    int sum(){
        return PriceForBamya+PriceForChicken+PriceForFish+PriceForGampry+PriceForMa7shy+PriceForKofta+PriceForChicken+PriceForMakronaBashmel+PriceForMolo5ya+PriceForMombar+PriceForRice+PriceForShesh+PriceForShorba;
    }
    @FXML
    void PrintSum(){
        textForPrice.setText("Price ="+sum());
    }

}
