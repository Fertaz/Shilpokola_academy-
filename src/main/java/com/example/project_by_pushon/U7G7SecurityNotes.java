package com.example.project_by_pushon;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class U7G7SecurityNotes {

    @FXML
    private TextArea securityTA;

    @FXML
    private TextField acknowledgmentTF;

    @FXML
    void sendToSecurityTeamONA(ActionEvent event) {
        String securityRequirements = securityTA.getText();

        if (!securityRequirements.isEmpty()) {
            acknowledgmentTF.setText("Security team notified: " + securityRequirements.substring(0, Math.min(30, securityRequirements.length())) + "...");
            securityTA.clear();
        } else {
            acknowledgmentTF.setText("Please enter security requirements first.");
        }
    }
}