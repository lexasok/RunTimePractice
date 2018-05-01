

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

    public static int findNumberOfArrayRepetitions(String str, char[] charArray) {
        int sum = 0;
        return sum;
    }


    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        System.out.println(findNumberOfRepetitions("abcdefffgffssss", 'f'));

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Test " + duration + " ms");
    }
}
