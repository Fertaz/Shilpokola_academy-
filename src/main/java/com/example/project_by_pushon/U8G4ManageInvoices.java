package com.example.project_by_pushon;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

public class U8G4ManageInvoices {

    @FXML
    private ComboBox<String> vendorCB;

    @FXML
    private TextField invoiceDetailsTF;

    @FXML
    private Label confirmationLabel;

    private ObservableList<Invoice> invoices;

    @FXML
    public void initialize() {
        loadVendors();
        loadSampleData();
    }

    private void loadVendors() {
        ObservableList<String> vendors = FXCollections.observableArrayList(
                "Sound Systems Inc.",
                "Lighting FX Co.",
                "Staging Solutions",
                "Catering Services",
                "Security Team LLC"
        );
        vendorCB.setItems(vendors);
    }

    private void loadSampleData() {
        invoices = FXCollections.observableArrayList(
                new Invoice("INV-201", "Sound Systems Inc.", 1250.75, "2024-09-01", "Paid"),
                new Invoice("INV-202", "Lighting FX Co.", 850.00, "2024-08-25", "Overdue"),
                new Invoice("INV-203", "Staging Solutions", 2500.50, "2024-09-15", "Pending"),
                new Invoice("INV-204", "Catering Services", 1800.25, "2024-09-05", "Paid"),
                new Invoice("INV-205", "Security Team LLC", 3200.00, "2024-09-20", "Pending")
        );
    }

    @FXML
    private void uploadPdfONA() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Invoice PDF");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("PDF Files", "*.pdf"));
        java.io.File selectedFile = fileChooser.showOpenDialog(null);

        if (selectedFile != null) {
            confirmationLabel.setText("PDF uploaded: " + selectedFile.getName());
        } else {
            confirmationLabel.setText("No file selected.");
        }
    }

    @FXML
    private void savepdfONA() {
        if (vendorCB.getValue() != null && !invoiceDetailsTF.getText().isEmpty()) {
            confirmationLabel.setText("Invoice saved for vendor: " + vendorCB.getValue());
        } else {
            confirmationLabel.setText("Please select a vendor and enter invoice details.");
        }
    }
}