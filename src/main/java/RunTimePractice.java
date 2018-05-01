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
                    sums[j] = sums[j] + 1;
                }
            }
        }

        return sums;
    }

    public static int[] findNumberOfArrayRepetitionsV2(String str, char[] chars) {
        return null;
    }


    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        char[] chars = {'a', 'b', 'f'};
        int[] repetitions = findNumberOfArrayRepetitions("asfdsadboihasdfasdasdsfasdaswlkdsnasdo" +
                "dsadboihasdfasdasdsfasdaswlkdsnasdodsadboihasdfasdasdsfasdaswlkdsnasdo" +
                "dsadboihasdfasdasdsfasdaswlkdsnasdodsadboihasdfasdasdsfasdaswlkdsnasdo" +
                "dsadboihasdfasdasdsfasdaswlkdsnasdodsadboihasdfasdasdsfasdaswlkdsnasdo" +
                "dsadboihasdfasdasdsfasdaswlkdsnasdodsadboihasdfasdasdsfasdaswlkdsnasdo" +
                "dsadboihasdfasdasdsfasdaswlkdsnasdodsadboihasdfasdasdsfasdaswlkdsnasdo" +
                "dsadboihasdfasdasdsfasdaswlkdsnasdodsadboihasdfasdasdsfasdaswlkdsnasdo" +
                "pqejmsdfv;cvmnsdf[p;wefjdsv.;msdfgsdfg;sdfowerfjwefroqwrqweqweqweqwww" +
                "pqejmsdfv;cvmnsdf[p;wefjdsv.;msdafgsdfg;sdfowerfjwefroqwrqweqweqweqwww" +
                "pqejmsdfv;cvmnsdf[p;wefjdsv.;msdfgsdfg;sdfowerfjwefroqwrqweqweqweqwww" +
                "pqejmsdfv;cvmnsdf[p;wefjdsv.;msdfgsdfg;sdfowerfjwefroqwrqweqweqweqwww" +
                "pqejmsdfv;cvmnsdf[p;wefjdsv.;msdfgsdfg;sdfowerfjwefroqwrqweqweqweqwww" +
                "pqejmsdfv;cvmnsdf[p;wefjdsv.;msdfgsdfg;sdfowerfjwefroqwrqweqweqweqwww" +
                "pqejmsdfv;cvmnsdf[p;wefjdsv.;msdfgsdfg;sdfowerfjwefroqwrqweqweqweqwww" +
                "pqejmsdfv;cvmnsdf[p;wefjdsv.;msdfgsdfg;sdfowerfjwefroqwrqweqweqweqwwwn", chars);

        for (int i = 0; i < repetitions.length; i ++) {
            System.out.print(repetitions[i] + " ");
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("\nTest " + duration + " ms");
    }
}
