/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimatetictactoe;

import field.IField;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

/**
 * FXML Controller class
 *
 * @author Jesper
 */
public class GameBoardController implements Initializable
{

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
    private Button btn02_10;
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
    private Button btn12_01;
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
    
    int player = 0;
    private List<Button> allTheButtons = new ArrayList<Button>();
    private String [][] board = new String [9][9];
    
    /**
     * Initializes the controller class.
     */
   
    @FXML
    private Label lblPlayer;
    @FXML
    private Label lblTurnCount;
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        fillBoard();
        
        allTheButtons.addAll(Arrays.asList(btn00_00,btn00_01,btn00_02,btn00_10,btn00_11,btn00_12,btn00_20,btn00_21,btn00_22,
                    btn01_00,btn01_01,btn01_02,btn01_10,btn01_11,btn01_12,btn01_20,btn01_21,btn01_22,
                    btn02_00,btn02_01,btn02_02,btn02_10,btn02_11,btn02_12,btn02_20,btn02_21,btn02_22,
                    btn10_00,btn10_01,btn10_02,btn10_10,btn10_11,btn10_12,btn10_20,btn10_21,btn10_22,
                    btn11_00,btn11_01,btn11_02,btn11_10,btn11_11,btn11_12,btn11_20,btn11_21,btn11_22,
                    btn12_00,btn12_01,btn12_02,btn12_10,btn12_11,btn12_12,btn12_20,btn12_21,btn12_22,
                    btn20_00,btn20_01,btn20_02,btn20_10,btn20_11,btn20_12,btn20_20,btn20_21,btn20_22,
                    btn21_00,btn21_01,btn21_02,btn21_10,btn21_11,btn21_12,btn21_20,btn21_21,btn21_22,
                    btn22_00,btn22_01,btn22_02,btn22_10,btn22_11,btn22_12,btn22_20,btn22_21,btn22_22));
    }    

    public void setParentWindowController(MainWindowController parent)
    {
        this.parent = parent;
    }

    @FXML
    private void btnAction(ActionEvent event)
    {
        Integer row = GridPane.getRowIndex((Node) event.getSource());
        Integer col = GridPane.getColumnIndex((Node) event.getSource());
        
        int r = (row == null) ? 0 : row;
        int c = (col == null) ? 0 : col;
        
        Button btn = (Button) event.getSource();
        
        if(player == 0)
        {
            btn.setText("X");
            player = 1;
        } else
        {
            btn.setText("O");
            player = 0;
        } 
       
        System.out.println(r);
        System.out.println(c);
        System.out.println(btn);
        System.out.println(board[r][c]);
    }
    
    private void fillBoard()
    {
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board.length; j++)
            {
                board[i][j] = IField.EMPTY_FIELD;  
            }       
        }
    }
    
    private void win()
    {
        if (btn00_00.contains(player, player)) 
        {
            System.out.println("You won!" + lblPlayer.getText()); 
            //stop game
        }
        
    }   
}
