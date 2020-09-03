package sample;

import com.gn.lab.GNButton;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;
import java.util.*;

public class SignUpControllers extends SignInControllers{

    @FXML
    private Label label;

    @FXML
    private AnchorPane apSignUp;

    @FXML
    private JFXTextField newName;

    @FXML
    private JFXPasswordField newPassword;

    @FXML
    private JFXButton exit;

    @FXML
    private GNButton confirm;

    @FXML
    private GNButton goToLogin;

    @FXML
    private JFXTextField newAge;


    @FXML
    void doExit(MouseEvent event) {
        System.exit(0);
    }

    @FXML
    void toLogin() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("SignIn.fxml"));
        pane.setStyle("-fx-background-radius: 6;");
        apSignUp.getChildren().setAll(pane);
    }
//

    Map<String, String> map = new HashMap<>();

    public void setLoginMap(Map<String, String> loginMap) {
        loginMap.putAll(map);
    }


    @FXML
    void doConfirm(MouseEvent event) throws IOException {
        if (newName.getText().isEmpty() || newAge.getText().isEmpty() || newPassword.getText().isEmpty()) {
            label.setText("incorrect name, please try again");
        } else {

            label.setText("");
            map.put(newPassword.getText(), newName.getText() + " " + newAge.getText());
            setLoginMap(mapReg);
            System.out.println(map);
            toLogin();
        }
    }

}
