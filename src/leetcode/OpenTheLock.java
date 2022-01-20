package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class OpenTheLock {

    static int[] fromStringToDigitsArray(String value) {
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
        for (int i : fromStringToDigitsArray(target)) {
            if (i <= 4) {
                count += i;
            } else {
                count += 10 - i;
            }
        }
        return count;
    }

    static String fromDigitsArrayToString(int[] numbers) {
        return Arrays.toString(numbers).replaceAll(", |\\[|]", "");
    }

    static HashSet<String> locksShortWay(String target) {
        String[] digits = new String[4];
        int[] numbers = fromStringToDigitsArray(target);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                continue;
            } else if (numbers[i] >= 9) {
                numbers[i] = 0;
            } else if (numbers[i] < 4) {
                numbers[i] = numbers[i] - 1;
            } else {
                numbers[i] = numbers[i] + 1;
            }
            digits[i] = fromDigitsArrayToString(numbers);
            numbers[i] = fromStringToDigitsArray(target)[i];
        }

        HashSet<String> result = new HashSet<>(Arrays.asList(digits));
        result.remove(null);

        return result;
    }

    static HashSet<String> locksLongWay(String target) {
        String[] digits = new String[4];
        int[] numbers = fromStringToDigitsArray(target);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 10) {
                numbers[i] = 0;
            } else if (numbers[i] < 4) {
                numbers[i] = numbers[i] + 1;
            } else {
                numbers[i] = numbers[i] - 1;
            }
            digits[i] = fromDigitsArrayToString(numbers);
            numbers[i] = fromStringToDigitsArray(target)[i];
        }

        HashSet<String> result = new HashSet<>(Arrays.asList(digits));
        result.remove(null);

        return result;
    }

    static HashSet<String> blocksOneMoveAway(String target) {
        HashSet<String> result = new HashSet<>(locksShortWay(target));
        result.addAll(locksLongWay(target));
        result.remove(null);

        return result;
    }

    static HashSet<String> blocksTwoMovesAway(String target) {
        HashSet<String> result = new HashSet<>();

        for (String s : blocksOneMoveAway(target)) {
            result.addAll(blocksOneMoveAway(s));
        }

        result.remove(null);
        result.remove(target);
        return result;
    }

    public static int movesToOpenLock(String[] deadends, String target) {
        HashSet<String> setOfDeadends = new HashSet<>(Arrays.asList(deadends));
        if (setOfDeadends.containsAll(blocksOneMoveAway(target)) || setOfDeadends.containsAll(blocksTwoMovesAway(target)) || setOfDeadends.contains("0000")) {
            return -1;
        } else if (setOfDeadends.containsAll(locksShortWay(target))) {
            return numberOfSteps(target) + 2;
        } else {
            return numberOfSteps(target);
        }
    }

    public static void main(String[] args) {

        String target = "0202";
        String[] deadends = {"1000","0100","0010","0001","9000","0900","0090","0009"};

        System.out.println(movesToOpenLock(deadends, target));

    }
}
