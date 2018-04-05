package no.dremar17.assignment2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javax.xml.soap.Text;

public class Controller {
    @FXML
    private TextField answer;
    @FXML
    private ImageView imageView;
    private ProgressBar progressBar;
    private Text counter;
    private Text description;
    private int stage;

    public void pressButton(ActionEvent event) {
        System.out.println("Hello");
    }

    @FXML
    private void submitAction(ActionEvent event) {

        if(answer.getText().toLowerCase().equals(capitalCheck())) {
            Image image = new Image(imageCheck());
            imageView.setImage(image);
            System.out.println("Correct answer!");
            stage++;
        }
        else {
            System.out.println("Wrong Answer, correct answer is " + capitalCheck());
        }

    }

    public String imageCheck() {
        String imageURL;

        switch (stage) {
            case 0:
                imageURL = "no/dremar17/assignment2/images/belgium.png";
                break;
            case 1:
                imageURL = "no/dremar17/assignment2/images/canada.png";
                break;
            case 2:
                imageURL = "no/dremar17/assignment2/images/china.png";
                break;
            case 3:
                imageURL = "no/dremar17/assignment2/images/uk.png";
                break;
            case 4:
                imageURL = "no/dremar17/assignment2/images/uk.png";
                break;
            default:
                imageURL = "error";
                break;
        }
        return imageURL;
    }

    public String capitalCheck() {
        String capital;

        switch (stage) {
            case 0:
                capital = "canberra";
                break;
            case 1:
                capital = "brussels";
                break;
            case 2:
                capital = "ottawa";
                break;
            case 3:
                capital = "beijing";
                break;
            case 4:
                capital = "london";
                break;
            default:
                capital = "error";
                break;
        }
        return capital;
    }

}
