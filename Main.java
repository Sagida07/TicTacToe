package org.example;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.setBackgroundColor(Color.WHITE);
        game.setWindowSize(new Dimension(700,700));
        Set<String> playerNames = new HashSet<>();
        playerNames.add("Sagida");
        playerNames.add("Sezim");
        game.setButtonsColor(Color.cyan);
        game.setTitle("Aya-nick");
        game.setButtonForegroundColor(Color.PINK);
        game.setButtonForegroundTextSize(40);
        game.setPlayerNames(playerNames);
        game.setTurnLabelText("Lets go");
        game.setTurnLabelTextSize(30);
        game.setTurnLabelForegroundColor(Color.BLACK);
        game.setVisible(true);
    }
}