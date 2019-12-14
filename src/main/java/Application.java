import java.io.IOException;

import controller.GameController;
import io.PrintHandler;

public class Application {
    public static void main(String[] args) throws IOException {
        try {
            GameController.startGame();
        }catch (Exception e){
            PrintHandler.errorProgram();
            e.printStackTrace();
        }
    }
}
