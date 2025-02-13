package domain;

import java.util.List;

/**
 * 로또 한장을 의미하는 객체
 */
public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        this.numbers = numbers;
    }

    // 추가 기능 구현

    public List<Integer> getNumbers() {
        return numbers;
    }

    @Override
    public String toString(){
        String result = String.join(",", String.valueOf(numbers));
        return result;
    }
}
