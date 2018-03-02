/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimatetictactoe;

import com.jfoenix.controls.JFXButton;
import field.IField;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
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

    private MainWindowController parent;

    int player = 0;
    private List<Button> allTheButtons = new ArrayList<Button>();

    /**
     * Initializes the controller class.
     */
    @FXML
    private Label lblPlayer;
    @FXML
    private Label lblTurnCount;

    private String[][] board = new String[9][9];

    private boolean everywhere = true;
    private boolean idA = false;
    private boolean idB = false;
    private boolean idC = false;
    private boolean idD = false;
    private boolean idE = false;
    private boolean idF = false;
    private boolean idG = false;
    private boolean idH = false;
    private boolean idI = false;
    
    @FXML
    private JFXButton btn0_0;
    @FXML
    private JFXButton btn1_0;
    @FXML
    private JFXButton btn2_0;
    @FXML
    private JFXButton btn3_0;
    @FXML
    private JFXButton btn4_0;
    @FXML
    private JFXButton btn5_0;
    @FXML
    private JFXButton btn6_0;
    @FXML
    private JFXButton btn7_0;
    @FXML
    private JFXButton btn8_0;
    @FXML
    private JFXButton btn0_1;
    @FXML
    private JFXButton btn1_1;
    @FXML
    private JFXButton btn2_1;
    @FXML
    private JFXButton btn3_1;
    @FXML
    private JFXButton btn4_1;
    @FXML
    private JFXButton btn5_1;
    @FXML
    private JFXButton btn6_1;
    @FXML
    private JFXButton btn7_1;
    @FXML
    private JFXButton btn8_1;
    @FXML
    private JFXButton btn0_2;
    @FXML
    private JFXButton btn1_2;
    @FXML
    private JFXButton btn2_2;
    @FXML
    private JFXButton btn3_2;
    @FXML
    private JFXButton btn4_2;
    @FXML
    private JFXButton btn5_2;
    @FXML
    private JFXButton btn6_2;
    @FXML
    private JFXButton btn7_2;
    @FXML
    private JFXButton btn8_2;
    @FXML
    private JFXButton btn0_3;
    @FXML
    private JFXButton btn1_3;
    @FXML
    private JFXButton btn2_3;
    @FXML
    private JFXButton btn3_3;
    @FXML
    private JFXButton btn4_3;
    @FXML
    private JFXButton btn5_3;
    @FXML
    private JFXButton btn6_3;
    @FXML
    private JFXButton btn7_3;
    @FXML
    private JFXButton btn8_3;
    @FXML
    private JFXButton btn0_4;
    @FXML
    private JFXButton btn1_4;
    @FXML
    private JFXButton btn2_4;
    @FXML
    private JFXButton btn3_4;
    @FXML
    private JFXButton btn4_4;
    @FXML
    private JFXButton btn5_4;
    @FXML
    private JFXButton btn6_4;
    @FXML
    private JFXButton btn7_4;
    @FXML
    private JFXButton btn8_4;
    @FXML
    private JFXButton btn0_5;
    @FXML
    private JFXButton btn1_5;
    @FXML
    private JFXButton btn2_5;
    @FXML
    private JFXButton btn3_5;
    @FXML
    private JFXButton btn4_5;
    @FXML
    private JFXButton btn5_5;
    @FXML
    private JFXButton btn6_5;
    @FXML
    private JFXButton btn7_5;
    @FXML
    private JFXButton btn8_5;
    @FXML
    private JFXButton btn0_6;
    @FXML
    private JFXButton btn1_6;
    @FXML
    private JFXButton btn2_6;
    @FXML
    private JFXButton btn3_6;
    @FXML
    private JFXButton btn4_6;
    @FXML
    private JFXButton btn5_6;
    @FXML
    private JFXButton btn6_6;
    @FXML
    private JFXButton btn7_6;
    @FXML
    private JFXButton btn8_6;
    @FXML
    private JFXButton btn0_7;
    @FXML
    private JFXButton btn1_7;
    @FXML
    private JFXButton btn2_7;
    @FXML
    private JFXButton btn3_7;
    @FXML
    private JFXButton btn4_7;
    @FXML
    private JFXButton btn5_7;
    @FXML
    private JFXButton btn6_7;
    @FXML
    private JFXButton btn7_7;
    @FXML
    private JFXButton btn8_7;
    @FXML
    private JFXButton btn0_8;
    @FXML
    private JFXButton btn1_8;
    @FXML
    private JFXButton btn2_8;
    @FXML
    private JFXButton btn3_8;
    @FXML
    private JFXButton btn4_8;
    @FXML
    private JFXButton btn5_8;
    @FXML
    private JFXButton btn6_8;
    @FXML
    private JFXButton btn7_8;
    @FXML
    private JFXButton btn8_8;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        allTheButtons.addAll(Arrays.asList(btn0_0, btn0_1, btn0_2, btn0_3, btn0_4, btn0_5, btn0_6, btn0_7, btn0_8,
        btn1_0, btn1_1, btn1_2, btn1_3, btn1_4, btn1_5, btn1_6, btn1_7, btn1_8,
        btn2_0, btn2_1, btn2_2, btn2_3, btn2_4, btn2_5, btn2_6, btn2_7, btn2_8,
        btn3_0, btn3_1, btn3_2, btn3_3, btn3_4, btn3_5, btn3_6, btn3_7, btn3_8,
        btn4_0, btn4_1, btn4_2, btn4_3, btn4_4, btn4_5, btn4_6, btn4_7, btn4_8,
        btn5_0, btn5_1, btn5_2, btn5_3, btn5_4, btn5_5, btn5_6, btn5_7, btn5_8,
        btn6_0, btn6_1, btn6_2, btn6_3, btn6_4, btn6_5, btn6_6, btn6_7, btn6_8,
        btn7_0, btn7_1, btn7_2, btn7_3, btn7_4, btn7_5, btn7_6, btn7_7, btn7_8,
        btn8_0, btn8_1, btn8_2, btn8_3, btn8_4, btn8_5, btn8_6, btn8_7, btn8_8));

        fillBoard();

    }

    public void setParentWindowController(MainWindowController parent)
    {
        this.parent = parent;
    }
    Button btn;

    @FXML
    private void btnAction(ActionEvent event)
    {
        Integer row = GridPane.getRowIndex((Node) event.getSource());
        Integer col = GridPane.getColumnIndex((Node) event.getSource());

        int r = (row == null) ? 0 : row;
        int c = (col == null) ? 0 : col;

        btn = (Button) event.getSource();

        System.out.println(r);
        System.out.println(c);
        System.out.println(btn);
        System.out.println(board[r][c]);

        choosingBetweenMacroOrMicro();
    }

    private void choosingBetweenMacroOrMicro()
    {
        if (everywhere == true)
        {
            setPiece();
            everywhere = false;
        } else
        {
            choosingMicroBoard();
        }

    }

    private void setPiece()
    {
        if (player == 0)
        {
            btn.setText("X");
            player = 1;

        } else if (player == 1)
        {
            btn.setText("O");
            player = 0;
        }
        settingTheNextMicro();
    }

    //q,w,z dynamic, 2, 1 that checks big board and one that checks macroboard
    //need to check for winning patterns, if 123, 456, 789, 147 etc is there, = win
    // Win/block/strategy/random
    private void choosingMicroBoard()
    {
//        String choosenBtn = btn.getParent().getId();
//        if (choosenBtn == microBoardA.getId() && idA == true)
//        {
//            setPiece();
//        } else if (choosenBtn == microBoardB.getId() && idB == true)
//        {
//            setPiece();
//        {
//            setPiece();
//        } else if (choosenBtn == microBoardD.getId() && idD == true)
//        {
//            setPiece();
//        } else if (choosenBtn == microBoardE.getId() && idE == true)
//        {
//            setPiece();
//        } else if (choosenBtn == microBoardF.getId() && idF == true)
//        {
//            setPiece();
//        } else if (choosenBtn == microBoardG.getId() && idG == true)
//        {
//            setPiece();
//        } else if (choosenBtn == microBoardH.getId() && idH == true)
//        {
//            setPiece();
//        } else if (choosenBtn == microBoardi.getId() && idI == true)
//        {
//            setPiece();
//        }} else if (choosenBtn == microBoardC.getId() && idC == true)
//        {
//            setPiece();
//        } else if (choosenBtn == microBoardD.getId() && idD == true)
//        {
//            setPiece();
//        } else if (choosenBtn == microBoardE.getId() && idE == true)
//        {
//            setPiece();
//        } else if (choosenBtn == microBoardF.getId() && idF == true)
//        {
//            setPiece();
//        } else if (choosenBtn == microBoardG.getId() && idG == true)
//        {
//            setPiece();
//        } else if (choosenBtn == microBoardH.getId() && idH == true)
//        {
//            setPiece();
//        } else if (choosenBtn == microBoardi.getId() && idI == true)
//        {
//            setPiece();
//        }
    }

    private void settingTheNextMicro()
    {
        if (btn.getId().contains("1"))
        {
            idA = true;
            idB = false;
            idC = false;
            idD = false;
            idE = false;
            idF = false;
            idG = false;
            idH = false;
            idI = false;
        } else if (btn.getId().contains("2"))
        {
            idA = false;
            idB = true;
            idC = false;
            idD = false;
            idE = false;
            idF = false;
            idG = false;
            idH = false;
            idI = false;
        } else if (btn.getId().contains("3"))
        {
            idA = false;
            idB = false;
            idC = true;
            idD = false;
            idE = false;
            idF = false;
            idG = false;
            idH = false;
            idI = false;
        } else if (btn.getId().contains("4"))
        {
            idA = false;
            idB = false;
            idC = false;
            idD = true;
            idE = false;
            idF = false;
            idG = false;
            idH = false;
            idI = false;
        } else if (btn.getId().contains("5"))
        {
            idA = false;
            idB = false;
            idC = false;
            idD = false;
            idE = true;
            idF = false;
            idG = false;
            idH = false;
            idI = false;
        } else if (btn.getId().contains("6"))
        {
            idA = false;
            idB = false;
            idC = false;
            idD = false;
            idE = false;
            idF = true;
            idG = false;
            idH = false;
            idI = false;
        } else if (btn.getId().contains("7"))
        {
            idA = false;
            idB = false;
            idC = false;
            idD = false;
            idE = false;
            idF = false;
            idG = true;
            idH = false;
            idI = false;
        } else if (btn.getId().contains("8"))
        {
            idA = false;
            idB = false;
            idC = false;
            idD = false;
            idE = false;
            idF = false;
            idG = false;
            idH = true;
            idI = false;
        } else if (btn.getId().contains("9"))
        {
            idA = false;
            idB = false;
            idC = false;
            idD = false;
            idE = false;
            idF = false;
            idG = false;
            idH = false;
            idI = true;
        }

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
        if (btn0_0.contains(player, player))
        {
            System.out.println("You won!" + lblPlayer.getText());
            //stop game
        }

    }

    private void checkThreeInARow(Button a, Button b, Button c, String XO)
    {
        if (a.getText().equals(XO) && b.getText().equals(XO) && c.getText().equals(XO))
        {
            System.out.println(XO + " Wins");
        }
    }
//                    Will be inserted in a button method, not sure if 10 methods or just 1     
//                    Button btn = (Button) event.getSource();
//                    String xOrO = player == "X" ? "X" : "O";
//                    btn.setText(xOrO);
//                    checkThreeInARow(btn1, btn2, btn3, xOrO); 
//                    checkThreeInARow(btn1, btn4, btn7, xOrO);
//                    checkThreeInARow(btn2, btn5, btn8, xOrO);
//                    checkThreeInARow(btn4, btn5, btn6, xOrO);
//                    checkThreeInARow(btn7, btn8, btn9, xOrO);
//                    checkThreeInARow(btn3, btn6, btn9, xOrO);
//                    checkThreeInARow(btn1, btn5, btn9, xOrO);
//                    checkThreeInARow(btn3, btn5, btn7, xOrO);

}
