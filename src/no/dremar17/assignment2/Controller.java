package no.dremar17.assignment2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;


public class Controller {
    @FXML
    private TextField answer;
    @FXML
    private ImageView imageView;
    @FXML
    private Text country, congratulation;
    @FXML
    private Button submitButton;
    @FXML
    private Circle circle1, circle2, circle3, circle4, circle5;
    @FXML
    private Rectangle bg;

    private int stage;




    @FXML
    private void submitAction(ActionEvent event) {
        country.setText(countryCheck());
        Image image = new Image(imageCheck());
        if(answer.getText().toLowerCase().equals(capitalCheck())) {
            imageView.setImage(image);
            System.out.println("Correct answer!");

            switch (stage) {
                case 0:
                    circle1.setFill(Color.GREEN);
                    break;
                case 1:
                    circle2.setFill(Color.GREEN);
                    break;
                case 2:
                    circle3.setFill(Color.GREEN);
                    break;
                case 3:
                    circle4.setFill(Color.GREEN);
                    break;
                case 4:
                    circle5.setFill(Color.GREEN);
                    break;
                case 5:
                    circle2.setFill(Color.GREEN);
                    break;
            }



        }

        else {
            imageView.setImage(image);
            System.out.println("Wrong Answer, correct answer is " + capitalCheck());
            switch (stage) {
                case 0:
                    circle1.setFill(Color.RED);
                    break;
                case 1:
                    circle2.setFill(Color.RED);
                    break;
                case 2:
                    circle3.setFill(Color.RED);
                    break;
                case 3:
                    circle4.setFill(Color.RED);
                    break;
                case 4:
                    circle5.setFill(Color.RED);
                    break;
                case 5:
                    circle5.setFill(Color.RED);
                    break;
            }
        }
        stage++;
        if(stage > 4) {
            congratulation.setText("Congratulations, you have completed the quiz!");
            submitButton.setDisable(true);
        }
        answer.setText("");
    }

    public String imageCheck() {
        String imageURL;
        Stop[] belgium = new Stop[] { new Stop(0, Color.BLACK), new Stop(1, Color.YELLOW), new Stop(2, Color.RED)};
        Stop[] canada = new Stop[] { new Stop(0, Color.BLACK), new Stop(1, Color.RED)};
        Stop[] china = new Stop[] { new Stop(0, Color.BLACK), new Stop(1, Color.RED)};
        Stop[] uk = new Stop[] { new Stop(0, Color.BLACK), new Stop(1, Color.RED)};


        switch (stage) {
            case 0:
                imageURL = "no/dremar17/assignment2/images/belgium.png";
                LinearGradient lg1 = new LinearGradient(125, 0, 225, 0, false, CycleMethod.NO_CYCLE, belgium);
                bg.setFill(lg1);
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

    public String countryCheck() {
        String country;

        switch (stage) {
            case 0:
                country = "Belgium?";
                break;
            case 1:
                country = "Canada?";
                break;
            case 2:
                country = "China?";
                break;
            case 3:
                country = "United Kingdom?";
                break;
            case 4:
                country = "United Kingdom?";
                break;
            default:
                country = "error";
                break;
        }
        return country;
    }

}
