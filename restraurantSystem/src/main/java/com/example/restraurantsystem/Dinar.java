package com.example.restraurantsystem;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class Dinar {
    //Texts
    @FXML
    Text textForPrice=new Text();
    @FXML
    Text textForPizza =new Text();
    @FXML
    Text textFor7awwshy = new Text();
    @FXML
    Text textForChickenBargar=new Text();
    @FXML
    Text textForSambosk=new Text();
    @FXML
    Text textForShawrma =new Text();
    @FXML
    Text textForKebda =new Text();
    @FXML
    Text textForFeteraGbna =new Text();
    @FXML
    Text textForKreb =new Text();
    //Prices
    private int PriceForPizza =0;
    private int PriceFor7awwshy=0;
    private int PriceForChickenBargar=0;
    private int PriceForSambosk=0;
    private int PriceForShawrma=0;
    private int PriceForKebda=0;
    private int PriceForFeteraGbna=0;
    private int PriceForKreb=0;
    //Counters
    private int countPizza=0;
    private int count7awwshy=0;
    private int countChickenBargar=0;
    private int countSambosk=0;
    private int countShawrma=0;
    private int countKebda=0;
    private int countFeteraGbna=0;
    private int countKreb=0;
    //Fuctions
    @FXML
    void AddPizzaPrice(){
        PriceForPizza+=4;
        countPizza++;
        textForPizza.setText(" number of ForShawrma = "+ countPizza+ " Price for ForShawrma ="+ PriceForPizza);
    }
    @FXML
    void removePizza(){
        if(PriceForPizza==0)
            return;
        PriceForPizza-=4;
        countPizza--;
        textForPizza.setText(" number of ForShawrma = "+ countPizza+ " Price for ForShawrma ="+ PriceForPizza);
    }
    @FXML
    void Add7awwshyPrice(){
        PriceFor7awwshy+=4;
        count7awwshy++;
        textFor7awwshy.setText(" number of ForShawrma = "+ count7awwshy+ " Price for ForShawrma ="+ PriceFor7awwshy);
    }
    @FXML
    void remove7awwshy(){
        if(PriceFor7awwshy==0)
            return;
        PriceFor7awwshy-=4;
        count7awwshy--;
        textFor7awwshy.setText(" number of ForShawrma = "+ count7awwshy+ " Price for ForShawrma ="+ PriceFor7awwshy);
    }
    @FXML
    void AddChickenBargarPrice(){
        PriceForChickenBargar+=4;
        countChickenBargar++;
        textForChickenBargar.setText(" number of ForShawrma = "+ countChickenBargar+ " Price for ForShawrma ="+ PriceForChickenBargar);
    }
    @FXML
    void removeChickenBargar(){
        if(PriceForChickenBargar==0)
            return;
        PriceForChickenBargar-=4;
        countChickenBargar--;
        textForChickenBargar.setText(" number of ForShawrma = "+ countChickenBargar+ " Price for ForShawrma ="+ PriceForChickenBargar);
    }
    @FXML
    void AddSamboskPrice(){
        PriceForSambosk+=4;
        countSambosk++;
        textForSambosk.setText(" number of ForShawrma = "+ countSambosk+ " Price for ForShawrma ="+ PriceForSambosk);
    }
    @FXML
    void removeSambosk(){
        if(PriceForSambosk==0)
            return;
        PriceForSambosk-=4;
        countSambosk--;
        textForSambosk.setText(" number of ForShawrma = "+ countSambosk+ " Price for ForShawrma ="+ PriceForSambosk);
    }
    @FXML
    void AddShawrmaPrice(){
        PriceForShawrma+=4;
        countShawrma++;
        textForShawrma.setText(" number of ForShawrma = "+ countShawrma+ " Price for ForShawrma ="+ PriceForShawrma);
    }
    @FXML
    void removeShawrma(){
        if(PriceForShawrma==0)
            return;
        PriceForShawrma-=4;
        countShawrma--;
        textForShawrma.setText(" number of ForShawrma = "+ countShawrma+ " Price for ForShawrma ="+ PriceForShawrma);
    }
    @FXML
    void AddKebdaPrice(){
        PriceForKebda+=4;
        countKebda++;
        textForKebda.setText(" number of Kebda ="+ countKebda+" Price for Kebda ="+ PriceForKebda);
    }
    @FXML
    void removeKebda(){
        if(PriceForKebda==0)
            return;
        PriceForKebda-=4;
        countKebda--;
        textForKebda.setText(" number of Ta3mya = "+ countKebda+ " Price for ta3mya ="+ PriceForKebda);
    }
    @FXML
    void AddFeteraGbnaPrice(){
        PriceForFeteraGbna+=4;
        countFeteraGbna++;
        textForFeteraGbna.setText(" number of FeteraGbna ="+ countFeteraGbna+" Price for FeteraGbna ="+ PriceForFeteraGbna);
    }
    @FXML
    void removeFeteraGbna(){
        if(PriceForFeteraGbna==0)
            return;
        PriceForFeteraGbna-=4;
        countFeteraGbna--;
        textForFeteraGbna.setText(" number of Ta3mya = "+ countFeteraGbna+ " Price for ta3mya ="+ PriceForFeteraGbna);
    }
    @FXML
    void AddKrebPrice(){
        PriceForKreb+=4;
        countKreb++;
        textForKreb.setText(" number of Kreb ="+ countKreb+" Price for Kreb ="+ PriceForKreb);
    }
    @FXML
    void removeKreb(){
        if(PriceForKreb==0)
            return;
        PriceForKreb-=4;
        countKreb--;
        textForKreb.setText(" number of Ta3mya = "+ countKreb+ " Price for ta3mya ="+ PriceForKreb);
    }
    int sum(){
        return PriceFor7awwshy+PriceForChickenBargar+PriceForKebda+PriceForKreb+PriceForSambosk+PriceForFeteraGbna+PriceForPizza+PriceForShawrma;
    }
    @FXML
    void PrintSum(){
        textForPrice.setText("Price ="+sum());
    }
}
