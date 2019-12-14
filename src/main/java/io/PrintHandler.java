package io;

public class PrintHandler {
    private static final String INPUT_HOW_MUCH_MONEY = "구입 금액을 입력 해 주세요.";
    private static final String ERROR_HOW_MUCH_MONEY = "입력값 오류입니다. 숫자로 입력해주세요.";
    private static final String ERROR_UNIT = "천원 단위로만 구매 할 수 있습니다.";

    public static void inputHowMuchMoney() {
        System.out.println(INPUT_HOW_MUCH_MONEY);
    }

    public static void errorHowMuchMoney() {
        System.out.println(ERROR_HOW_MUCH_MONEY);
    }

    public static void errorUnit() {
        System.out.println(ERROR_UNIT);
    }
}
