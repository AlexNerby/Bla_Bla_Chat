package sample;

import com.gn.lab.GNButton;
import com.jfoenix.controls.JFXButton;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.*;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;


public class SignInControllers {

    @FXML
    private Label loginIncorrect;

    @FXML
    private AnchorPane apSignIn;

    @FXML
    private JFXTextField loginNick;

    @FXML
    private JFXPasswordField password;

    @FXML
    private JFXButton exit;

    @FXML
    private GNButton buttonSignIn;

    @FXML
    private GNButton signUpButton;

    @FXML
    private Button inButtonSignUp;

    @FXML
    void doExit(MouseEvent event) {
        System.exit(0);
    }

    static Map<String, String> mapReg = new HashMap<>();
    Map<String, String> mapLog = new HashMap<>();


    boolean checkSignInAndSignUp() {
        String addAge = mapReg.get(password.getText());
        String cutName = addAge.substring(0, addAge.indexOf(" "));

        if (mapReg.containsKey(password.getText()) || mapReg.containsValue(cutName)) {
            return true;
        } else
            return false;
    }
//

    @FXML
    void login(MouseEvent event) throws IOException {
        try {
            if (checkSignInAndSignUp()) {
                AnchorPane pane = FXMLLoader.load(getClass().getResource("Chat.fxml"));
                pane.setStyle("-fx-background-radius: 6;");
                apSignIn.getChildren().setAll(pane);
//                setLabelName(mapLog.get(password.getText()));

            } else {
                loginIncorrect.setText("Login and password are incorrect, \ntry again or register");
            }

        } catch (NullPointerException e) {
            e.printStackTrace();
            loginIncorrect.setText("Login and password are incorrect, \ntry again or register");
        }


    }

    @FXML
    public void signUpPage() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        pane.setStyle("-fx-background-radius: 6;");
        apSignIn.getChildren().setAll(pane);
    }

    @FXML
    void initialize(ActionEvent event) {
    }
}
