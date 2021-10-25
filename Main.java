package Opdracht1;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load( getClass().getResource("registration_form.fxml") );
        Scene scene = new Scene(root);
        stage.setTitle("Dialogs");
        stage.setScene(scene);
        stage.show();
    }
}

