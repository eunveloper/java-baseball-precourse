package baseball.model;

import baseball.view.InputAnyNumber;
import baseball.vo.RandomBaseballNumber;
import org.junit.platform.commons.util.StringUtils;

public class BaseballService {

    private RandomBaseballNumber randomBaseballNumber = new RandomBaseballNumber();
    private InputAnyNumber inputAnyNumber = new InputAnyNumber();

    public void initRandomBaseballNumber() {
        randomBaseballNumber.initNumber();
    }

    public int inputAnyNumber() {
        String inputNumberText = inputAnyNumber.inputAnyNumber();
        if (checkValidationInputNumber(inputNumberText)) {
            return Integer.parseInt(inputNumberText);
        }
        throw new IllegalArgumentException();
    }

    public boolean checkSameInputNumberAndRandomNumber(int inputAnyNumber) {
        return false;
    }

    public boolean confirmRestartGame() {
        return false;
    }

    public boolean checkValidationInputNumber(String inputNumberText) {
        if (!checkNotEmptyInputNumber(inputNumberText)) {
            return false;
        }
        if (!checkNumericInputNumber(inputNumberText)) {
            return false;
        }
        if (!checkLengthInputNumber(inputNumberText)) {
            return false;
        }
        return true;
    }

    private void checkContainNumber() {

    }

    private void checkSameLocationNumber() {

    }

    public boolean checkNotEmptyInputNumber(String inputNumberText) {
        return StringUtils.isNotBlank(inputNumberText);
    }

    public boolean checkNumericInputNumber(String inputNumberText) {
        return inputNumberText.matches("[-+]?\\d*\\.?\\d+");
    }

    public boolean checkLengthInputNumber(String inputNumberText) {
        int inputNumberLength = inputNumberText.length();
        if (inputNumberLength != 3) {
            return false;
        }
        return true;
    }

}
