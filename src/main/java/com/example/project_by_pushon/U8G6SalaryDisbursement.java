package com.example.project_by_pushon;

        import javafx.collections.FXCollections;
        import javafx.collections.ObservableList;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.control.TableColumn;
        import javafx.scene.control.TableView;
        import javafx.scene.control.cell.PropertyValueFactory;

        public class U8G6SalaryDisbursement {

            @FXML
            private Button addPayrollBtn;

            @FXML
            private TableView<SalaryDisbursement> payrollTV;

            @FXML
            private TableColumn<SalaryDisbursement, String> staffNameTC;

            @FXML
            private TableColumn<SalaryDisbursement, String> roleTC;

            @FXML
            private TableColumn<SalaryDisbursement, Double> amountTC;

            @FXML
            private TableColumn<SalaryDisbursement, String> statusTC;

            @FXML
            private Button confirmTransferBtn;

            @FXML
            private Label notificationLabel;

            @FXML
            public void initialize() {
                staffNameTC.setCellValueFactory(new PropertyValueFactory<>("employeeName"));
                roleTC.setCellValueFactory(new PropertyValueFactory<>("employeeId"));
                amountTC.setCellValueFactory(new PropertyValueFactory<>("amount"));
                statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));

                loadSampleData();

                addPayrollBtn.setOnAction(e -> addPayroll());
                confirmTransferBtn.setOnAction(e -> confirmTransfer());
            }

            private void loadSampleData() {
                ObservableList<SalaryDisbursement> sampleSalaries = FXCollections.observableArrayList(
                        new SalaryDisbursement("EMP-001", "John Doe", 2500.00, "2024-08-31", "Paid"),
                        new SalaryDisbursement("EMP-002", "Jane Smith", 2750.00, "2024-08-31", "Paid"),
                        new SalaryDisbursement("EMP-003", "Peter Jones", 2200.50, "2024-09-15", "Scheduled"),
                        new SalaryDisbursement("EMP-004", "Mary Williams", 3100.75, "2024-08-31", "Paid"),
                        new SalaryDisbursement("EMP-005", "David Brown", 2800.00, "2024-09-15", "Scheduled")
                );
                payrollTV.setItems(sampleSalaries);
            }

            private void addPayroll() {
                notificationLabel.setText("Payroll data imported successfully.");
            }

            private void confirmTransfer() {
                notificationLabel.setText("Salary transfers confirmed and processed.");
            }
        }