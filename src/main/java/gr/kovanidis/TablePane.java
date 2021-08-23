package gr.kovanidis;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TablePane {


    public static Pane getTablePane(Stage stage){
        Pane borderPane = new Pane();


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
                    TableView tableView = new TableView(finalI);
                    System.out.println(finalI);
                    try {
                        tableView.start(stage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            dragButton.drag(button);
            tables.add(button);
        }

        borderPane.getChildren().addAll(tables);

        return borderPane;
    }

}
