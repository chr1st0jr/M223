package calculator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javax.swing.*;


public class Taschenrechner extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        Button btn = new Button();
        btn.setText("7");
        btn.setPrefWidth(1000);
        Button btn2 = new Button();
        btn2.setText("8");
        btn2.setPrefWidth(1000);
        Button btn3 = new Button();
        btn3.setText("9");
        btn3.setPrefWidth(1000);
        Button btn4 = new Button();
        btn4.setText("/");
        btn4.setPrefWidth(1000);

        Button btn5 = new Button();
        btn5.setText("4");
        btn5.setPrefWidth(1000);
        Button btn6 = new Button();
        btn6.setText("5");
        btn6.setPrefWidth(1000);
        Button btn7 = new Button();
        btn7.setText("6");
        btn7.setPrefWidth(1000);
        Button btn8 = new Button();
        btn8.setText("X");
        btn8.setPrefWidth(1000);

        Button btn9 = new Button();
        btn9.setText("1");
        btn9.setPrefWidth(1000);
        Button btn10 = new Button();
        btn10.setText("2");
        btn10.setPrefWidth(1000);
        Button btn11 = new Button();
        btn11.setText("3");
        btn11.setPrefWidth(1000);
        Button btn12 = new Button();
        btn12.setText("-");
        btn12.setPrefWidth(1000);

        Button btn13 = new Button();
        btn13.setText("0");
        btn13.setPrefWidth(1000);
        Button btn14 = new Button();
        btn14.setText(".");
        btn14.setPrefWidth(1000);
        Button btn15 = new Button();
        btn15.setText("=");
        btn15.setPrefWidth(1000);
        Button btn16 = new Button();
        btn16.setText("+");
        btn16.setPrefWidth(1000);

        BorderPane borderPane = new BorderPane();

        JTextField textField = new JTextField();


        GridPane gridPane = new GridPane();
        ColumnConstraints col= new ColumnConstraints();
        col.setPercentWidth(25);
        gridPane.getColumnConstraints().add(col);
        gridPane.getColumnConstraints().add(col);
        gridPane.getColumnConstraints().add(col);
        gridPane.getColumnConstraints().add(col);
        gridPane.add(btn, 0,0);
        gridPane.add(btn2, 1,0);
        gridPane.add(btn3, 2,0);
        gridPane.add(btn4, 3,0);

        gridPane.add(btn5, 0,1);
        gridPane.add(btn6, 1,1);
        gridPane.add(btn7, 2,1);
        gridPane.add(btn8, 3,1);

        gridPane.add(btn9, 0,2);
        gridPane.add(btn10, 1,2);
        gridPane.add(btn11, 2,2);
        gridPane.add(btn12, 3,2);

        gridPane.add(btn13, 0,3);
        gridPane.add(btn14, 1,3);
        gridPane.add(btn15, 2,3);
        gridPane.add(btn16, 3,3);

        borderPane.setBottom(gridPane);


        //      Mit Scene bezeichnet man das ganze.
        Scene scene = new Scene(borderPane, 300, 250);

        primaryStage.setTitle("Taschenrechner");
        primaryStage.setScene(scene);
//      Show ist wichtig um letztlich das ganze anzuzeigen.
        primaryStage.show();


    }
}
