package M223_TEST_LB3;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.ComboBoxListCell;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import static javafx.scene.paint.Color.BLACK;

public class GuiPrototyp extends Application {
    private TableView table = new TableView();
    private Spinner<Integer> bewertung;

    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane borderPane = new BorderPane();

//        Titel oben
        Label titel = new Label("Ticketkauf");
        titel.setTextFill(BLACK);
        titel.setFont(Font.font(20));

        HBox hBox = new HBox();
        hBox.getChildren().add(titel);
        hBox.setAlignment(Pos.CENTER);
        borderPane.setTop(hBox);

        GridPane gridPane = new GridPane();
        borderPane.setCenter(gridPane);

//        Datum
        Label datum = new Label("Datum");
        gridPane.add(datum,0,0);

        DatePicker datepicker = new DatePicker();
        gridPane.add(datepicker, 1, 0);

//        Film
        Label programm = new Label("Film");
        gridPane.add(programm, 0,1);

        TableColumn filmCol = new TableColumn("Film");
        TableColumn zeitCol = new TableColumn("Zeit");
        TableColumn saalCol = new TableColumn("Saal");

        table.getColumns().addAll(filmCol, zeitCol, saalCol);


        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(table);
        gridPane.add(table,1,1);

//        Platz
        Label platz = new Label("Sitzplatz");
        gridPane.add(platz,0,2);

        ListView<String> list = new ListView<String>();
        list.setPrefSize(250, 50);
        ObservableList<String> items = FXCollections.observableArrayList(
                "Reihe 11 - Platz 1", "Reihe 11 - Platz 2", "Reihe 11 - Platz 3", "Reihe 11 - Platz 4");
        list.setItems(items);
        list.setCellFactory(ComboBoxListCell.forListView(items));
        gridPane.setConstraints(list, 1, 2);
        gridPane.getChildren().add(list);

//        Kundennummer
        Label kundennummer = new Label("Kundennummer");
        gridPane.add(kundennummer,0,3);

        TextField kn = new TextField();
        gridPane.add(kn,1,3);

//        Nachname
        Label nachname = new Label("Nachname");
        gridPane.add(nachname,0,4);

        TextField nn = new TextField();
        gridPane.add(nn,1,4);

//        Vorname
        Label vorname = new Label("Vorname");
        gridPane.add(vorname,0,5);

        TextField vn = new TextField();
        gridPane.add(vn,1,5);


//        Bewertung
        gridPane.add(new Label("Bewertung"),0,6);
        bewertung = new Spinner<Integer>(1, 5, 3);
        gridPane.setConstraints(bewertung, 1, 6);
        gridPane.getChildren().add(bewertung);

//        AGB
        CheckBox agb = new CheckBox();
        gridPane.add(agb,0,7);

        Hyperlink hl = new Hyperlink("AGB");
        gridPane.add(hl,1,7);


//          Buttons unten
        HBox hBox1 = new HBox();
        Button button1 = new Button("Kaufen");
        hBox1.getChildren().addAll(button1);
        gridPane.add(hBox1,1,8);


        gridPane.setHgap(20);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10,10,10,10));

        Scene scene = new Scene(borderPane,350,400);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Gui Prototyp");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
