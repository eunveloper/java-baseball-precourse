package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomBaseballNumber {
    
    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;

    public void initNumber() {
        this.firstNumber = Randoms.pickNumberInRange(1, 9);
        this.secondNumber = Randoms.pickNumberInRange(1, 9);
        this.thirdNumber = Randoms.pickNumberInRange(1, 9);
    }

}
