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

    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            return (cigars >= 40);
        } else {
            return (cigars >= 40 && cigars <= 60);
        }
    }

    public boolean catDog(String str) {
        int countD = 0;
        int countC = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("dog")) {
                countD++;
            }
            if (str.substring(i, i + 3).equals("cat")) {
                countC++;
            }
        }
        return countD == countC;
    }

    public String zipZap(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                answer = answer + "zp";
                i = i + 2;
            } else {
                answer = answer + str.charAt(i);
            }
        }
        return answer;
    }
}
