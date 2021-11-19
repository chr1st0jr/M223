package Sudoku;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class View extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane gridPane = new GridPane();

        gridPane.setPrefWidth(484);
        gridPane.setPrefHeight(484);

        gridPane.setVgap(1);
        gridPane.setHgap(1);

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6; j++) {
                Rectangle rect = new Rectangle((484 / 7), (484 / 7));
                rect.setFill(Color.DIMGRAY);
                //gridPane.add(rect, i, j);

                Circle circle = new Circle();
                circle.setRadius((490 / 8) / 2);
                circle.setFill(Color.SILVER);
                //gridPane.add(circle, i, j);

                StackPane sp = new StackPane(rect, circle);

                gridPane.add(sp, i, j);

            }
        }

        for (int i = 0; i < 7; i++) {
            Button button = new Button(Integer.toString(i + 1));
            button.setPrefWidth(490 / 7);
            button.setPrefHeight(490 / 7);
            gridPane.add(button, i, 7);

            button.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent event) {
//                    int columns = i -1
                }

            });
        }


//        Button button1 = new Button();

            Scene scene = new Scene(gridPane, 490, 490);

            primaryStage.setScene(scene);
            primaryStage.show();


    }
        public static void main(String[] args){
            launch(args);
        }

}
