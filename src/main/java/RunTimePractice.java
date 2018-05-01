import java.util.ArrayList;

public class RunTimePractice {

    public static int findNumberOfRepetitions(String str, char ch) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                sum++;
            }
        }
        return sum;
    }

    public static int[] findNumberOfArrayRepetitions(String str, char[] charArray) {
        int[] sums = new int[charArray.length];

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < charArray.length; j++) {
                if (str.charAt(i) == charArray[j]) {
                    sums[i]++;
                }
            }
        }

        return sums;
    }


    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        System.out.println(findNumberOfRepetitions("abcdefffgffssss", 'f'));

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Test " + duration + " ms");
    }
}
