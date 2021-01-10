package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setFullScreen(true);
        primaryStage.setScene(new Scene(addFlowPane(), 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    public FlowPane addFlowPane() {

        FlowPane flow = new FlowPane();
        flow.setPadding(new Insets(5, 0, 5, 0));
        flow.setAlignment(Pos.CENTER);
        flow.setVgap(10);
        flow.setHgap(10);
        flow.setStyle("-fx-background-color: DAE6F3;");

        List<Button> buttonList = new ArrayList<>();

        Button posButton = new Button();
        posButton.setGraphic(new ImageView(new Image("resources/icons/PosIcon128.png")));

        Button chartButton = new Button();
        chartButton.setGraphic(new ImageView(new Image("resources/icons/ChartIcon2-128.png")));


        Button settingsButton = new Button();
        settingsButton.setGraphic(new ImageView(new Image("resources/icons/SettingsIcon128.png")));


        Button exitButton = new Button();
        exitButton.setGraphic(new ImageView(new Image("resources/icons/ExitIcon128.png")));



        buttonList.add(posButton);
        buttonList.add(chartButton);
        buttonList.add(settingsButton);
        buttonList.add(exitButton);
        flow.getChildren().addAll(buttonList);

        return flow;
    }
}
