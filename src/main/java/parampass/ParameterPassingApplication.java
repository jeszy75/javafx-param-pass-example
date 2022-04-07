package parampass;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ParameterPassingApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/first.fxml"));
        stage.setTitle("JavaFX Parameter Passing");
        stage.setScene(new Scene(root));
        stage.show();
    }

}
