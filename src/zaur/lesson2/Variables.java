package zaur.lesson2;

public class Variables {

    public static void main(String[] args) {

        char c1 = 7; // chars can be set by char number in decimal
        char c2 = '7'; // as the value itself
        char c3 = '\u0007'; // in hexadecimal

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        int i1 = 60; // decimal
        int i2 = 0B111100; // binary
        int i3 = 0b111100; // binary
        int i4 = 074; // octal
        int i5 = 0x3C; // hexadecimal
        int i6 = 0x3c; // hexadecimal

        System.out.println(i1); // 60
        System.out.println(i2); // 60
        System.out.println(i3); // 60
        System.out.println(i4); // 60
        System.out.println(i5); // 60
        System.out.println(i6); // 60

        int underScore = 1_00___________000; // '_' can be used for underlining and won't be taking into consideration while calculation
        System.out.println(underScore); // 10000
    }
}
