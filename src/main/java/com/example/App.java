package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = FXMLLoader.load(getClass().getResource("/views/main.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Transaction History");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


//package com.example;
//
///**
// * Hello world!
// *
// */
//public class App
//{
//    public static void main( String[] args )
//    {
//        System.out.println( "Hello World!" );
//    }
//}
