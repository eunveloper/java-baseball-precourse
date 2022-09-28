package baseball;

import baseball.controller.BaseballController;

public class Application {

    public static BaseballController baseballController = new BaseballController();

    public static void main(String[] args) {
        startBaseballGame();
        doBaseballGame();
        confirmRestartBaseballGame();
    }

    private static void startBaseballGame() {
        baseballController.initRandomBaseballNumber();
    }

    private static void doBaseballGame() {
        boolean sameNumber;
        do {
            int inputAnyNumber = baseballController.inputAnyNumber();
            sameNumber = baseballController.checkSameInputNumberAndRandomNumber(inputAnyNumber);
        } while (!sameNumber);
    }

    private static void confirmRestartBaseballGame() {
        boolean restartGame = baseballController.confirmRestartGame();
        if (restartGame) {
            startBaseballGame();
        }
        System.exit(0);
    }

}
