package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

import javax.xml.soap.Text;

public class Controller {
    @FXML
    private TextField answer;
    private ProgressBar progressBar;
    private Text counter;
    private Text description;

    public void pressButton(ActionEvent event) {
        System.out.println("Hello");
    }

    @FXML
    private void print(ActionEvent event) {
        System.out.println(answer.getText().toLowerCase());
    }
}
