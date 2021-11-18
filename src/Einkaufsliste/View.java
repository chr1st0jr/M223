package Einkaufsliste;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.sql.Connection;
import java.time.LocalDate;

public class View extends Application {
    private Spinner<Double> preis;
    private Spinner<Integer> menge;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane borderPane = new BorderPane();

        Scene scene = new Scene(borderPane,400,300);

        Label text = new Label("Einkaufsliste");
        borderPane.setAlignment(text, Pos.CENTER);
        borderPane.setTop(text);

        GridPane gridPane = new GridPane();
        borderPane.setCenter(gridPane);
        gridPane.setPadding(new Insets(20, 20,20,20));

        gridPane.add(new Label("Artikel"),0,0);
        TextField artikel = new TextField();
        gridPane.add(artikel,1, 0);

        gridPane.add(new Label("Preis"),0,1);
        preis = new Spinner<Double>(0.00, 100.00, 0);
        preis.setEditable(true);
        gridPane.setConstraints(preis, 1, 1);
        gridPane.getChildren().add(preis);

        gridPane.add(new Label("Menge"),0,2);
        menge = new Spinner<Integer>(0, 100, 0);
        gridPane.setConstraints(menge, 1, 2);
        gridPane.getChildren().add(menge);

        gridPane.add(new Label("Beschreibung"),0,3);
        TextField beschreibung = new TextField();
        gridPane.add(beschreibung,1, 3);

        gridPane.add(new Label("Datum"),0,4);
        DatePicker datePicker = new DatePicker();
        gridPane.add(datePicker,1,4);

        Button senden = new Button("Senden");

        senden.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String Artikel = artikel.getText();
                double Preis = preis.getValue();
                int Menge = menge.getValue();
                String Beschreibung = beschreibung.getText();
                LocalDate Datum = datePicker.getValue();

                Connection con = Connector.getConnector().con();

                /*Model model = new Model();
                EinkaufDAO einkaufDAO = new EinkaufDAO();
                try {
                    einkaufDAO.insert(model);
                } catch (SQLException e) {
                    e.printStackTrace();
                }*/

                /*System.out.println(model.getArtikel());
                System.out.println(model.getPreis());
                System.out.println(model.getMenge());
                System.out.println(model.getBeschreibung());
                System.out.println(model.getDatum());*/
            }
        });
        gridPane.add(senden,0,5);


        gridPane.setHgap(20);
        gridPane.setVgap(10);


        primaryStage.setScene(scene);
        primaryStage.show();



    }
}
