package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;


import java.io.IOException;

import static sample.Main.*;

public class performanceController {

    @FXML
    CheckBox M,E;
    @FXML
    DatePicker date;

@FXML
    ChoiceBox chShow;
    Parent root = null;


    public void addPerformance(){
        Show theShow = findShow(chShow.getSelectionModel().getSelectedIndex());
        if (M.isSelected()){
            Performance newPerformance = new Performance(500,date.getValue().toString());
            theShow.addPerformance(newPerformance);
        }
        if (E.isSelected()){
            Performance newPerformance = new Performance(900,date.getValue().toString());
            theShow.addPerformance(newPerformance);
        }
        System.out.println(theShow.head);

    }


    public void initialize(){
        Show temp = head;
        while (temp!=null){
            chShow.getItems().add(temp.getShowName());
            temp = temp.next;
        }
    }
    public void openMain(ActionEvent actionEvent) {
        try {
            root = FXMLLoader.load(getClass().getResource("Main.fxml"));

            primaryStage.setTitle("The Westend theatre");
            primaryStage.setScene(new Scene(root));
        }
        catch (IOException el){}
    }
}
