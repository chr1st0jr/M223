package Ticketkauf;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.ComboBoxListCell;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.time.LocalDate;


// Driver Code
public class Starter extends Application {

    private Spinner<Integer> anzahl;
    private final Double preis = 200.00;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {


        GridPane gridPane = new GridPane();

        gridPane.add(new Label("Name"), 0, 0);

        TextField name = new TextField();
        gridPane.add(name, 1, 0);

//        gridPane.add(new TextField(""), 1,0);
        gridPane.add(new Label("Vorname"), 0, 1);

        TextField vorname = new TextField();
        gridPane.add(vorname, 1, 1);

        gridPane.add(new Label("Geburtsdatum"), 0, 2);

        DatePicker datepicker = new DatePicker();
        gridPane.add(datepicker, 1, 2);
        gridPane.add(new Label("Volljährig"), 0, 3);

        ToggleGroup group = new ToggleGroup();
        RadioButton button1 = new RadioButton("Ja");
        button1.setToggleGroup(group);
        button1.setSelected(true);
        RadioButton button2 = new RadioButton("Nein");
        button2.setToggleGroup(group);

        HBox hbox = new HBox(4, button1, button2);
        gridPane.setConstraints(hbox, 1, 3);
        gridPane.getChildren().add(hbox);

        gridPane.add(new Label("Anzahl"), 0, 4);
        anzahl = new Spinner<Integer>(0, 100, 0);
        gridPane.setConstraints(anzahl, 1, 4);
        gridPane.getChildren().add(anzahl);

        gridPane.add(new Label("Event"), 0, 5);
        ListView<String> list = new ListView<String>();
        list.setPrefSize(200, 250);
        list.setEditable(true);
        ObservableList<String> items = FXCollections.observableArrayList(
                "A = Kino", "B = Degustation", "C = Tanz", "D = Comedy Show");
        list.setItems(items);
        list.setCellFactory(ComboBoxListCell.forListView(items));
        gridPane.setConstraints(list, 1, 5);
        gridPane.getChildren().add(list);

        /*gridPane.add(new Label("Preis"), 0,5);
        preis = new Spinner<Double>(0, 100,0);
        gridPane.setConstraints(preis, 1, 5);
        gridPane.getChildren().add(preis);*/


        Button submit = new Button("Send");
        submit.setOnAction(new EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                int pID = 0;
                String lastname = name.getText();
                String firstname = vorname.getText();
                LocalDate bday = datepicker.getValue();
                boolean volljaehrig = true;
                if (!button1.isSelected())
                    volljaehrig = false;
                Integer anz = anzahl.getValue();
                Double price = anzahl.getValue() * preis;


                Person person = new Person();

                System.out.println(person.getID());
                System.out.println(person.getName());
                System.out.println(person.getVorname());
                System.out.println(person.getGeburtsdatum());
                System.out.println(person.getVolljährig());
                System.out.println(person.getAnzahl());
                System.out.println(person.getPreis());

            }
        });
        gridPane.add(submit, 1, 10);

        gridPane.setPadding(new Insets(20, 20 , 20 ,20));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
       /* BorderPane border = new BorderPane();


        AnchorPane anchorPane = new AnchorPane();
        Button ok = new Button();
        Button abbrechen = new Button();
        anchorPane.setLeftAnchor(ok, 10.0);
        anchorPane.setRightAnchor(abbrechen, 10.0);
        border.getChildren().add(anchorPane);*/




        Scene scene = new Scene(gridPane, 300, 300);

        primaryStage.setTitle("Ticket");
        primaryStage.setScene(scene);
//      Show ist wichtig um letztlich das ganze anzuzeigen.
        primaryStage.show();
    }

}

