package baseball.client;

import baseball.controller.BaseballController;

public class BaseballGamePlay {

    public static BaseballController baseballController = new BaseballController();

    public void startGame() {
        startBaseballGame();
        doBaseballGame();
        confirmRestartBaseballGame();
    }

    private void startBaseballGame() {
        baseballController.initRandomBaseballNumber();
    }

    private void doBaseballGame() {
        boolean sameNumber;
        do {
            int inputAnyNumber = baseballController.inputAnyNumber();
            sameNumber = baseballController.checkSameInputNumberAndRandomNumber(inputAnyNumber);
        } while (!sameNumber);
    }

    private void confirmRestartBaseballGame() {
        boolean restartGame = baseballController.confirmRestartGame();
        if (restartGame) {
            startBaseballGame();
        }
        System.exit(0);
    }

}
