package ro.samuel.drills;

import java.util.ArrayList;

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
}
