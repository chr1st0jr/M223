package Ticketkauf_anchor;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.ComboBoxListCell;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

//falls java awt dann löschen und neu importieren.


public class Ticket extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane borderPane = new BorderPane();
        Scene scene = new Scene(borderPane,400,400);

        Label text = new Label("Ticket kaufen");
        borderPane.setAlignment(text, Pos.CENTER);
        borderPane.setTop(text);

        GridPane gridPane = new GridPane();
        borderPane.setCenter(gridPane);
        gridPane.setPadding(new Insets(20, 20,20,20));

        gridPane.add(new Label("Event"),0,0);
        ListView<String> list = new ListView<String>();
        list.setPrefSize(250, 100);
        ObservableList<String> items = FXCollections.observableArrayList(
                "A = Kino", "B = Degustation", "C = Tanz", "D = Comedy Show");
        list.setItems(items);
        list.setCellFactory(ComboBoxListCell.forListView(items));
        gridPane.setConstraints(list, 1, 0);
        gridPane.getChildren().add(list);

        gridPane.setHgap(50);


        AnchorPane anchorPane = new AnchorPane();
        Button ok = new Button();
        Button abbrechen = new Button();
        anchorPane.setLeftAnchor(ok, 10.0);
        anchorPane.setRightAnchor(abbrechen, 10.0);


        borderPane.setBottom(anchorPane);




        
//

        primaryStage.setScene(scene);
        primaryStage.show();






    }
}
