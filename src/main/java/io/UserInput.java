package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import domain.WinningLotto;

public class UserInput {
    private static final BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
    private static final int LOTTO_EACH_PRICE = 1000;
    private static final int ZERO = 0;
    private static final String COMMA = ",";
    private static final Integer LOTTO_MAX_NUMBER = 45;
    private static final Integer LOTTO_MIN_NUMBER = 1;

    public int howManyBuyLotto() throws IOException {
        PrintHandler.inputHowMuchMoney();
        try {
            return checkAndMakeMoneyToHowMany(Integer.parseInt(BR.readLine().trim()));
        }catch (NumberFormatException e){
            PrintHandler.errorHowMuchMoney();
            return howManyBuyLotto();
        }
    }

    private int checkAndMakeMoneyToHowMany(int userMoney) throws IOException {
        if(userMoney % LOTTO_EACH_PRICE != ZERO){
            PrintHandler.errorUnit();
            return howManyBuyLotto();
        }
        return userMoney / LOTTO_EACH_PRICE;
    }

    public List<String> inputWinningNumbers() throws IOException {
        PrintHandler.inputWinningNumbers();
        List<String> winningNumbers = Arrays.asList(BR.readLine().trim().split(COMMA));
        if(checkFormatOk(winningNumbers) && checkEachNumberOk(winningNumbers)){
            return winningNumbers;
        }
        PrintHandler.errorWinningNumber();
        return inputWinningNumbers();
    }

    private boolean checkFormatOk(List<String> winningNumbers) {
        try {
            winningNumbers.stream().map(Integer::parseInt);
        } catch (Exception e) {
            PrintHandler.errorFormat();
            return false;
        }
        return true;
    }
    private boolean checkEachNumberOk(List<String> winningNumbers) {
        if(checkDuplicatedOk(winningNumbers) && !checkNumberRangeOk(winningNumbers)){
            return true;
        }
        return false;
    }

    private boolean checkNumberRangeOk(List<String> winningNumbers) {
        return !(winningNumbers.stream()
                .map(Integer::parseInt)
                .map(s->s<=LOTTO_MAX_NUMBER && s >=LOTTO_MIN_NUMBER)
                .collect(Collectors.toList())
                .contains(false));
    }

    private boolean checkDuplicatedOk(List<String> winningNumbers) {
        return new HashSet<>(winningNumbers).size() == winningNumbers.size();
    }

    public int inputBonusNumber() throws IOException {
        PrintHandler.inputBonusNumber();
        try{
            return checkOneNumberRange(Integer.parseInt(BR.readLine().trim()));
        } catch (NumberFormatException e){
            PrintHandler.errorFormat();
            return inputBonusNumber();
        }
    }

    private int checkOneNumberRange(int parseInt) throws IOException {
        if(parseInt <= LOTTO_MAX_NUMBER && parseInt >= LOTTO_MIN_NUMBER)
            return parseInt;
        PrintHandler.errorRange();
        return inputBonusNumber();
    }
}
