package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/fxml/client.fxml"));
        try {
            Parent root = loader.load();
            Scene scene1 = new Scene(root);
            primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream("/resources/images/logo.png")));
            primaryStage.setScene(scene1);
            primaryStage.setResizable(false);
            primaryStage.show();
            primaryStage.setTitle("Pre Paid Card");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

