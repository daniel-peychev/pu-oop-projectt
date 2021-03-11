package com.ked.board;

import com.ked.board.pieces.GameUnit;

import java.awt.*;

public class GameCell {
    boolean hasObstacle;
    GameUnit unit;
    GameCellType cellType;
    Color cellColor;

    public boolean isHasObstacle() {
        return hasObstacle;
    }

    public void setHasObstacle(boolean hasObstacle) {
        this.hasObstacle = hasObstacle;
    }

    public GameUnit getUnit() {
        return unit;
    }

    public void setUnit(GameUnit unit) {
        this.unit = unit;
    }

    public GameCell(GameCellType cellType, Color cellColor){
        hasObstacle = false;
        unit = null;
        this.cellType = cellType;
        this.cellColor = cellColor;
    }

    public void render(Graphics gr) {

    }
}
