package baseball.vo;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RandomBaseballNumber {
    
    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;

    private List<Integer> randomNumbers;

    public void initNumber() {
        this.firstNumber = Randoms.pickNumberInRange(1, 9);
        this.secondNumber = Randoms.pickNumberInRange(1, 9);
        this.thirdNumber = Randoms.pickNumberInRange(1, 9);
        generatorRandomBaseballNumber();
    }

    private void generatorRandomBaseballNumber() {
        randomNumbers = new ArrayList<>();
        randomNumbers.add(firstNumber);
        randomNumbers.add(secondNumber);
        randomNumbers.add(thirdNumber);
    }

    public String getResultRandomNumber() {
        StringBuilder randomNumber = new StringBuilder();
        for (Integer number : randomNumbers) {
            randomNumber.append(number);
        }
        return randomNumber.toString();
    }

    public List<Integer> getRandomNumbers() {
        return randomNumbers;
    }

}
