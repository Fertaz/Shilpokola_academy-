package com.example.project_by_pushon;

        import javafx.collections.FXCollections;
        import javafx.collections.ObservableList;
        import javafx.fxml.FXML;
        import javafx.scene.control.ComboBox;
        import javafx.scene.control.Label;
        import javafx.scene.control.TextField;

        public class U8G5TicketRevenue {

            @FXML
            private ComboBox<String> eventCB;

            @FXML
            private TextField revenueTF;

            @FXML
            private Label notificationLabel;

            private ObservableList<TicketSale> ticketSales;

            @FXML
            public void initialize() {
                loadEvents();
                loadSampleData();
            }

            private void loadEvents() {
                ObservableList<String> events = FXCollections.observableArrayList(
                        "Summer Music Festival 2024",
                        "Corporate Annual Meeting",
                        "Tech Conference 2024",
                        "Sports Championship Finals",
                        "Holiday Celebration Event"
                );
                eventCB.setItems(events);
            }

            private void loadSampleData() {
                ticketSales = FXCollections.observableArrayList(
                        new TicketSale("SALE-001", "General Admission", 2, 75.00, "2024-08-01"),
                        new TicketSale("SALE-002", "VIP", 1, 250.00, "2024-08-02"),
                        new TicketSale("SALE-003", "General Admission", 4, 75.00, "2024-08-03"),
                        new TicketSale("SALE-004", "Early Bird", 2, 60.00, "2024-07-15"),
                        new TicketSale("SALE-005", "VIP", 2, 250.00, "2024-08-05")
                );
            }

            @FXML
            private void viewRevenueONA() {
                if (eventCB.getValue() != null) {
                    double totalRevenue = ticketSales.stream()
                            .mapToDouble(TicketSale::getTotalRevenue)
                            .sum();
                    revenueTF.setText(String.format("$%.2f", totalRevenue));
                    notificationLabel.setText("Revenue calculated for: " + eventCB.getValue());
                } else {
                    notificationLabel.setText("Please select an event first.");
                }
            }

            @FXML
            private void exportDataONA() {
                if (eventCB.getValue() != null && !revenueTF.getText().isEmpty()) {
                    notificationLabel.setText("Revenue data exported for: " + eventCB.getValue());
                } else {
                    notificationLabel.setText("Please view revenue data first.");
                }
            }
        }