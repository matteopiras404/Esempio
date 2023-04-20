package com.example.test1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class example extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Label label = new Label("Hello There! \nGeneral Kenobi!");

        StackPane root = new StackPane();
        root.getChildren().add(label);

        Scene scene = new Scene(root, 450, 250);

        stage.setTitle("JavaFX Open a new Window (o7planning.org)");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) { launch(args); }
}
