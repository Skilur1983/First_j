package zaur.lesson3;

public class LogicOperations {

    public static void main(String[] args) {
        int i1 = 3;
        int i2 = i1;

        boolean b1 = i1 == i2++; // 3 == 3 => true
        boolean b2 = i1++ < i2--; // 3 < 4 => true
        boolean b3 = ++i1 > i2; // 5 > 3 => true

        System.out.println(b1 + ", " + b2+ ", " + b3);

        // && - "and" - if any boolean is false, the condition is false
        // || - "or" - if any boolean is true, the condition is true
        System.out.println("And and Or conditions: ");
        boolean and = b1&&b2&b3;
        boolean or = b1||b2||b3;
        System.out.println(and + ", " + or); // true, true

        b2 = false;
        and = b1&&b2&b3;
        or = b1||b2||b3;
        System.out.println(and + ", " +  or); // false, true

        b1 = b3 = false;
        and = b1&&b2&b3;
        or = b1||b2||b3;
        System.out.println(and + ", " + or); // false , false

        // "&&" and "||" do lazy calculations
        boolean lazy = i1 == i2 && ++i1 > i2; // as the first condition is false, the second isn't taken into consideration
        System.out.println(lazy + ", " + "i1 = " + i1 + ", " + "i2 = " + i2); // false, i1 = 5, i2 = 3

        lazy = i1 > i2 || ++i1 == i2; // as the first condition is true, the second isn't taken into consideration
        System.out.println(lazy + ", " + "i1 = " + i1 + ", " + "i2 = " + i2); // true, i1 = 5, i2 = 3

        // "&" and "|" run all conditions
        boolean notLazy = i1 == i2 & ++i1 > i2; // nevertheless, the 1st condition is false, all conditions will be checked
        System.out.println(notLazy + ", " + "i1 = " + i1 + ", " + "i2 = " + i2); // false, i1 = 6, i2 = 3

        notLazy = i1 > i2 | ++i1 == i2; // nevertheless, the 1st condition is true, all conditions will be checked
        System.out.println(notLazy + ", " + "i1 = " + i1 + ", " + "i2 = " + i2); // true, i1 = 7, i2 = 3

        // "&" and "|" can work with numbers as binary comparison
        System.out.println(i1 & i2); // 111 and 011, we compare 1s with 0s in each place and if there is 0, result 0, only in case both 1, then it's 1. In this case, result will be 011 => 3 from binary to decimal
        System.out.println(i1 | i2); // 111 and 011, we compare 1s with 0s in each place and if there is 1, result 1, only in case both 0, then it's 0. In this case, result will be = 111 => 7 from binary to decimal

        // XOR - "^" is used for this operation
        System.out.println("XOR start condition: " + b1 + ", " + b2+ ", " + b3);
        // XOR returns true if binary sum ends with 1, otherwise - false;

        System.out.println(b1^b2^b3); // 0+0+0 = 0 - false
        b1 = true;
        System.out.println(b1^b2^b3); // 1+0+0 = 1 - true
        b2 = true;
        System.out.println(b1^b2^b3); // 1+1+0 = 10 - false
        b3 = true;
        System.out.println(b1^b2^b3); // 1+1+1 = 11 - true
    }
}
