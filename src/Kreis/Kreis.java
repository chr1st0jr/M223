package Kreis;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.awt.*;

public class Kreis extends Application {

    private String farbe;
    private int groesse;
    private int x;
    private int y;

    public static void main(String[] args) {
        launch(args);
    }

    public double umfang(double radius){
        return 2 * Math.PI* radius;
    }

    public double flaeche(double radius){
        return Math.PI * Math.pow(radius,2);
    }

    public double durchmesser(double radius){
        return 2 * radius;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle circle = new Circle(10,20,10);
        Circle circle2 = new Circle(20,30,10);

        Group root = new Group(circle, circle2);

        Scene scene = new Scene(root, 600, 300);

        primaryStage.setTitle("Kreiszeichnen");

        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
