package layoutsample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class LayoutSample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override

    public void start(Stage primaryStage){
//        Hier werden 2 Buttons definiert
        Button btn = new Button();
        btn.setText("B1");
        btn.setPrefWidth(100);
        Button btn2 = new Button();
        btn2.setText("B2");
        btn2.setPrefWidth(100);
        Button btn3 = new Button();
        btn3.setText("B3");
        btn3.setPrefWidth(100);
        Button btn4 = new Button();
        btn4.setText("B4");
        btn4.setPrefWidth(100);
        Button btn5 = new Button();
        btn5.setText("B5");
        btn5.setPrefWidth(100);
        Button btn6 = new Button();
        btn6.setText("B6");
        btn6.setPrefWidth(100);
        Button btn7 = new Button();
        btn7.setText("B7");
        Button btn8 = new Button();
        btn8.setText("B8");
        Button btn9 = new Button();
        btn9.setText("B9");
        btn7.setPrefHeight(100);
        Button btn11 = new Button();
        btn11.setText("B11");
        btn11.setPrefWidth(300);
        Button btn12 = new Button();
        btn12.setText("B12");
        btn12.setPrefWidth(300);
        Button btn10 = new Button();
        btn10.setText("B10");
        btn10.setPrefWidth(300);
//        StackPane root = new StackPane();
//        root.getChildren().add(btn);
//      Dieses Objekt wird erzeugt, um später die jeweiligen Buttons in der hbox zu positionieren.
        BorderPane borderpane = new BorderPane();

        GridPane gridPane = new GridPane();

//      hbox enthält die beiden Buttons.
//        HBox hbox = new HBox();
        /*hbox.getChildren().add(btn);
        hbox.getChildren().add(btn2);*/
        gridPane.add(btn,0,0);
        gridPane.add(btn2,1,0);
        gridPane.add(btn3,2,0);
        gridPane.add(btn4,0,1);
        gridPane.add(btn5,1,1);
        gridPane.add(btn6,2,1);

        HBox hbox = new HBox();
        hbox.getChildren().add(gridPane);
        borderpane.setTop(hbox);

        HBox hbox4 = new HBox();
        hbox4.getChildren().add(btn8);
        hbox4.getChildren().add(btn9);
        hbox4.setPadding(new Insets(10, 10, 10, 100));
        hbox4.setSpacing(10);
        borderpane.setCenter(hbox4);

        VBox vbox = new VBox();
        vbox.setPadding(new Insets(0,0,0,0));
        vbox.getChildren().add(btn7);
        borderpane.setLeft(vbox);



        GridPane gridPane2 = new GridPane();

        ColumnConstraints col= new ColumnConstraints();
        col.setPercentWidth(50);
        gridPane2.getColumnConstraints().add(col);
        gridPane2.getColumnConstraints().add(col);
        gridPane2.add(btn11,0,0);
        gridPane2.add(btn12,1,0);

        HBox hbox3 = new HBox();
        hbox3.getChildren().add(btn10);

        VBox vbox2 = new VBox();
        vbox2.getChildren().add(gridPane2);
        vbox2.getChildren().add(hbox3);
        borderpane.setBottom(vbox2);

        /*borderpane.setLeft(btn);
        borderpane.setCenter(btn2);*/


//      Mit Scene bezeichnet man das ganze.
        Scene scene = new Scene(borderpane, 300, 250);

        primaryStage.setTitle("Aufgabe Layout");
        primaryStage.setScene(scene);
//      Show ist wichtig um letztlich das ganze anzuzeigen.
        primaryStage.show();
    }


}
