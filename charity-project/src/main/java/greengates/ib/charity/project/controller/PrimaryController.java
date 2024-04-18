package greengates.ib.charity.project.controller;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

public class PrimaryController {

    @FXML
    private ChoiceBox<String> selectMonth;

    public void initialize() {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "September", "October", "November", "December"}; 

        selectMonth.getItems().addAll(months);
    }

}
