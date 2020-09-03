package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class ChatControllers {

    @FXML
    private Label labelName;

    @FXML
    private AnchorPane apChat;

    @FXML
    private FontAwesomeIconView toLogin;

    @FXML
    private JFXTextField sendText;

    @FXML
    private JFXButton exit;

    @FXML
    private JFXButton sendButton;

    @FXML
    private JFXTextArea outText;

    @FXML
    void doExit(MouseEvent event) {
        System.exit(0);
    }

    @FXML
    void clickSend(MouseEvent event) {
        outText.setText(sendText.getText());

    }

    @FXML
    void enterSend(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            outText.setText(sendText.getText());
        }
    }

    @FXML
    void backToLogin(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("SignIn.fxml"));
        pane.setStyle("-fx-background-radius: 6;");
        apChat.getChildren().setAll(pane);

    }


    @FXML
    void initialize() {
    }

}
