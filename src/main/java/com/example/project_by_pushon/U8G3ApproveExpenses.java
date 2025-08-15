package com.example.project_by_pushon;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class U8G3ApproveExpenses {

    @FXML
    private ComboBox<String> requestsCB;

    @FXML
    private Label notificationLabel;

    private ObservableList<Expense> pendingExpenses;

    @FXML
    public void initialize() {
        loadPendingRequests();
    }

    private void loadPendingRequests() {
        pendingExpenses = FXCollections.observableArrayList(
                new Expense("EXP-101", "Alice Johnson", "Catering Supplies", 350.00, "2024-08-10", "Pending"),
                new Expense("EXP-103", "Charlie Brown", "Marketing Materials", 520.00, "2024-08-11", "Pending"),
                new Expense("EXP-105", "Ethan Hunt", "Audio Equipment Rental", 1200.00, "2024-08-13", "Pending")
        );

        ObservableList<String> requestStrings = FXCollections.observableArrayList();
        for (Expense expense : pendingExpenses) {
            requestStrings.add(expense.getExpenseId() + " - " + expense.getSubmittedBy() + " ($" + expense.getAmount() + ")");
        }
        requestsCB.setItems(requestStrings);
    }

    @FXML
    private void viewBillONA() {
        if (requestsCB.getValue() != null) {
            notificationLabel.setText("Bill/Invoice opened for: " + requestsCB.getValue());
        } else {
            notificationLabel.setText("Please select a pending request first.");
        }
    }

    @FXML
    private void approveExpenseONA() {
        if (requestsCB.getValue() != null) {
            notificationLabel.setText("Expense approved: " + requestsCB.getValue());
            requestsCB.getItems().remove(requestsCB.getValue());
            requestsCB.setValue(null);
        } else {
            notificationLabel.setText("Please select a pending request first.");
        }
    }

    @FXML
    private void rejectExpenseONA() {
        if (requestsCB.getValue() != null) {
            notificationLabel.setText("Expense rejected: " + requestsCB.getValue());
            requestsCB.getItems().remove(requestsCB.getValue());
            requestsCB.setValue(null);
        } else {
            notificationLabel.setText("Please select a pending request first.");
        }
    }
}