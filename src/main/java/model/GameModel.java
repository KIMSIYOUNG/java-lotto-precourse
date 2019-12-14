package model;

import java.util.ArrayList;
import java.util.List;

import domain.Lotto;
import domain.LottoFactory;
import io.PrintHandler;

public class GameModel {
    private final List<Lotto> lottoList = new ArrayList<>();

    public GameModel(int howManyBuyLotto) {
        for(int i=0; i<howManyBuyLotto; i++){
            lottoList.add(LottoFactory.create());
        }
        PrintHandler.printLottoList(lottoList);
    }

    public static void startGame() {

    }
}
