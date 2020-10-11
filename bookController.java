package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;

import java.io.IOException;
import static sample.Main.*;

public class bookController {
    @FXML
    TextField cName;

    @FXML
    ComboBox showName;
    @FXML
    ComboBox performanceName;





    public void initialize(){
        Show temp = head;
        while (temp!=null){
            showName.getItems().add(temp.getShowName());

            temp = temp.next;
        }
    }
public void loadPerformance() {
    Show theShow = findShow(showName.getSelectionModel().getSelectedIndex());
    Performance p = theShow.head;
    while (p != null ) { performanceName.getItems().add(p.getDate() + " - " + p.getTime());

    }

}


    Parent root = null;
    public void openMain(ActionEvent actionEvent) {
        try {
            root = FXMLLoader.load(getClass().getResource("Main.fxml"));

            primaryStage.setTitle("west end theatre");
            primaryStage.setScene(new Scene(root));
        }
        catch (IOException el){}
    }
}
