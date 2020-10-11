package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

import java.io.IOException;

import static sample.Main.*;

public class showController {
    @FXML
    TextField sName;
    @FXML
     Slider runningTime;
    @FXML
    DatePicker start,end;

    Parent root = null;

    public void addShow(){
        Show newShow = new Show(sName.getText(),(int)runningTime.getValue(),start.getValue().toString(),end.getValue().toString());
        newShow.next = Main.head;
        Main.head= newShow;

        System.out.println(head.toString());

    }

    public void openMain(ActionEvent actionEvent) {
        try {
            root = FXMLLoader.load(getClass().getResource("Main.fxml"));

            primaryStage.setTitle("west end theatre");
            primaryStage.setScene(new Scene(root));
        }
        catch (IOException el){}
    }
}
