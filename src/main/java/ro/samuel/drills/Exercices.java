package ro.samuel.drills;

import java.util.ArrayList;
import java.util.List;

public class Exercices {
    public Integer getMaxNo(ArrayList<Integer> numbers) {
        Integer maxNo = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > maxNo) {
                maxNo = numbers.get(i);
            }
        }
        return maxNo;
    }

    public boolean listContainsNumber(List<Integer> numbers, int nr) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == nr) {
                return true;
            }
        }
        return false;
    }

    public boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;

    }
}
