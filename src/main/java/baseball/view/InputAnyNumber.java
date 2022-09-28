package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputAnyNumber {

    private final String inputText = "숫자를 입력해주세요 : ";

    public int inputAnyNumber() {
        System.out.print(inputText);
        return Integer.parseInt(Console.readLine());
    }

}
