package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class OpenTheLock {

    static int[] fromStringToDigitsArray(String value) { // breaks string into the array of ints
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

    /*static int[] fromStringArrayToIntArray(String[] value) {
        int[] result = new int[value.length];

        for (int i = 0; i < value.length; i++) {
            result[i] = Integer.parseInt(value[i]);
        }
        return result;
    }*/

    static String fromDigitsArrayToString(int[] numbers) {
        return Arrays.toString(numbers).replaceAll(", |\\[|]", "");
    }

    static String[] locksShortWay(String target, int numberOfSteps) {
        String[] digits = new String[4];
        int[] numbers = fromStringToDigitsArray(target);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                continue;
            } else if (numbers[i] >= 10 - numberOfSteps) {
                numbers[i] = 0;
            } else if (numbers[i] < 4) {
                numbers[i] = numbers[i] - numberOfSteps;
            } else {
                numbers[i] = numbers[i] + numberOfSteps;
            }
            digits[i] = fromDigitsArrayToString(numbers);
            numbers[i] = fromStringToDigitsArray(target)[i];
        }

        return digits;
    }

    static String[] locksLongWay(String target, int numberOfSteps) {
        String[] digits = new String[4];
        int[] numbers = fromStringToDigitsArray(target);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 10 + numberOfSteps) {
                numbers[i] = 0;
            } else if (numbers[i] < 4) {
                numbers[i] = numbers[i] + numberOfSteps;
            } else {
                numbers[i] = numbers[i] - numberOfSteps;
            }
            digits[i] = fromDigitsArrayToString(numbers);
            numbers[i] = fromStringToDigitsArray(target)[i];
        }

        return digits;
    }

    static HashSet<String> blocksOneMoveAway(String target){
        HashSet<String> result = new HashSet<>(Arrays.asList(locksShortWay(target, 1)));
        result.addAll(Arrays.asList(locksLongWay(target, 1)));
        result.remove(null);

        return result;
    }

    static HashSet<String> blocksTwoMovesAway(String target){
        HashSet<String> result = new HashSet<>();

        int[] targetDigits = fromStringToDigitsArray(target);
        String[] twoStepsLimits = new String[8];

        for (int i=0; i < 4; i++){
            twoStepsLimits[i] = locksShortWay(target, 2)[i];
            twoStepsLimits[i+4] = locksLongWay(target, 2)[i];
        }

        for(String s:twoStepsLimits){
            System.out.println(s);
        }

        result.remove(null);
        return result;
    }
    /*static String[] bottomLine(String target, int numberOfSteps) {
        String[] blockingDigits = new String[4];
        int[] numbers = fromStringToDigitsArray(target);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                continue;
            } else {
                numbers[i] = numbers[i] - numberOfSteps;
            }
            blockingDigits[i] = fromDigitsArrayToString(numbers);
            numbers[i] = fromStringToDigitsArray(target)[i];
        }
        return blockingDigits;
    }*/

    /*static String[] topLine(String target, int numberOfSteps) {
        String[] blockingDigits = new String[4];
        int[] numbers = fromStringToDigitsArray(target);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                continue;
            } else {
                numbers[i] = numbers[i] + numberOfSteps;
            }
            blockingDigits[i] = fromDigitsArrayToString(numbers);
            numbers[i] = fromStringToDigitsArray(target)[i];
        }
        return blockingDigits;
    }*/

    /*static HashSet<String> lines(String target, int numberOfSteps) { // generates HashSet of values that are away from target
        HashSet<String> result = new HashSet<>(Arrays.asList(bottomLine(target, numberOfSteps)));
        result.addAll(Arrays.asList(topLine(target, numberOfSteps)));
        result.remove(null);

        return result;
    }*/

    /*static HashSet<String> blocksTwoMoves(String target, int numberOfSteps) { // generates HashSet of values that 2 steps away from target

        HashSet<String> result = new HashSet<>();

        int[] axisX = new int[8];
        int[] axisY = new int[8];
        int step = 1;
        int[] plusRow = new int[32];
        int[] minusRow = new int[32];

        for (int i = 0; i < 4; i++) {
            axisX[i] = Integer.parseInt(topLine(target, numberOfSteps - 1)[i]);
            axisX[i+4]= Integer.parseInt(bottomLine(target, numberOfSteps - 1)[i]);
            axisY[i] = Integer.parseInt(topLine(target, numberOfSteps)[i]);
            axisY[i+4]= Integer.parseInt(bottomLine(target, numberOfSteps)[i]);
        }

        *//*for(int i: axisX){
            System.out.println(i);
        }*//*
        for (int i = 0; i < axisX.length; i++) {
            if(i<4){
                plusRow[i]=axisX[i]+step;
                result.add(""+plusRow[i]);
                plusRow[i+16]=axisX[i]-step;
                result.add(""+plusRow[i+16]);
                plusRow[i+4]=axisX[i]+step*10;
                result.add(""+plusRow[i+4]);
                plusRow[i+20]=axisX[i]-step*10;
                result.add(""+plusRow[i+20]);
                plusRow[i+8]=axisX[i]+step*100;
                result.add(""+plusRow[i+8]);
                plusRow[i+24]=axisX[i]-step*100;
                result.add(""+plusRow[i+24]);
            } else{
                minusRow[i]=axisX[i]-step;
                result.add(""+minusRow[i]);
                minusRow[i+16]=axisX[i]+step;
                result.add(""+minusRow[i+16]);
                minusRow[i+4]=axisX[i]-step*10;
                result.add(""+minusRow[i+4]);
                minusRow[i+20]=axisX[i]+step*10;
                result.add(""+minusRow[i+20]);
                minusRow[i+8]=axisX[i]-step*100;
                result.add(""+minusRow[i+8]);
                minusRow[i+24]=axisX[i]+step*100;
                result.add(""+minusRow[i+24]);
            }
        }

        result.addAll(lines(target,2));
        result.remove(target);
        return result;
    }*/

    public static int movesToOpenLock(String[] deadends, String target) {
        HashSet<String> setOfDeadends = new HashSet<>(Arrays.asList(deadends));
        if (/*setOfDeadends.containsAll(lines(target, 1)) || setOfDeadends.containsAll(blocksTwoMoves(target, 2))||*/ setOfDeadends.contains("0000")) {
            return -1;
        } else if (setOfDeadends.containsAll(Arrays.asList(locksShortWay(target, 1)))) {
            return numberOfSteps(target) + 2;
        } else {
            return numberOfSteps(target);
        }
    }

    public static void main(String[] args) {

        /*String target = "5555";
        String[] deadends = {"5557", "5553", "5575", "5535", "5755", "5355", "7555", "3555", "6655", "6455", "4655", "4455", "5665", "5445", "5645", "5465", "5566", "5544", "5564", "5546", "6565", "4545", "6545", "4565", "5656", "5454", "5654", "5456", "6556", "4554", "4556", "6554"};

        System.out.println(movesToOpenLock(deadends, target));*/

        /*for (String s : blocksTwoMoves("5555", 2)) {
            System.out.println(s);
        }*/

        for(String s: blocksTwoMovesAway("5555")){
            System.out.println(s);
        }
        System.out.println("=========================");

        /*for(String s: blocksOneMoveAway("5555")){
            System.out.println(s);
        }
        System.out.println("=========================");*/

        /*for(String s:topLine("8898", 1)){
            System.out.println(s);
        }*/
        /*for(String s:bottomLine("0011", 1)){
            System.out.println(s);
        }*/

        /*for(String s:bottomLine("5555", 2)){
            System.out.println(s);
        }*/

    }
}
