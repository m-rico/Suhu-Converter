package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.fxml.Initializable;

import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class fahrenheitController implements Initializable {
    Fahrenheit fahrenheit = new Fahrenheit(0);
    Satuan satuan;

    @FXML
    private TextField dariFahrenheit;

    @FXML
    private TextField hasilUbah;

    // INI UNTUK RADIO BUTTON
    @FXML
    private RadioButton keKelvin;

    @FXML
    private RadioButton keCelcius;

    @FXML
    private RadioButton keReamur;

    private ToggleGroup satuanToggleGroup;

    @Override
    public void initialize(URL url, ResourceBundle rb){
        //INI UNTUK RADIOBUTTON
        satuanToggleGroup = new ToggleGroup();
        this.keReamur.setToggleGroup(satuanToggleGroup);
        this.keCelcius.setToggleGroup(satuanToggleGroup);
        this.keCelcius.setSelected(true);
        this.keKelvin.setToggleGroup(satuanToggleGroup);

    }

    @FXML
    public void radioUbahOnAction(ActionEvent event){
        Alert warn = new Alert(Alert.AlertType.WARNING);
        Alert ai=new Alert(Alert.AlertType.INFORMATION);
        DecimalFormat df=new DecimalFormat(".00");
        if (dariFahrenheit.getText().isEmpty()) {
            warn.setTitle("Warning");
            warn.setContentText("Harap Masukkan Data");
            warn.setHeaderText(null);
            warn.show();
        } else if (dariFahrenheit.getText().matches("^[-+]?\\d*[.]?\\d*$")) {
            if (keKelvin.isSelected()){
                fahrenheit.setNilai(Double.parseDouble(dariFahrenheit.getText()));
                hasilUbah.setText("= " + df.format( fahrenheit.keKelvin()));
            } else if (keCelcius.isSelected()){
                fahrenheit.setNilai(Double.parseDouble(dariFahrenheit.getText()));
                hasilUbah.setText("= " + df.format( fahrenheit.keCelcius()));
            } else if (keReamur.isSelected()){
                fahrenheit.setNilai(Double.parseDouble(dariFahrenheit.getText()));
                hasilUbah.setText("= " + df.format( fahrenheit.keReamur()));
            }
        } else{
            ai.setTitle("Informasi");
            ai.setContentText("Mohon beri masukan berupa angka saja \nPenulisan nilai desimal menggunakan '.' bukan ',' \nContoh : \n1 atau 1.5 \n-1 atau -1.5");
            ai.setHeaderText(null);
            ai.show();
        }
    }


    @FXML
    private void addScene(ActionEvent event)throws IOException{
        Parent view2= FXMLLoader.load(getClass().getResource("sample.fxml"));

        Scene scene2=new Scene(view2);

        Stage window = (Stage) ( (Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

}

