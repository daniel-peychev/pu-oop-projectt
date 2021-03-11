package com.ked.board;

import javax.swing.*;
import java.awt.*;

public class GameBoard extends JFrame{
    final int cellSize = 70;
    final int leftMargin = 50;
    final int topMargin = 50;
    GameCell[][] cells = new GameCell[7][9];

    public GameBoard(){
        this.setSize(900, 600);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Graphics gr = this.getGraphics();

        generageBoardFields();
        this.setVisible(true);
    }

    private void generageBoardFields(){
        // First and second row
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 9; j++){
                int colorNumber = j % 2;
                colorNumber = (colorNumber + i) % 2;

                Color cellColor = colorNumber == 0 ? Color.gray : Color.darkGray;

                cells[i][j] = new GameCell(GameCellType.PLAYER1, cellColor);
            }
        }

        // generate battle fields
        for (int i = 2; i <= 4; i++){
            for(int j = 0; j < 9; j++){
                cells[i][j] = new GameCell(GameCellType.BATTLE, Color.lightGray);
            }
        }

        // Last two rows
        for (int i = 5; i < 7; i++){
            for (int j = 0; j < 9; j++){
                int colorNumber = j % 2;
                colorNumber = (colorNumber + i) % 2;

                Color cellColor = colorNumber == 0 ? Color.darkGray : Color.gray;

                cells[i][j] = new GameCell(GameCellType.PLAYER2, cellColor);
            }
        }
    }

    void printLines(Graphics gr){
        gr.setColor(Color.black);
        for (int i = 0; i <= 7; i++){
            gr.drawLine(leftMargin, leftMargin + i * cellSize, leftMargin + 9 * cellSize, leftMargin + i * cellSize);
        }

        for (int i = 0; i <= 9; i++){
            gr.drawLine(leftMargin + i * cellSize, topMargin, leftMargin + i * cellSize, topMargin + 7 * cellSize);
        }
    }

    void printBoard(Graphics gr){
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 9; j++){
                gr.setColor(cells[i][j].cellColor);
                gr.fillRect(j * cellSize + leftMargin, i * cellSize + topMargin, cellSize, cellSize);
            }
        }
    }

    @Override
    public void paint(Graphics gr){
        super.paint(gr);
        printBoard(gr);
        printLines(gr);
    }
}
