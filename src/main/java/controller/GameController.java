package controller;

import java.io.IOException;

import io.UserInput;
import model.GameModel;

public class GameController {

    public static void startGame() throws IOException {
        UserInput userInput = new UserInput();
        GameModel gameModel = new GameModel(userInput.howManyBuyLotto());
        gameModel.play();
    }
}
