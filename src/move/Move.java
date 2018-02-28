/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package move;

import javafx.scene.Node;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Elisabeth
 */
public class Move implements IMove {
    
    private Integer X = 0;
    private Integer Y = 0;

    @Override
    public int getX() {
        return X;
    }

    @Override
    public int getY() {
        return Y;
    }

    public void setX(Integer X)
    {
        this.X = X;
    }

    public void setY(Integer Y)
    {
        this.Y = Y;
    }
}
