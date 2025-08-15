package com.example.project_by_pushon;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class U8G8BudgetQueryResponse {

    @FXML
    private TextArea queryTA;

    @FXML
    private TextArea responseTA;

    @FXML
    private Label confirmationLabel;

    private ObservableList<BudgetQueryResponse> budgetQueries;

    @FXML
    public void initialize() {
        loadSampleData();
        loadSampleQuery();
    }

    private void loadSampleData() {
        budgetQueries = FXCollections.observableArrayList(
                new BudgetQueryResponse("Q001", "Catering Budget", "$5,000 remaining from $15,000 total.", "Alice Johnson", "2024-08-14"),
                new BudgetQueryResponse("Q002", "Security Staffing Costs", "Total cost: $12,500 for 25 staff.", "Finance Dept.", "2024-08-15"),
                new BudgetQueryResponse("Q003", "Marketing Spend", "$1,200 over budget.", "Charlie Brown", "2024-08-15"),
                new BudgetQueryResponse("Q004", "Venue Rental Balance", "Final payment of $7,500 due.", "Finance Dept.", "2024-08-16")
        );
    }

    private void loadSampleQuery() {
        queryTA.setText("What is the current status of the catering budget for the Summer Music Festival 2024? Please provide remaining balance and any pending expenses.");
    }

    @FXML
    private void sendResponseONA() {
        if (!responseTA.getText().trim().isEmpty()) {
            confirmationLabel.setText("Response sent successfully. Query ID: Q00" + (budgetQueries.size() + 1));
            responseTA.clear();
        } else {
            confirmationLabel.setText("Please enter a response before sending.");
        }
    }
}