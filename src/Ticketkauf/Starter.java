package Ticketkauf;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;



// Driver Code
public class Starter extends Application {

    private Spinner<Integer> anzahl;
    private Double preis;

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){


        GridPane gridPane = new GridPane();
        gridPane.add(new Label("Name"), 0,0);
        gridPane.add(new TextField(""), 1,0);
        gridPane.add(new Label("Vorname"), 0,1);
        gridPane.add(new TextField(""), 1,1);
        gridPane.add(new Label("Geburtsdatum"), 0,2);
        gridPane.add(new DatePicker(),1,2);
        gridPane.add(new Label("Volljährig"), 0,3);

        ToggleGroup group = new ToggleGroup();
        RadioButton button1 = new RadioButton("Ja");
        button1.setToggleGroup(group);
        button1.setSelected(true);
        RadioButton button2 = new RadioButton("Nein");
        button2.setToggleGroup(group);

        HBox hbox = new HBox(4,button1,button2);
        gridPane.setConstraints(hbox,1,3);
        gridPane.getChildren().add(hbox);

        gridPane.add(new Label("Anzahl"), 0,4);
        anzahl = new Spinner<Integer>(0, 100,0);
        gridPane.setConstraints(anzahl, 1, 4);
        gridPane.getChildren().add(anzahl);
        gridPane.add(new Label("Preis"), 0,5);
        double value = (Integer) anzahl.getValue();
        preis = value * 20.00;





        gridPane.setPadding(new Insets(20, 20 , 20 ,20));
        gridPane.setVgap(10);
        gridPane.setHgap(10);



        BorderPane borderPane = new BorderPane();


        Scene scene = new Scene(gridPane, 300, 250);

        primaryStage.setTitle("Ticket");
        primaryStage.setScene(scene);
//      Show ist wichtig um letztlich das ganze anzuzeigen.
        primaryStage.show();
    }
}

