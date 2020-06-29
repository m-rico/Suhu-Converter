package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

import java.io.IOException;

public class Controller {

    @FXML
    private void addScene(ActionEvent event)throws IOException{
        Parent view2= FXMLLoader.load(getClass().getResource("Celcius.fxml"));
        Scene scene2=new Scene(view2);
        Stage window = (Stage) ( (Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void keKelvin(ActionEvent event)throws IOException{
        Parent view2= FXMLLoader.load(getClass().getResource("Kelvin.fxml"));
        Scene scene2=new Scene(view2);
        Stage window = (Stage) ( (Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void keFahrenheit(ActionEvent event)throws IOException{
        Parent view2= FXMLLoader.load(getClass().getResource("Fahrenheit.fxml"));
        Scene scene2=new Scene(view2);
        Stage window = (Stage) ( (Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void keReamur(ActionEvent event)throws IOException{
        Parent view2= FXMLLoader.load(getClass().getResource("Reamur.fxml"));
        Scene scene2=new Scene(view2);
        Stage window = (Stage) ( (Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }


}
