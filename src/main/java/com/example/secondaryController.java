/*
* File: secondaryController.java
* Author: Mihucza Gergő
* Copyright: 2025, Mihucza Gergő
* Group: Szoft II-2-N
* Date: 2021-04-14
* Github: https://github.com/MihuczaGergo/
* Licenc: MIT
*/

package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;


import java.io.IOException;

public class secondaryController {

    @FXML
    void onClickBackButton(ActionEvent event) throws IOException {
        App.setRoot("primary");
    }

}
