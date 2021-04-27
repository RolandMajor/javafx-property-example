package ex2;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculatorApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/ui.fxml"));
        fxmlLoader.setController(new CalculatorController());
        Parent root = fxmlLoader.load();
        stage.setTitle("JavaFX Property Binding");
        stage.setScene(new Scene(root));
        stage.show();
    }

}
