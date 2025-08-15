package com.example.project_by_pushon;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class U8G2FinancialReports {

    @FXML
    private ComboBox<String> reportPeriodCB;

    @FXML
    private Label notificationLabel;

    private ObservableList<FinancialReport> availableReports;

    @FXML
    public void initialize() {
        loadReportPeriods();
        loadSampleData();
    }

    private void loadReportPeriods() {
        ObservableList<String> periods = FXCollections.observableArrayList(
                "July 2024",
                "Q3 2024",
                "August 2024",
                "Year to Date 2024"
        );
        reportPeriodCB.setItems(periods);
    }

    private void loadSampleData() {
        availableReports = FXCollections.observableArrayList(
                new FinancialReport("REP-2024-01", "July 2024 Summary", "2024-08-01", 15000.00, 8500.50),
                new FinancialReport("REP-2024-02", "Vendor Payments Q3", "2024-08-05", 0.00, 12500.75),
                new FinancialReport("REP-2024-03", "Ticket Sales Analysis", "2024-08-10", 25000.00, 250.00),
                new FinancialReport("REP-2024-04", "Merchandise Revenue", "2024-08-12", 8500.00, 3200.20),
                new FinancialReport("REP-2024-05", "Overall Event P&L", "2024-08-14", 43500.00, 24450.95)
        );
    }

    @FXML
    private void generateReportONA() {
        if (reportPeriodCB.getValue() != null) {
            notificationLabel.setText("Financial report generated for: " + reportPeriodCB.getValue());
        } else {
            notificationLabel.setText("Please select a report period first.");
        }
    }

    @FXML
    private void downloadpdfONA() {
        if (reportPeriodCB.getValue() != null) {
            notificationLabel.setText("PDF downloaded for: " + reportPeriodCB.getValue());
        } else {
            notificationLabel.setText("Please generate a report first.");
        }
    }

    @FXML
    private void emailONA() {
        if (reportPeriodCB.getValue() != null) {
            notificationLabel.setText("Report emailed for: " + reportPeriodCB.getValue());
        } else {
            notificationLabel.setText("Please generate a report first.");
        }
    }
}