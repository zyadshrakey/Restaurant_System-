module com.example.restraurantsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.restraurantsystem to javafx.fxml;
    exports com.example.restraurantsystem;
}