package domain;

/**
 * 당첨 번호를 담당하는 객체
 */
public class WinningLotto {
    private final Lotto lotto;
    private final int bonusNo;

    public WinningLotto(Lotto lotto, int bonusNo) {
        this.lotto = lotto;
        this.bonusNo = bonusNo;
    }

    public Rank match(Lotto userLotto) {
        int count = 0;
        // TODO 로직 구현
        for(int i=0;i <lotto.getNumbers().size(); i++){
            if(userLotto.getNumbers().contains(lotto.getNumbers().get(i))){
                count ++;
            }
        }
        if(count == 5 && userLotto.getNumbers().contains(bonusNo)){
            return Rank.valueOf(count, true);
        }
        return Rank.valueOf(count, false);
    }
}
