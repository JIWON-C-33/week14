import java.util.*;

public class Lotto {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 45; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);
        List<Integer> lottoNumbers = numbers.subList(0, 6);
        Collections.sort(lottoNumbers);
        System.out.println("로또 번호: " + lottoNumbers);

        Collections.shuffle(numbers);
        List<Integer> lottoNumbers2 = numbers.subList(0, 1);
        Collections.sort(lottoNumbers2);
        System.out.println("보너스 번호: " + lottoNumbers2);
    }
}
