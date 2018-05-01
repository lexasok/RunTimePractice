

public class RunTimePractice {

    public static int findNumberOfRepeticions(String str, char ch) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                sum++;
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        System.out.println(findNumberOfRepeticions("abca", 'a'));


        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Test " + duration + " ms");
    }
}
