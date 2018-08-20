package ru.mipt.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import ru.mipt.app.control.listeners.KeyboardListener;

import java.io.IOException;

public class MainApp extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        initRootLayout();

        this.primaryStage.setTitle("Snake game");
        this.primaryStage.setMinHeight(600);
        this.primaryStage.setMinWidth(600);
        this.primaryStage.setMaxHeight(610);
        this.primaryStage.setMaxWidth(610);
    }

    public void initRootLayout() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/AppOverview.fxml"));
            rootLayout = loader.load();

            Scene scene = new Scene(rootLayout);

            scene.setOnKeyPressed(new KeyboardListener());
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
