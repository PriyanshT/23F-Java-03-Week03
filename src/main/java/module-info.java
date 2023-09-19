module com.georgiancollege.week03 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.georgiancollege.week03 to javafx.fxml;
    exports com.georgiancollege.week03;
}