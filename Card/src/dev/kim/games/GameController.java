package dev.kim.games;

import dev.kim.games.poker.PokerGame;

public class GameController {

    public static void main(String[] args) {

        PokerGame fiveCardDraw = new PokerGame(6, 8);
        fiveCardDraw.startPlay();




    }
}
