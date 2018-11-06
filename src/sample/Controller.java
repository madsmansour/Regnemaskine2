package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Controller {

    ArrayList<String> numbersArray = new ArrayList<String>();

    int resultat;

    @FXML
    public TextField talDisplay;

    public void plusMetode(ActionEvent actionEvent) {
        String s = talDisplay.getText();
        System.out.println(s + " er nu tilføjet");
        numbersArray.add(s);
        talDisplay.clear();
    }

    public void equalsMetode(ActionEvent actionEvent) {
        String s = talDisplay.getText();
        System.out.println(s + " er nu tilføjet");

        //
        numbersArray.add(s);

        // visker talfæltet rent
        talDisplay.clear();

        // ligger alle tal sammen i arrayet
        for (String number: numbersArray) {
            System.out.println(number);
            resultat += Integer.parseInt(number);

        }

        // sætter resultatet i displayet
        talDisplay.setText(Integer.toString(resultat));
        {

        }

    }

    public void statusMetode(ActionEvent actionEvent) {
        System.out.println("Du er fucking awesome!");
    }
}