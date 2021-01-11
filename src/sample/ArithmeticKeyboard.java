package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class ArithmeticKeyboard {

    public static GridPane display(){
        GridPane keyboard = new GridPane();
        keyboard.setAlignment(Pos.CENTER);
        keyboard.setPadding(new Insets(20,20,20,20));
        keyboard.setVgap(8);
        keyboard.setHgap(8);

        Button oneButton = new Button("1");
        oneButton.setStyle("-fx-font-size: 30");

        Button twoButton = new Button("2");
        twoButton.setStyle("-fx-font-size: 30");

        Button theeButton = new Button("3");
        theeButton.setStyle("-fx-font-size: 30");

        Button fourButton = new Button("4");
        fourButton.setStyle("-fx-font-size: 30");

        Button fiveButton = new Button("5");
        fiveButton.setStyle("-fx-font-size: 30");

        Button sixButton = new Button("6");
        sixButton.setStyle("-fx-font-size: 30");

        Button sevenButton = new Button("7");
        sevenButton.setStyle("-fx-font-size: 30");

        Button eightButton = new Button("8");
        eightButton.setStyle("-fx-font-size: 30");

        Button nineButton = new Button("9");
        nineButton.setStyle("-fx-font-size: 30");

        Button zeroButton = new Button("0");
        zeroButton.setStyle("-fx-font-size: 30");


        keyboard.add(sevenButton,0, 0);
        keyboard.add(eightButton,1,0);
        keyboard.add(nineButton,2,0);
        keyboard.add(fourButton,0,1);
        keyboard.add(fiveButton,1,1);
        keyboard.add(sixButton,2,1);
        keyboard.add(oneButton,0,2);
        keyboard.add(twoButton,1,2);
        keyboard.add(theeButton,2,2);
        keyboard.add(zeroButton,0, 3,2,1);

        return keyboard;


    }


}
