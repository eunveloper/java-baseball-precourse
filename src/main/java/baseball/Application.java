package baseball;

import baseball.service.BaseballService;

public class Application {

    public static BaseballService baseballService = new BaseballService();

    public static void main(String[] args) {
        initRandomBaseballNumber();
    }

    private static void initRandomBaseballNumber() {
        baseballService.initRandomBaseballNumber();
    }

}
