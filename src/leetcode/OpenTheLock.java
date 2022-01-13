package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class OpenTheLock {

    static int[] fromStringToDigits(String value) {
        int[] digits = {0, 0, 0, 0};
        int valueInt = Integer.parseInt(value);

        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = valueInt % 10;
            valueInt = valueInt / 10;
        }

        return digits;
    }

    static int numberOfSteps(String target) {
        int count = 0;
        for (int i : fromStringToDigits(target)) {
            if (i <= 4) {
                count += i;
            } else {
                count += 10 - i;
            }
        }
        return count;
    }

    static HashSet<String> locks(String target) {
        String[] digits = new String[4];
        int[] numbers = fromStringToDigits(target);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                continue;
            } else if (numbers[i] == 9) {
                numbers[i] = 0;
            } else if (numbers[i] < 4) {
                numbers[i] = numbers[i] - 1;
            } else {
                numbers[i] = numbers[i] + 1;
            }
            digits[i] = Arrays.toString(numbers).replaceAll(", |\\[|]", "");
            numbers[i] = fromStringToDigits(target)[i];
        }
        HashSet<String> result = new HashSet<>(Arrays.asList(digits));
        result.remove(null);
        return result;
    }

    static HashSet<String> blocks(String target) {
        String[] digits = new String[8];
        int[] numbers = fromStringToDigits(target);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                continue;
            } else if (numbers[i] == 9) {
                numbers[i] = 8;
            } else if (numbers[i] < 4) {
                numbers[i] = numbers[i] + 1;
            } else {
                numbers[i] = numbers[i] - 1;
            }
            digits[i] = Arrays.toString(numbers).replaceAll(", |\\[|]", "");
            numbers[i] = fromStringToDigits(target)[i];
        }

        HashSet<String> result = new HashSet<>(Arrays.asList(digits));
        result.addAll(locks(target));
        result.remove(null);
        return result;
    }

    public static int movesToOpenLock(String[] deadends, String target) {
        HashSet<String> setOfDeadends = new HashSet<>(Arrays.asList(deadends));
        if (setOfDeadends.containsAll(blocks(target))||setOfDeadends.contains("0000")) {
            return -1;
        } else if (setOfDeadends.containsAll(locks(target))) {
            return numberOfSteps(target) + 2;
        } else {
            return numberOfSteps(target);
        }
    }

    public static void main(String[] args) {

        String target = "5555";
        String[] deadends = {"5557","5553","5575","5535","5755","5355","7555","3555","6655","6455","4655","4455","5665","5445","5645","5465","5566","5544","5564","5546","6565","4545","6545","4565","5656","5454","5654","5456","6556","4554","4556","6554"};

        System.out.println(movesToOpenLock(deadends, target));


    }
}
