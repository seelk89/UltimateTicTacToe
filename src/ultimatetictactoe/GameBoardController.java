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

    @FXML

    private GridPane macroBoard;

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
    @FXML
    private GridPane microBoardA;
    @FXML
    private GridPane microBoardB;
    @FXML
    private GridPane microBoardC;
    @FXML
    private GridPane microBoardD;
    @FXML
    private GridPane microBoardE;
    @FXML
    private GridPane microBoardF;
    @FXML
    private GridPane microBoardH;
    @FXML
    private GridPane microBoardG;
    @FXML
    private GridPane microBoardi;
    @FXML
    private Button btn1a;
    @FXML
    private Button btn6a;
    @FXML
    private Button btn2a;
    @FXML
    private Button btn3a;
    @FXML
    private Button btn9a;
    @FXML
    private Button btn5a;
    @FXML
    private Button btn8a;
    @FXML
    private Button btn7a;
    @FXML
    private Button btn4a;
    @FXML
    private Button btn1b;
    @FXML
    private Button btn2b;
    @FXML
    private Button btn3b;
    @FXML
    private Button btn6b;
    @FXML
    private Button btn5b;
    @FXML
    private Button btn4b;
    @FXML
    private Button btn9b;
    @FXML
    private Button btn8b;
    @FXML
    private Button btn7b;
    @FXML
    private Button btn1c;
    @FXML
    private Button btn2c;
    @FXML
    private Button btn3c;
    @FXML
    private Button btn6c;
    @FXML
    private Button btn5c;
    @FXML
    private Button btn4c;
    @FXML
    private Button btn9c;
    @FXML
    private Button btn8c;
    @FXML
    private Button btn7c;
    @FXML
    private Button btn3d;
    @FXML
    private Button btn6d;
    @FXML
    private Button btn9d;
    @FXML
    private Button btn2d;
    @FXML
    private Button btn5d;
    @FXML
    private Button btn8d;
    @FXML
    private Button btn1d;
    @FXML
    private Button btn4d;
    @FXML
    private Button btn7d;
    @FXML
    private Button btn3e;
    @FXML
    private Button btn2e;
    @FXML
    private Button btn1e;
    @FXML
    private Button btn6e;
    @FXML
    private Button btn5e;
    @FXML
    private Button btn4e;
    @FXML
    private Button btn7e;
    @FXML
    private Button btn8e;
    @FXML
    private Button btn9e;
    @FXML
    private Button btn3f;
    @FXML
    private Button btn2f;
    @FXML
    private Button btn1f;
    @FXML
    private Button btn6f;
    @FXML
    private Button btn5f;
    @FXML
    private Button btn4f;
    @FXML
    private Button btn9f;
    @FXML
    private Button btn8f;
    @FXML
    private Button btn7f;
    @FXML
    private Button btn1g;
    @FXML
    private Button btn2g;
    @FXML
    private Button btn3g;
    @FXML
    private Button btn4g;
    @FXML
    private Button btn5g;
    @FXML
    private Button btn6g;
    @FXML
    private Button btn7g;
    @FXML
    private Button btn8g;
    @FXML
    private Button btn9g;
    @FXML
    private Button btn1h;
    @FXML
    private Button btn2h;
    @FXML
    private Button btn3h;
    @FXML
    private Button btn4h;
    @FXML
    private Button btn5h;
    @FXML
    private Button btn6h;
    @FXML
    private Button btn7h;
    @FXML
    private Button btn8h;
    @FXML
    private Button btn9h;
    @FXML
    private Button btn1i;
    @FXML
    private Button btn2i;
    @FXML
    private Button btn3i;
    @FXML
    private Button btn4i;
    @FXML
    private Button btn5i;
    @FXML
    private Button btn6i;
    @FXML
    private Button btn7i;
    @FXML
    private Button btn8i;
    @FXML
    private Button btn9i;

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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        allTheButtons.addAll(Arrays.asList(btn1a, btn2a, btn3a, btn4a, btn5a, btn6a, btn7a, btn8a, btn9a,
                btn1b, btn2b, btn3b, btn4b, btn5b, btn6b, btn7b, btn8b, btn9b,
                btn1c, btn2c, btn3c, btn4c, btn5c, btn6c, btn7c, btn8c, btn9c,
                btn1d, btn2d, btn3d, btn4d, btn5d, btn6d, btn7d, btn8d, btn9d,
                btn1e, btn2e, btn3e, btn4e, btn5e, btn6e, btn7e, btn8e, btn9e,
                btn1f, btn2f, btn3f, btn4f, btn5f, btn6f, btn7f, btn8f, btn9f,
                btn1g, btn2g, btn3g, btn4g, btn5g, btn6g, btn7g, btn8g, btn9g,
                btn1h, btn2h, btn3h, btn4h, btn5h, btn6h, btn7h, btn8h, btn9h,
                btn1i, btn2i, btn3i, btn4i, btn5i, btn6i, btn7i, btn8i, btn9i));

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
        String choosenBtn = btn.getParent().getId();
        if (choosenBtn == microBoardA.getId() && idA == true)
        {
            setPiece();
        } else if (choosenBtn == microBoardB.getId() && idB == true)
        {
            setPiece();
        } else if (choosenBtn == microBoardC.getId() && idC == true)
        {
            setPiece();
        } else if (choosenBtn == microBoardD.getId() && idD == true)
        {
            setPiece();
        } else if (choosenBtn == microBoardE.getId() && idE == true)
        {
            setPiece();
        } else if (choosenBtn == microBoardF.getId() && idF == true)
        {
            setPiece();
        } else if (choosenBtn == microBoardG.getId() && idG == true)
        {
            setPiece();
        } else if (choosenBtn == microBoardH.getId() && idH == true)
        {
            setPiece();
        } else if (choosenBtn == microBoardi.getId() && idI == true)
        {
            setPiece();
        }
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
        if (btn1a.contains(player, player))
        {
            System.out.println("You won!" + lblPlayer.getText());
            //stop game
        }

    }

}
