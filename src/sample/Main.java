package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.io.IOException;

public class Main extends Application{

    @Override
    public void start(Stage stage) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("SignIn.fxml"));
        Scene signIp = new Scene(root);
        stage.setScene(signIp);
//
        //Убираем верхнюю основу окна
        stage.initStyle(StageStyle.UNDECORATED);

        //Какая то магия, которая делает прозрачным цвет углов, оставшихся после изменения радиуса основной панели в fxml
        signIp.setFill(Color.TRANSPARENT);
        stage.initStyle(StageStyle.TRANSPARENT);

        stage.show();

        //двигаем окно за шапку с заданным числом пикселей()
        com.sun.glass.ui.Window.getWindows().get(0).setUndecoratedMoveRectangle(50);
    }


    public static void main(String[] args) {

        launch(args);
    }
}

