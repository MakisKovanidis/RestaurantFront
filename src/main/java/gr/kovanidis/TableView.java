package gr.kovanidis;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TableView extends Application {

    private Integer tableId;

    public TableView(Integer tableId) {
        this.tableId = tableId;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent tableView = FXMLLoader.load(getClass().getResource("/ui/tableView.fxml"));
        Scene tableScene = new Scene(tableView);

        primaryStage.setScene(tableScene);
        primaryStage.setFullScreen(true);
    }
}
