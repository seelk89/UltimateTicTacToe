/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimatetictactoe;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Jesper
 */
public class MainWindowController implements Initializable
{

    private Label label;
    @FXML
    private JFXButton btnHumanVsHuman;
    @FXML
    private JFXButton btnHumanvsBot;
    @FXML
    private JFXButton btnBotVsBot;
    @FXML
    private Label lblPlayer1;
    @FXML
    private Label lblPlayer2;
    @FXML
    private JFXTextField txtPlayer1;
    @FXML
    private JFXTextField txtPlayer2;

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        

    }

    @FXML
    private void clickHumanVsHuman(ActionEvent event) throws IOException
    {
        Stage stage = new Stage();

        FXMLLoader fxLoader = new FXMLLoader(getClass().getResource("GameBoard.fxml"));

        Parent root = fxLoader.load();

        GameBoardController controller = fxLoader.getController();
        controller.setParentWindowController(this);

        Scene scene = new Scene(root);
        stage.setTitle("Ultimate Tic-Tac-Toe, Human vs Human");
        stage.setScene(scene);
        stage.show();

//            Stage window = (Stage) btnLogIn.getScene().getWindow();
//            window.close();
    }

    @FXML
    private void clickHumanVsBot(ActionEvent event) throws IOException
    {
        Stage stage = new Stage();

        FXMLLoader fxLoader = new FXMLLoader(getClass().getResource("GameBoard.fxml"));

        Parent root = fxLoader.load();

        GameBoardController controller = fxLoader.getController();
        controller.setParentWindowController(this);

        Scene scene = new Scene(root);
        stage.setTitle("Ultimate Tic-Tac-Toe, Player vs Bot");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void clickBotVsBot(ActionEvent event) throws IOException
    {
        Stage stage = new Stage();

        FXMLLoader fxLoader = new FXMLLoader(getClass().getResource("GameBoard.fxml"));

        Parent root = fxLoader.load();

        GameBoardController controller = fxLoader.getController();
        controller.setParentWindowController(this);

        Scene scene = new Scene(root);
        stage.setTitle("Ultimate Tic-Tac-Toe, Bot vs Bot");
        stage.setScene(scene);
        stage.show();
    }

}
