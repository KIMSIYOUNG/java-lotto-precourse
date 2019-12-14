package domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LottoFactory {
    private static final int LOTTO_AMOUNT = 6;
    private static final int START_FROM = 1;
    private static final int LottoSUM = 45;
    private static final Set<Integer> setNotForDuplication = new HashSet<>();

    public static Lotto create(){
        List<Integer> lotto = new ArrayList<>();
        for(int i = 0; i<LOTTO_AMOUNT; i++){
            lotto.add(makeRandomNumberWithOutDuplication());
        }
        return new Lotto(lotto);
    }

    private static Integer makeRandomNumberWithOutDuplication() {
        int randomNumber = (int) (Math.random() * LottoSUM + START_FROM);
        if(setNotForDuplication.contains(randomNumber))
            return makeRandomNumberWithOutDuplication();
        return randomNumber;
    }
}
