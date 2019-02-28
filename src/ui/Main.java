package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        Scene scene = new Scene(root, 800, 400);
        Scene scene = new Scene(root);
        primaryStage.setTitle("Airlines - Simulador de deslocamento de tripulação");
        primaryStage.getIcons().add( new Image( Main.class.getResourceAsStream("aviao-h.png") ) );
        primaryStage.setScene( scene );
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
