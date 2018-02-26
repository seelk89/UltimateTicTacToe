/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimatetictactoe;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;

/**
 * FXML Controller class
 *
 * @author Jesper
 */
public class GameBoardController implements Initializable
{

    @FXML
    private GridPane macroBoard;
    @FXML
    private GridPane microBoard00;
    @FXML
    private GridPane microBoard10;
    @FXML
    private GridPane microBoard20;
    @FXML
    private GridPane microBoard01;
    @FXML
    private GridPane microBoard11;
    @FXML
    private GridPane microBoard21;
    @FXML
    private GridPane microBoard02;
    @FXML
    private GridPane microBoard12;
    @FXML
    private GridPane microBoard22;
    
    private MainWindowController parent;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    
 
    
    
     public void setParentWindowController(MainWindowController parent)
    {
        this.parent = parent;
    }
}
