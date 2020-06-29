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
import javafx.scene.control.Alert.AlertType;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class celciusController implements Initializable {
    Celcius celcius = new Celcius(0);
    Satuan satuan;

    @FXML
    private TextField dariCelcius;

    @FXML
    private TextField hasilUbah;


    @Override
    public void initialize(URL url, ResourceBundle rb){
        //INI UNTUK RADIOBUTTON
        satuanToggleGroup = new ToggleGroup();
        this.keReamur.setToggleGroup(satuanToggleGroup);
        this.keReamur.setSelected(true);
        this.keFahrenheit.setToggleGroup(satuanToggleGroup);
        this.keKelvin.setToggleGroup(satuanToggleGroup);
    }

    // INI UNTUK RADIO BUTTON
    @FXML
    private RadioButton keKelvin;

    @FXML
    private RadioButton keFahrenheit;

    @FXML
    private RadioButton keReamur;

    private ToggleGroup satuanToggleGroup;


    @FXML
    public void radioUbahOnAction(ActionEvent event){
        Alert warn = new Alert(AlertType.WARNING);
        Alert ai=new Alert(AlertType.INFORMATION);
        DecimalFormat df=new DecimalFormat(".00");
        if (dariCelcius.getText().isEmpty()) {
            warn.setTitle("Warning");
            warn.setContentText("Harap Masukkan Data");
            warn.setHeaderText(null);
            warn.show();
        } else if (dariCelcius.getText().matches("^[-+]?\\d*[.]?\\d*$")) {
            if (keKelvin.isSelected()){
                celcius.setNilai(Double.parseDouble(dariCelcius.getText()));
                hasilUbah.setText("= " + df.format( celcius.keKelvin()));
            } else if (keFahrenheit.isSelected()){
                celcius.setNilai(Double.parseDouble(dariCelcius.getText()));
                hasilUbah.setText("= " + df.format( celcius.keFahrenheit ()));
            } else if (keReamur.isSelected()){
                celcius.setNilai(Double.parseDouble(dariCelcius.getText()));
                hasilUbah.setText("= " + df.format( celcius.keReamur()));
            }
        } else {
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

