package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {
    private static final BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
    private static final int LOTTO_EACH_PRICE = 1000;
    private static final int ZERO = 0;

    public int howManyBuyLotto() throws IOException {
        PrintHandler.inputHowMuchMoney();
        try {
            return checkAndMakeMoneyToHowMany(Integer.parseInt(BR.readLine().trim()));
        }catch (NumberFormatException e){
            PrintHandler.errorHowMuchMoney();
            return howManyBuyLotto();
        }
    }

    private int checkAndMakeMoneyToHowMany(int parseInt) throws IOException {
        if(parseInt % LOTTO_EACH_PRICE != ZERO){
            PrintHandler.errorUnit();
            return howManyBuyLotto();
        }
        return parseInt / LOTTO_EACH_PRICE;
    }

}
