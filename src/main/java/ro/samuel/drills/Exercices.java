package ro.samuel.drills;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    public ArrayList<Integer> findPrimeNumbers(ArrayList<Integer> nr) {
        ArrayList<Integer> prime = new ArrayList<>();
        for (int i = 0; i < nr.size(); i++) {
            for (int j = 2; j < nr.get(i); j++) {
                if (nr.get(i) % j > 0) {
                    prime.add(nr.get(i));
                }
            }

        }
        return prime;
    }

}
