package gr.kovanidis;

import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class DragButton {

    private Button button;

    public DragButton() {
        this.button = new Button();
    }

    public Button drag(Button button){

    final Delta dragDelta = new Delta();

    this.button.setOnMousePressed(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent mouseEvent) {
            // record a delta distance for the drag and drop operation.
            dragDelta.x = button.getLayoutX() - mouseEvent.getSceneX();
            dragDelta.y = button.getLayoutY() - mouseEvent.getSceneY();
            button.setCursor(Cursor.MOVE);
        }
    });
        button.setOnMouseReleased(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent mouseEvent) {
            button.setCursor(Cursor.HAND);
        }
    });
        button.setOnMouseDragged(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent mouseEvent) {
            button.setLayoutX(mouseEvent.getSceneX() + dragDelta.x);
            button.setLayoutY(mouseEvent.getSceneY() + dragDelta.y);
        }
    });
        button.setOnMouseEntered(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent mouseEvent) {
            button.setCursor(Cursor.HAND);
        }
    });

        return this.button;

}

// records relative x and y co-ordinates.
class Delta {
    double x, y;
}
}
