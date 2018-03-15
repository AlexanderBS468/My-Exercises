package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;

public class Controller {
    @FXML
    TextArea textArea;
    @FXML
    TextField textField;

    public void btnExit(javafx.event.ActionEvent actionEvent) {
        System.exit(0);
    }

    public void btnSubmit(javafx.event.ActionEvent actionEvent) {
        textArea.insertText(0, textField.getText() + "\n");
    }
}
