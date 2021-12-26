package leetcode;

public class JewelsAndStones {

    public int numJewelsInStones(String jewels, String stones) {
        int numJewelsInStones = 0;
        char charsToGet[] = jewels.toCharArray();
        char poolOfChars[] = stones.toCharArray();


        for (int i = 0; i < charsToGet.length; i++) {
            for (int j = 0; j < poolOfChars.length; j++) {
                if (charsToGet[i] == poolOfChars[j]) {
                    numJewelsInStones++;
                }
            }
        }
        return numJewelsInStones;
    }

    public static void main(String[] args) {
        JewelsAndStones js = new JewelsAndStones();

        System.out.println(js.numJewelsInStones("Zz", "aAAZbbZbb"));
    }
}
