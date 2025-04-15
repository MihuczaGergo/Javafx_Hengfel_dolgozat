/*
* File: primaryController.java
* Author: Mihucza Gergő
* Copyright: 2025, Mihucza Gergő
* Group: Szoft II-2-N
* Date: 2021-04-14
* Github: https://github.com/MihuczaGergo/
* Licenc: MIT
*/

package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class primaryController {

    @FXML
    private TextField lengthField;

    @FXML
    private TextField radiusField;

    @FXML
    private ListView<String> resultList;

    @FXML
    private TextField surfaceField;

    @FXML
    void initialize() {
        System.out.println("Kezdés...");
    }


    @FXML
    void onClickCalcButton(ActionEvent event) {
        startCalc();
    }

    @FXML
    void onClickNameButton(ActionEvent event) throws IOException {
        App.setRoot("secondary");

    }
    @FXML
    void onClickCloseButton(ActionEvent event) {
        System.out.println("Bezárás...");
        Store.saveResults(resultList.getItems().toString());
        ((javafx.stage.Stage) App._stage).close();
    }

    void startCalc() {
        Double length = Double.parseDouble(lengthField.getText());
        Double radius = Double.parseDouble(radiusField.getText());
        Double surface = 2*Math.PI*radius*(radius + length);
        surfaceField.setText(surface.toString());
        resultList.getItems().add(surface.toString());
    }
    
  

}
