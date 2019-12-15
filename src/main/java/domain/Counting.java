package domain;

public class Counting {
    private static final String NEXT_LINE = "\n";
    private static int fifth = 0;
    private static int fourth = 0;
    private static int third = 0;
    private static int second = 0;
    private static int first = 0;
    private static int totalWinning = 0;

    public static int getTotalWinning() {
        return totalWinning;
    }

    public static void compareWith(Rank rank, String level) {
        if (level.equals("FIFTH")) {
            fifth++;
            totalWinning += rank.getWinningMoney();
        }
        if (level.equals("FOURTH")) {
            fourth++;
            totalWinning += rank.getWinningMoney();
        }
        if (level.equals("THIRD")) {
            third++;
            totalWinning += rank.getWinningMoney();
        }
        if (level.equals("SECOND")) {
            second++;
            totalWinning += rank.getWinningMoney();
        }
        if (level.equals("FIRST")) {
            first++;
            totalWinning += rank.getWinningMoney();
        }
    }

    public static String getResult() {
        return "3개 일치 : (" + Rank.FIFTH.getWinningMoney() + ")" + fifth + "개" +NEXT_LINE
                + "4개 일치 : (" + Rank.FOURTH.getWinningMoney() + ")" + fourth + "개"+NEXT_LINE
                + "5개 일치 : (" + Rank.THIRD.getWinningMoney() + ")" + third + "개"+NEXT_LINE
                + "5개 일치 + 보너스 일치 : (" + Rank.SECOND.getWinningMoney() + ")" + second + "개"+NEXT_LINE
                + "6개 일치 : (" + Rank.FIRST.getWinningMoney() + ")" + first + "개";
    }
}
