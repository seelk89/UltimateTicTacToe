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
import javafx.scene.control.Button;
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
    @FXML
    private Button btn00_21;
    @FXML
    private Button btn00_10;
    @FXML
    private Button btn00_20;
    @FXML
    private Button btn00_22;
    @FXML
    private Button btn00_11;
    @FXML
    private Button btn00_12;
    @FXML
    private Button btn00_02;
    @FXML
    private Button btn00_01;
    @FXML
    private Button btn00_00;
    @FXML
    private Button btn10_00;
    @FXML
    private Button btn10_10;
    @FXML
    private Button btn10_20;
    @FXML
    private Button btn10_21;
    @FXML
    private Button btn10_11;
    @FXML
    private Button btn10_01;
    @FXML
    private Button btn10_22;
    @FXML
    private Button btn10_12;
    @FXML
    private Button btn10_02;
    @FXML
    private Button btn20_00;
    @FXML
    private Button btn20_10;
    @FXML
    private Button btn20_20;
    @FXML
    private Button btn20_21;
    @FXML
    private Button btn20_11;
    @FXML
    private Button btn20_01;
    @FXML
    private Button btn20_22;
    @FXML
    private Button btn20_12;
    @FXML
    private Button btn20_02;
    @FXML
    private Button btn01_20;
    @FXML
    private Button btn01_21;
    @FXML
    private Button btn01_22;
    @FXML
    private Button btn01_10;
    @FXML
    private Button btn01_11;
    @FXML
    private Button btn01_12;
    @FXML
    private Button btn01_00;
    @FXML
    private Button btn01_01;
    @FXML
    private Button btn01_02;
    @FXML
    private Button btn11_20;
    @FXML
    private Button btn11_10;
    @FXML
    private Button btn11_00;
    @FXML
    private Button btn11_21;
    @FXML
    private Button btn11_11;
    @FXML
    private Button btn11_01;
    @FXML
    private Button btn11_02;
    @FXML
    private Button btn11_12;
    @FXML
    private Button btn11_22;
    @FXML
    private Button btn21_20;
    @FXML
    private Button btn21_10;
    @FXML
    private Button btn21_00;
    @FXML
    private Button btn21_21;
    @FXML
    private Button btn21_11;
    @FXML
    private Button btn21_01;
    @FXML
    private Button btn21_22;
    @FXML
    private Button btn21_12;
    @FXML
    private Button btn21_02;
    @FXML
    private Button btn02_00;
    @FXML
    private Button btn02_01;
    @FXML
    private Button btn02_20;
    @FXML
    private Button btn02_11;
    @FXML
    private Button btn02_21;
    @FXML
    private Button btn02_02;
    @FXML
    private Button btn02_12;
    @FXML
    private Button btn02_22;
    @FXML
    private Button btn12_00;
    @FXML
    private Button btn12_10;
    @FXML
    private Button btn12_20;
    @FXML
    private Button btn12_11;
    @FXML
    private Button btn12_21;
    @FXML
    private Button btn12_02;
    @FXML
    private Button btn12_12;
    @FXML
    private Button btn12_22;
    @FXML
    private Button btn22_00;
    @FXML
    private Button btn22_10;
    @FXML
    private Button btn22_20;
    @FXML
    private Button btn22_01;
    @FXML
    private Button btn22_11;
    @FXML
    private Button btn22_21;
    @FXML
    private Button btn22_02;
    @FXML
    private Button btn22_12;
    @FXML
    private Button btn22_22;
    
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
