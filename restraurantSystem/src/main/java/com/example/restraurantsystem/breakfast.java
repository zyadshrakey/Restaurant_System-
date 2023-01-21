package com.example.restraurantsystem;

import javafx.fxml.FXML;
import javafx.scene.text.Text;



public class breakfast {
    //Texts
    @FXML
    Text textPrice=new Text();
    @FXML
    Text textForTa3mya =new Text();
    @FXML
    Text textForFool =new Text();
    @FXML
    Text textForBatats=new Text();
    @FXML
    Text textForShakahoka=new Text();
    @FXML
    Text textForBetngan=new Text();
    @FXML
    Text textForRomy=new Text();
    @FXML
    Text textFor2shta=new Text();
    @FXML
    Text textFor3asal=new Text();
    //Counter
    private int countTa3mya=0 ;
    private int countFool=0;
    private int countBatats=0;
    private int countShakahoka=0;
    private int countBetngan=0;
    private int countRomy=0;
    private int count2shta=0;
    private int count3asal=0;
    //Prices

    private int PriceForT3mya=0;
    private int PriceForShakahoka=0;

    private int PriceForBatats=0;

    private int PriceForFool=0;
    private int PriceForBetngan=0;
    private int PriceForRomy=0;
    private int PriceFor2shta=0;
    private int PriceFor3asal=0;
    //Functions
    @FXML
    void AddT3myaPrice(){
        PriceForT3mya+=4;
        countTa3mya++;
        textForTa3mya.setText(" number of Ta3mya = "+ countTa3mya+ " Price for ta3mya ="+ PriceForT3mya);
    }
    @FXML
    void removeT3mya(){
        if(PriceForT3mya==0)
            return;
        PriceForT3mya-=4;
        countTa3mya--;
        textForTa3mya.setText(" number of Ta3mya = "+ countTa3mya+ " Price for ta3mya ="+ PriceForT3mya);
    }
    @FXML
    void AddFoolPrice(){
        PriceForFool+=4;
        countFool++;
        textForFool.setText(" number of Fool ="+ countFool+" Price for fool ="+ PriceForFool);
    }
    @FXML
    void removeFool(){
        if(PriceForFool==0)
            return;
        PriceForFool-=4;
        countFool--;
        textForFool.setText(" number of Fool = "+ countFool+ " Price for Fool" +
                " ="+ PriceForFool);
    }
    @FXML
    void AddBatatsPrice(){
        PriceForBatats+=5;
        countBatats++;
        textForBatats.setText(" number of Batats = "+ countBatats+ " Price for Batats ="+ PriceForBatats);
    }
    @FXML
    void removeBatats(){
        if(PriceForBatats==0)
            return;
        PriceForBatats-=5;
        countBatats--;
        textForBatats.setText(" number of Batats = "+ countBatats+ " Price for Batats ="+ PriceForBatats);
    }
    @FXML
    void AddShakahokaPrice(){
        PriceForShakahoka+=5;
        countShakahoka++;
        textForShakahoka.setText(" number of Shakahoka = "+ countShakahoka+ " Price for Shakahoka ="+ PriceForShakahoka);
    }
    @FXML
    void removeShakahoka(){
        if(PriceForShakahoka==0)
            return;
        PriceForShakahoka-=5;
        countShakahoka--;
        textForShakahoka.setText(" number of Shakahoka = "+ countShakahoka+ " Price for Shakahoka ="+ PriceForShakahoka);
    }
    @FXML
    void AddBetnganPrice(){
        PriceForBetngan+=5;
        countBetngan++;
        textForBetngan.setText(" number of Betngan = "+ countBetngan+ " Price for Betngan ="+ PriceForBetngan);
    }
    @FXML
    void removeBetngan(){
        if(PriceForBetngan==0)
            return;
        PriceForBetngan-=5;
        countBetngan--;
        textForBetngan.setText(" number of Betngan = "+ countBetngan+ " Price for Betngan ="+ PriceForBetngan);
    }
    @FXML
    void AddRomyPrice(){
        PriceForRomy+=6;
        countRomy++;
        textForRomy.setText(" number of Romy = "+ countRomy+ " Price for Romy ="+ PriceForRomy);
    }
    @FXML
    void removeRomy(){
        if(PriceForRomy==0)
            return;
        PriceForRomy-=6;
        countRomy--;
        textForRomy.setText(" number of Romy = "+ countRomy+ " Price for Romy ="+ PriceForRomy);
    }
    @FXML
    void Add2shtaPrice(){
        PriceFor2shta+=7;
        count2shta++;
        textFor2shta.setText(" number of 2shta = "+ count2shta+ " Price for 2shta ="+ PriceFor2shta);
    }
    @FXML
    void remove2shta(){
        if(PriceFor2shta==0)
            return;
        PriceFor2shta-=7;
        count2shta--;
        textFor2shta.setText(" number of 2shta = "+ count2shta+ " Price for 2shta ="+ PriceFor2shta);
    }
    @FXML
    void Add3asalPrice(){
        PriceFor3asal+=5;
        count3asal++;
        textFor3asal.setText(" number of 3asal = "+ count3asal+ " Price for 3asal ="+ PriceFor3asal);
    }
    @FXML
    void remove3asal(){
        if(PriceFor3asal==0)
            return;
        PriceFor3asal-=5;
        count3asal--;
        textFor3asal.setText(" number of 3asal = "+ count3asal+ " Price for 3asal ="+ PriceFor3asal);
    }
    int sum(){
        return PriceForFool+PriceForT3mya+PriceForBatats+PriceForRomy+PriceFor2shta+PriceForShakahoka+PriceForBetngan+PriceFor3asal;
    }
    @FXML
    void PrintSum(){
        textPrice.setText("Price ="+sum());
    }
}