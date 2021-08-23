package gr.kovanidis.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class LaunchViewController implements Initializable {

    @FXML
    ImageView Pos;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void beginPos(ActionEvent event) throws Exception{

        event.consume();
        Parent tableView = FXMLLoader.load(getClass().getResource("/ui/mainView.fxml"));

        Stage window = (Stage) Pos.getScene().getWindow();
        window.setScene(new Scene(tableView));


    }
}
