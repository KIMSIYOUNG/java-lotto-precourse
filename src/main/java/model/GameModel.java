package model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import domain.Lotto;
import domain.LottoFactory;
import domain.WinningLotto;
import io.PrintHandler;
import io.UserInput;

public class GameModel {
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
        setResult();
    }

    private void setResult() {

    }

    private List<Integer> stringListToIntegerList(List<String> winningNumbers) {
        List<Integer> list = new ArrayList<>();
        for(String number : winningNumbers){
            list.add(Integer.parseInt(number));
        }
        return list;
    }
}
