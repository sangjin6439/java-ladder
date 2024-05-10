import controller.GameController;
import view.InputView;
import view.OutPutView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutPutView outPutView = new OutPutView();
        GameController gameController = new GameController(inputView,outPutView);
        gameController.playGame();
    }
}