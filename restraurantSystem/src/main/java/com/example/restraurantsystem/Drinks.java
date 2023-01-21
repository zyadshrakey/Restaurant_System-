package com.example.restraurantsystem;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class Drinks {
    //Texts
    @FXML
    Text textForPrice=new Text();
    @FXML
    Text textForPepsi =new Text();
    @FXML
    Text textForManga = new Text();
    @FXML
    Text textForLamonN3na3=new Text();
    @FXML
    Text textForKewey=new Text();
    @FXML
    Text textForMilkCheck =new Text();

    //Prices
    private int PriceForPepsi =0;
    private int PriceForManga=0;
    private int PriceForLamonN3na3=0;
    private int PriceForKewey=0;
    private int PriceForMilkCheck=0;
    //Counters
    private int countPepsi=0;
    private int countManga=0;
    private int countLamonN3na3=0;
    private int countKewey=0;
    private int countMilkCheck=0;
    //Fuctions
    @FXML
    void AddPepsiPrice(){
        PriceForPepsi+=4;
        countPepsi++;
        textForPepsi.setText(" number of ForMilkCheck = "+ countPepsi+ " Price for ForMilkCheck ="+ PriceForPepsi);
    }
    @FXML
    void removePepsi(){
        if(PriceForPepsi==0)
            return;
        PriceForPepsi-=4;
        countPepsi--;
        textForPepsi.setText(" number of ForMilkCheck = "+ countPepsi+ " Price for ForMilkCheck ="+ PriceForPepsi);
    }
    @FXML
    void AddMangaPrice(){
        PriceForManga+=4;
        countManga++;
        textForManga.setText(" number of ForMilkCheck = "+ countManga+ " Price for ForMilkCheck ="+ PriceForManga);
    }
    @FXML
    void removeManga(){
        if(PriceForManga==0)
            return;
        PriceForManga-=4;
        countManga--;
        textForManga.setText(" number of ForMilkCheck = "+ countManga+ " Price for ForMilkCheck ="+ PriceForManga);
    }
    @FXML
    void AddLamonN3na3Price(){
        PriceForLamonN3na3+=4;
        countLamonN3na3++;
        textForLamonN3na3.setText(" number of ForMilkCheck = "+ countLamonN3na3+ " Price for ForMilkCheck ="+ PriceForLamonN3na3);
    }
    @FXML
    void removeLamonN3na3(){
        if(PriceForLamonN3na3==0)
            return;
        PriceForLamonN3na3-=4;
        countLamonN3na3--;
        textForLamonN3na3.setText(" number of ForMilkCheck = "+ countLamonN3na3+ " Price for ForMilkCheck ="+ PriceForLamonN3na3);
    }
    @FXML
    void AddKeweyPrice(){
        PriceForKewey+=4;
        countKewey++;
        textForKewey.setText(" number of ForMilkCheck = "+ countKewey+ " Price for ForMilkCheck ="+ PriceForKewey);
    }
    @FXML
    void removeKewey(){
        if(PriceForKewey==0)
            return;
        PriceForKewey-=4;
        countKewey--;
        textForKewey.setText(" number of ForMilkCheck = "+ countKewey+ " Price for ForMilkCheck ="+ PriceForKewey);
    }
    @FXML
    void AddMilkCheckPrice(){
        PriceForMilkCheck+=4;
        countMilkCheck++;
        textForMilkCheck.setText(" number of ForMilkCheck = "+ countMilkCheck+ " Price for ForMilkCheck ="+ PriceForMilkCheck);
    }
    @FXML
    void removeMilkCheck(){
        if(PriceForMilkCheck==0)
            return;
        PriceForMilkCheck-=4;
        countMilkCheck--;
        textForMilkCheck.setText(" number of ForMilkCheck = "+ countMilkCheck+ " Price for ForMilkCheck ="+ PriceForMilkCheck);
    }
    int sum(){
        return PriceForManga+PriceForLamonN3na3+PriceForKewey+PriceForPepsi+PriceForMilkCheck;
    }
    @FXML
    void PrintSum(){
        textForPrice.setText("Price ="+sum());
    }
}
