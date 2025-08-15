package com.example.project_by_pushon;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;

public class U7G8ArchiveReports {

    @FXML
    private TableView<ArchivedReport> archiveTable;

    @FXML
    private TableColumn<ArchivedReport, String> reportNameColumn;

    @FXML
    private TableColumn<ArchivedReport, String> dateArchivedColumn;

    @FXML
    private TableColumn<ArchivedReport, String> sizeColumn;

    @FXML
    private ComboBox<String> eventCBox;

    @FXML
    private TextField reportPathTF;

    @FXML
    private Label confirmationLabel;

    @FXML
    public void initialize() {
        if (reportNameColumn != null) {
            reportNameColumn.setCellValueFactory(new PropertyValueFactory<>("reportName"));
            dateArchivedColumn.setCellValueFactory(new PropertyValueFactory<>("dateArchived"));
            sizeColumn.setCellValueFactory(new PropertyValueFactory<>("size"));
            loadSampleData();
        }

        eventCBox.setItems(FXCollections.observableArrayList("Event 1", "Event 2", "Event 3"));
    }

    private void loadSampleData() {
        ObservableList<ArchivedReport> sampleData = FXCollections.observableArrayList(
                new ArchivedReport("Q2 Financial Summary", "2023-07-01", "1.2 MB"),
                new ArchivedReport("Annual Security Review", "2023-01-15", "5.8 MB"),
                new ArchivedReport("Vendor Contracts 2022", "2023-01-10", "12.3 MB"),
                new ArchivedReport("Post-Event Analysis - Summer Fest", "2022-09-20", "2.5 MB")
        );

        archiveTable.setItems(sampleData);
    }

    @FXML
    private void browseONA() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Report File");
        java.io.File selectedFile = fileChooser.showOpenDialog(null);
        if (selectedFile != null) {
            reportPathTF.setText(selectedFile.getAbsolutePath());
        }
    }

    @FXML
    private void uploadONA() {
        if (eventCBox.getValue() != null && !reportPathTF.getText().isEmpty()) {
            confirmationLabel.setText("Report archived successfully!");
        } else {
            confirmationLabel.setText("Please select an event and choose a file.");
        }
    }
}