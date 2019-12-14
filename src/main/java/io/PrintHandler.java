package io;

import java.util.List;

import domain.Lotto;

public class PrintHandler {
    private static final String INPUT_HOW_MUCH_MONEY = "구입 금액을 입력 해 주세요.";
    private static final String ERROR_HOW_MUCH_MONEY = "입력값 오류입니다. 숫자로 입력해주세요.";
    private static final String ERROR_UNIT = "천원 단위로만 구매 할 수 있습니다.";
    private static final String ERROR_PROGRAM = "프로그램에 에러가 있습니다. 담당자에게 연락 해주세요.";
    private static final String INPUT_WINNING_NUMBERS = "지난 주 당첨 번호를 입력 해 주세요.(쉼표 기준)";
    private static final String ERROR_WINNING_NUMBER = "잘못된 입력입니다. 1-45 사이의 수를 ','를 기준으로 입력해주세요.";
    private static final String ERROR_FORMAT = "잘못된 입력입니다 숫자만 입력해주세요";
    private static final String INPUT_BONUS_NUMBER = "보너스 수를 입력해주세요.";
    private static final String ERROR_RANGE = "범위가 잘 못되었습니다. 1~45 사이의 수를 입력해주세요";

    public static void inputHowMuchMoney() {
        System.out.println(INPUT_HOW_MUCH_MONEY);
    }

    public static void errorHowMuchMoney() {
        System.out.println(ERROR_HOW_MUCH_MONEY);
    }

    public static void errorUnit() {
        System.out.println(ERROR_UNIT);
    }

    public static void printLottoList(List<Lotto> lottoList) {
        for (Lotto lotto : lottoList) {
            System.out.println(lotto.toString());
        }
    }

    public static void errorProgram() {
        System.out.println(ERROR_PROGRAM);
    }

    public static void inputWinningNumbers() {
        System.out.println(INPUT_WINNING_NUMBERS);
    }

    public static void errorWinningNumber() {
        System.out.println(ERROR_WINNING_NUMBER);
    }

    public static void errorFormat() {
        System.out.println(ERROR_FORMAT);
    }

    public static void inputBonusNumber() {
        System.out.println(INPUT_BONUS_NUMBER);
    }

    public static void errorRange() {
        System.out.println(ERROR_RANGE);
    }
}
