module com.example.firstjavafxnew {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.firstjavafxnew to javafx.fxml;
    exports com.example.firstjavafxnew;
}