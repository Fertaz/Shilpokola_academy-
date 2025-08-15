package com.example.project_by_pushon;

        import javafx.collections.FXCollections;
        import javafx.collections.ObservableList;
        import javafx.fxml.FXML;
        import javafx.scene.control.Label;
        import javafx.scene.control.TextArea;

        public class U8G7ComplianceRecords {

            @FXML
            private TextArea budgetQueryArea;

            @FXML
            private TextArea responseArea;

            @FXML
            private Label confirmationLabel;

            private ObservableList<ComplianceRecord> complianceRecords;

            @FXML
            public void initialize() {
                loadSampleQueries();
                loadSampleData();
            }

            private void loadSampleQueries() {
                budgetQueryArea.setText("Provide financial compliance report for Q3 2024 including all permits and certifications.");
            }

            private void loadSampleData() {
                complianceRecords = FXCollections.observableArrayList(
                        new ComplianceRecord("PERMIT-001", "Venue Permit", "Active", "2024-01-15", "2025-01-14"),
                        new ComplianceRecord("INSP-001", "Fire Safety Inspection", "Passed", "2024-07-20", "2025-07-19"),
                        new ComplianceRecord("PERMIT-002", "Noise Permit", "Active", "2024-06-01", "2024-08-30"),
                        new ComplianceRecord("CERT-001", "Insurance Certificate", "Expired", "2023-08-01", "2024-07-31"),
                        new ComplianceRecord("INSP-002", "Health & Safety Check", "Passed", "2024-08-10", "2025-08-09")
                );
            }

            @FXML
            private void saveRecordONA() {
                if (!responseArea.getText().trim().isEmpty()) {
                    confirmationLabel.setText("Compliance record saved successfully. Document ID: CR-" + System.currentTimeMillis());
                } else {
                    confirmationLabel.setText("Please enter a response or attach a document before saving.");
                }
            }
        }