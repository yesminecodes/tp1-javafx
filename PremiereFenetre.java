package com.yesmine.tp1javafx;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class PremiereFenetre extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 300, 250, Color.WHITE);

        primaryStage.setTitle("Ma première fenêtre");
        primaryStage.setScene(scene);


        ObservableList<Node> liste = root.getChildren();
        Line ligne = new Line(50,50,200,50);
        Rectangle rec = new Rectangle(70,70,300,70);
        Circle cir = new Circle(200,200,40);
        cir.setFill(Color.PINK);

        liste.add(ligne);
        liste.add(rec);
        liste.add(cir);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}