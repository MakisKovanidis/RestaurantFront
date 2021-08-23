package gr.kovanidis.controllers;

import gr.kovanidis.DragButton;
import gr.kovanidis.TableView;
import gr.kovanidis.UserDataHolder;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class mainViewController implements Initializable {

    @FXML
    AnchorPane tablePane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {


        List<Button> tables = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            DragButton dragButton = new DragButton();
            Button button = new Button();
            button.setText(String.valueOf(i));
            button.setStyle("-fx-font-size: 30");
            button.setLayoutX(100*i);
            int finalI = i;
            button.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    event.consume();
                    System.out.println(finalI);
                    try {
                        showTableDetails();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            dragButton.drag(button);
            tables.add(button);
        }

        tablePane.getChildren().addAll(tables);

    }


    private void showTableDetails() throws Exception{
        UserDataHolder holder = UserDataHolder.getInstance();
        holder.setTableId(1);
        System.out.println("pass mainView");
        Parent tableView = FXMLLoader.load(getClass().getResource("/ui/tableView.fxml"));


        Stage window = (Stage)  tablePane.getScene().getWindow();
        window.setScene(new Scene(tableView));
    }
}
