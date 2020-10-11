package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    public static Show head = null;
    public static Show booking = null;
    public static Stage primaryStage;



    @Override
    public void start(Stage ps) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        primaryStage = ps;
        primaryStage.setTitle(" Westend Theatre");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();



    }



    public static void main(String[] args) {
        launch(args);
    }

    public static Show findShow(int index){
     Show temp = head;
     for(int i = 0;i<index;i++){
         temp = temp.next;
     }
     return temp;
    }

}

