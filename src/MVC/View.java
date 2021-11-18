package MVC;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Observable;
import java.util.Observer;

import static javafx.scene.paint.Color.BLACK;


public class View extends Application implements Observer {

    Controller controller = new Controller();
    Model model = new Model();
    Label number = null;

    @Override
    public void start(Stage primaryStage) throws Exception {

        controller.setModel(model);
        model.addObserver(this);

        BorderPane borderPane = new BorderPane();

        VBox vBox = new VBox();
        int value = 0;
        vBox.setAlignment(Pos.CENTER);
        number = new Label(Integer.toString(value));
        number.setTextFill(BLACK);
        number.setStyle("-fx-font: 40 arial;");
        vBox.getChildren().add(number);
        borderPane.setCenter(vBox);

        Button button = new Button();
        button.setPrefSize(300,50);
        button.setText("Klick mich");
        borderPane.setBottom(button);

        button.setOnAction(new EventHandler<ActionEvent>() {
                               @Override
                               public void handle(ActionEvent event) {

                                   controller.update();

                               }
        });

                Scene scene = new Scene(borderPane, 300, 250);

        primaryStage.setTitle("MVC");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void update(Observable o, Object arg) {
        number.setText(Integer.toString(model.getCounter()));
        System.out.println(model.getCounter());
    }
}
