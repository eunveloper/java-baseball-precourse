package baseball.controller;

import baseball.model.BaseballService;

public class BaseballController {

    private BaseballService baseballService = new BaseballService();

    public void initRandomBaseballNumber() {
        baseballService.initRandomBaseballNumber();
    }

    public int inputAnyNumber() {
        return baseballService.inputAnyNumber();
    }

    public boolean checkSameInputNumberAndRandomNumber(int inputAnyNumber) {
        return baseballService.checkSameInputNumberAndRandomNumber(inputAnyNumber);
    }

    public boolean confirmRestartGame() {
        return baseballService.confirmRestartGame();
    }

}
