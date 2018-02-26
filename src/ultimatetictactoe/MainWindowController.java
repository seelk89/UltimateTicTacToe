/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimatetictactoe;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

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
    private void clickHumanVsHuman(ActionEvent event) {
    }

    @FXML
    private void clickHumanVsBot(ActionEvent event) {
    }

    @FXML
    private void clickBotVsBot(ActionEvent event) {
    }
    
}
