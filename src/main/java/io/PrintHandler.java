package io;

import java.util.List;

import domain.Lotto;

public class PrintHandler {
    private static final String INPUT_HOW_MUCH_MONEY = "구입 금액을 입력 해 주세요.";
    private static final String ERROR_HOW_MUCH_MONEY = "입력값 오류입니다. 숫자로 입력해주세요.";
    private static final String ERROR_UNIT = "천원 단위로만 구매 할 수 있습니다.";
    private static final String ERROR_PROGRAM = "프로그램에 에러가 있습니다. 담당자에게 연락 해주세요.";

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
}
