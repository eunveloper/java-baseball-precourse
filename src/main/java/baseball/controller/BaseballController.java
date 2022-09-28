package baseball.controller;

import baseball.model.BaseballService;
import baseball.view.InputAnyNumber;

public class BaseballController {

    private BaseballService baseballService = new BaseballService();

    public void initRandomBaseballNumber() {
        baseballService.initRandomBaseballNumber();
    }

    public int inputAnyNumber() {
        InputAnyNumber inputAnyNumber = new InputAnyNumber();
        return inputAnyNumber.inputAnyNumber();
    }

    public boolean checkSameInputNumberAndRandomNumber(int inputAnyNumber) {
        return false;
    }

    public boolean confirmRestartGame() {
        return false;
    }
}
