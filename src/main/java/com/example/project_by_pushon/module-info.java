module com.example.project_by_pushon {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.project_by_pushon to javafx.fxml;
    exports com.example.project_by_pushon;
}