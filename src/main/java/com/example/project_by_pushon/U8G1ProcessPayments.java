package com.example.project_by_pushon;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class U8G1ProcessPayments {

    @FXML
    private ComboBox<String> pendingRequestsCB;

    @FXML
    private Label notificationLabel;

    private ObservableList<Payment> pendingPayments;

    @FXML
    public void initialize() {
        loadPendingRequests();
    }

    private void loadPendingRequests() {
        pendingPayments = FXCollections.observableArrayList(
                new Payment("PAY-003", "Staging Solutions", 2500.50, "2024-08-17", "Pending"),
                new Payment("PAY-005", "Security Team LLC", 3200.00, "2024-08-19", "Pending")
        );

        ObservableList<String> requestStrings = FXCollections.observableArrayList();
        for (Payment payment : pendingPayments) {
            requestStrings.add(payment.getPaymentId() + " - " + payment.getVendorName() + " ($" + payment.getAmount() + ")");
        }
        pendingRequestsCB.setItems(requestStrings);
    }

    @FXML
    private void viewDownloadONA() {
        if (pendingRequestsCB.getValue() != null) {
            notificationLabel.setText("Documents opened for: " + pendingRequestsCB.getValue());
        } else {
            notificationLabel.setText("Please select a pending request first.");
        }
    }

    @FXML
    private void initiatePaymentONA() {
        if (pendingRequestsCB.getValue() != null) {
            notificationLabel.setText("Payment initiated for: " + pendingRequestsCB.getValue());
        } else {
            notificationLabel.setText("Please select a pending request first.");
        }
    }

    @FXML
    private void markCompleteIONA() {
        if (pendingRequestsCB.getValue() != null) {
            notificationLabel.setText("Payment marked as complete: " + pendingRequestsCB.getValue());
            pendingRequestsCB.getItems().remove(pendingRequestsCB.getValue());
            pendingRequestsCB.setValue(null);
        } else {
            notificationLabel.setText("Please select a pending request first.");
        }
    }
}