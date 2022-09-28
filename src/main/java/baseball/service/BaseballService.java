package baseball.service;

import baseball.model.RandomBaseballNumber;

public class BaseballService {

    private RandomBaseballNumber randomBaseballNumber = new RandomBaseballNumber();

    public void initRandomBaseballNumber() {
        randomBaseballNumber.initNumber();
    }
}
