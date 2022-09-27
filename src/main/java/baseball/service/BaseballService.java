package baseball.service;

import baseball.dto.RandomBaseballNumber;

public class BaseballService {

    private RandomBaseballNumber randomBaseballNumber = new RandomBaseballNumber();

    public void initRandomBaseballNumber() {
        randomBaseballNumber.initNumber();
    }
}
