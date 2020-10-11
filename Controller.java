package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

import static sample.Main.*;
public class Controller {
    Parent root = null;

    public void openPerformance(javafx.event.ActionEvent actionEvent) {
        try {
            root = FXMLLoader.load(getClass().getResource("Performance.fxml"));

            primaryStage.setTitle("west end theatre");
            primaryStage.setScene(new Scene(root));
        }
        catch (IOException el){}


    }


    public void openShow(ActionEvent actionEvent) {
        try {
            root = FXMLLoader.load(getClass().getResource("Show.fxml"));

            primaryStage.setTitle("west end theatre");
            primaryStage.setScene(new Scene(root));
        }
        catch (IOException el){}
    }

    public void openBooking(ActionEvent actionEvent) {
        try {
            root = FXMLLoader.load(getClass().getResource("Book.fxml"));

            primaryStage.setTitle("west end theatre");
            primaryStage.setScene(new Scene(root));
        }
        catch (IOException el){}
    }
}
