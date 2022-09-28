package baseball.model;

import baseball.view.InputAnyNumber;
import baseball.vo.RandomBaseballNumber;

public class BaseballService {

    private RandomBaseballNumber randomBaseballNumber = new RandomBaseballNumber();
    private InputAnyNumber inputAnyNumber = new InputAnyNumber();

    public void initRandomBaseballNumber() {
        randomBaseballNumber.initNumber();
    }

    public int inputAnyNumber() {
        int inputNumber = inputAnyNumber.inputAnyNumber();
        if (checkValidationInputNumber(inputNumber)) {
            return inputAnyNumber.inputAnyNumber();
        }
        throw new IllegalStateException();
    }

    public boolean checkSameInputNumberAndRandomNumber(int inputAnyNumber) {
        return false;
    }

    public boolean confirmRestartGame() {
        return false;
    }

    private boolean checkValidationInputNumber(int inputNumber) {
        return false;
    }

    private void checkContainNumber() {

    }

    private void checkSameLocationNumber() {

    }

}
