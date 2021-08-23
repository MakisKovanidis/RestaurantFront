package gr.kovanidis;

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
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/ui/launchView.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setFullScreen(true);
        primaryStage.setScene(new Scene(root));
        //primaryStage.setScene(new Scene(ArithmeticKeyboard.display()));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    public FlowPane addFlowPane(Stage stage) throws IOException {

        FlowPane flow = new FlowPane();
        flow.setPadding(new Insets(5, 0, 5, 0));
        flow.setAlignment(Pos.CENTER);
        flow.setVgap(20);
        flow.setHgap(20);
        //flow.setStyle("-fx-background-color: DAE6F3;");

        List<Button> buttonList = new ArrayList<>();

        Button posButton = new Button();
        posButton.setGraphic(new ImageView(new Image("icons/PosIcon128.png")));
        posButton.setOnAction(event -> {
                    int width = (int) Screen.getPrimary().getBounds().getWidth();
                    int height = (int) Screen.getPrimary().getBounds().getHeight();

                      stage.setScene(new Scene(TablePane.getTablePane(stage),width,height));

        }
        );

        Button chartButton = new Button();

        chartButton.setGraphic(new ImageView(new Image("icons/ChartIcon2-128.png")));
        chartButton.setOnAction(event -> {
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("/ui/tableView.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            int width = (int) Screen.getPrimary().getBounds().getWidth();
            int height = (int) Screen.getPrimary().getBounds().getHeight();

            stage.setScene(new Scene(root,width,height));
        });



        Button settingsButton = new Button();
        settingsButton.setGraphic(new ImageView(new Image("icons/SettingsIcon128.png")));


        Button exitButton = new Button();
        exitButton.setGraphic(new ImageView(new Image("icons/ExitIcon128.png")));



        buttonList.add(posButton);
        buttonList.add(chartButton);
        buttonList.add(settingsButton);
        buttonList.add(exitButton);
        flow.getChildren().addAll(buttonList);

        return flow;
    }
}
