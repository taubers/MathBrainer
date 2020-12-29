package development;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// The purpose of the MathBrainer is to teach to calculate numbers in the head - both for kids and adults.

public class MathBrainer extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MathBrainer_UI_Desktop.fxml"));
        primaryStage.setTitle("MathBrainer");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
