package baseball.model;

import baseball.vo.RandomBaseballNumber;

public class BaseballService {

    private RandomBaseballNumber randomBaseballNumber = new RandomBaseballNumber();

    public void initRandomBaseballNumber() {
        randomBaseballNumber.initNumber();
    }
}
