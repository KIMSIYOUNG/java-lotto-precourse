package model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import domain.*;
import io.PrintHandler;
import io.UserInput;

public class GameModel {
    private static final int LOTTO_EACH_MONEY = 1000;
    private final List<Lotto> lottoList = new ArrayList<>();
    private WinningLotto winningLotto;


    public GameModel(int howManyBuyLotto) {
        for(int i=0; i<howManyBuyLotto; i++){
            lottoList.add(LottoFactory.create());
        }
        PrintHandler.printLottoList(lottoList);
    }

    public void play() throws IOException {
        UserInput userInput = new UserInput();
        List<Integer> winningNumbers = stringListToIntegerList(userInput.inputWinningNumbers());
        int bonusNumber = userInput.inputBonusNumber();
        winningLotto = new WinningLotto(new Lotto(winningNumbers),bonusNumber);
        PrintHandler.printWinningResult();
        setResult();
    }

    private void setResult() {
        for (Lotto lotto : lottoList){
            Rank result = winningLotto.match(lotto);
            Counting.compareWith(result,result.name());
        }
        PrintHandler.printResult(lottoList.size() * LOTTO_EACH_MONEY);
    }

    private List<Integer> stringListToIntegerList(List<String> winningNumbers) {
        List<Integer> list = new ArrayList<>();
        for(String number : winningNumbers){
            list.add(Integer.parseInt(number));
        }
        return list;
    }
}
