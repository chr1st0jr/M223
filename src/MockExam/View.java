package MockExam;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.ComboBoxListCell;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import static javafx.scene.paint.Color.BLACK;

//GUI example

public class View extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

//      Äusserster Rahmen
        BorderPane borderPane = new BorderPane();

//      Titel oben -> Buy Ticket
        Label titel = new Label("Buy Ticket");
        titel.setTextFill(BLACK);
        titel.setFont(Font.font(20));

//      Titel in eine HBox hinzufügen
        HBox hBox = new HBox();
        hBox.getChildren().add(titel);
        hBox.setAlignment(Pos.CENTER);
        borderPane.setTop(hBox);

//      Gitternetz
        GridPane gridPane = new GridPane();
        borderPane.setCenter(gridPane);

//      Event
        Label event = new Label("Event");
        gridPane.add(event, 0,0);

        ListView<String> list = new ListView<String>();
        list.setPrefSize(250, 50);
        ObservableList<String> items = FXCollections.observableArrayList(
                "Kino", "Degustation", "Tanz", "Comedy Show");
        list.setItems(items);
        list.setCellFactory(ComboBoxListCell.forListView(items));
        gridPane.setConstraints(list, 1, 0);
        gridPane.getChildren().add(list);

//      Firstname
        Label firstname = new Label("Firstname");
        gridPane.add(firstname, 0,1);

        TextField fn = new TextField();
        gridPane.add(fn,1,1);

//      Lastname
        Label lastname = new Label("Lastname");
        gridPane.add(lastname, 0,2);

        TextField ln = new TextField();
        gridPane.add(ln,1,2);

//      Comment
        Label comment = new Label("Comment");
        gridPane.setValignment(comment, VPos.TOP);
        gridPane.add(comment, 0,3);

        TextField cm = new TextField();
        cm.setPrefSize(250,100);
        gridPane.add(cm,1,3);

//      Buttons unten
        HBox hBox1 = new HBox();
        Button button1 = new Button("Ok");
        Button button2 = new Button("Cancel");
        hBox1.getChildren().addAll(button1,button2);

        AnchorPane anchorPane = new AnchorPane();
        anchorPane.getChildren().add(hBox1);
        anchorPane.setLeftAnchor(button1,1.0);
        anchorPane.setRightAnchor(button2,1.0);
        gridPane.setHalignment(hBox1, HPos.RIGHT);
        gridPane.add(hBox1,1,4);
        borderPane.setBottom(anchorPane);





//      Grösse der Abstände im Gitternetz
        gridPane.setHgap(20);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10,10,10,10));




        Scene scene = new Scene(borderPane,350,400);

        primaryStage.setScene(scene);
        primaryStage.setTitle("GUI Repetition");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
