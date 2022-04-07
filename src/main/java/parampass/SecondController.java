package parampass;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

import org.tinylog.Logger;

public class SecondController {

    @FXML
    private Text text;

    private String name;

    @FXML
    private void initialize() {
        Logger.info("name = {}", name);
        Platform.runLater(() -> {
            Logger.info("name = {}", name);
            text.setText("Hello, " + name + "!");
        });
    }

    public void setName(String name) {
        Logger.info("Setting name to {}", name);
        this.name = name;
    }

    @FXML
    private void handleExitButton(ActionEvent event) {
        Platform.exit();
    }

}
