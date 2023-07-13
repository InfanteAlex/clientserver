module com.example.clientserv {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.clientserv to javafx.fxml;
    exports com.example.clientserv;
}