package gr.kovanidis.controllers;

import gr.kovanidis.UserDataHolder;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class TableViewController implements Initializable {

    private ObservableList<String> items = FXCollections.observableArrayList();

    @FXML
    private ListView myList;

    @FXML
    private Label labelTest;

    @FXML
    private void deleteElementFromList(ActionEvent event){

        event.consume();

        System.out.println("Hello, World!");
        List<String> removed = myList.getSelectionModel().getSelectedItems();

        for(String s : removed){
            System.out.println(s);

        }
        items.removeAll(removed);
    }

    @FXML
    private void addElement(ActionEvent event){
        event.consume();

        System.out.println("Add same selected items");

        List<String> add = myList.getSelectionModel().getSelectedItems();


        for(String s : add){
            System.out.println(s);
            items.add(s);
        }
    }




    @Override
    public void initialize(URL url, ResourceBundle rb) {
        myList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        myList.setItems(items);
        items.add("First task");
        items.add("Second task");
        items.add("third task");
        items.add("fourth task");
        items.add("fifth task");


        UserDataHolder holder = UserDataHolder.getInstance();
        System.out.println(holder.getTableId().toString());
        labelTest.setText(holder.getTableId().toString());


    }
}
