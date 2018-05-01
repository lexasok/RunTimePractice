import java.util.ArrayList;
import java.util.HashMap;

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
        int[] sums = new int[chars.length];
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (!map.containsKey(currentChar)) {
                map.put(currentChar, 1);
            } else {
                int currentSum = map.get(currentChar);
                map.put(currentChar, currentSum + 1);
            }
        }

        for (int i = 0; i < chars.length; i++) {
            int sum;
            if (!map.containsKey(chars[i])) {
                sums[i] = 0;
            } else {
                sums[i] = map.get(chars[i]);
            }
        }

        return sums;
    }


    public static void main(String[] args) {



        //data
        char[] chars = {'a', 'b', 'f', 'z', ' ', 'r', 'm', 'u', 'q'};
        String str = "asfdsadboihasdfasdasdsfasdaswlkdsnasdo" +
                "dsadboihasdfasdasdsfasdaswlkdsnasdodsadboihasdfasdasdsfasdaswlkdsnasdo" +
                "dsadboihasdfasdasdsfasdaswlkdsnasdodsadb oihasdfasdasdsfasdaswlkdsnasdo" +
                "dsadboihasdfasdasdsfasdaswlkdsnasdodsadbo ihasdfasdasdsfasdaswlkdsnasdo" +
                "dsadboihasdfasdasdsfasdaswlkdsnasdodsadboihasdfasdasdsfasdaswlkdsnasdo" +
                "dsadboihasdfasdasdsfasdaswlkdsnasdodsadboihasdfasdasdsfasdaswlkdsnasdo" +
                "dsadboihasdfasdasds fasdaswlkdsnasdodsadboihasdfasdasdsfasdaswlkdsnasdo" +
                "pqejmsdfv;cvmnsdf[p;wefjdsv.;msdfgsdfg;sdf owerfjwefroqwrqweqweqweqwww" +
                "pqejmsdfv;cvmnsdf[p;wefjdsv.;msdafgsdfg;sdfowerfjwefroqwrqweqweqweqwww" +
                "pqejmsdfv;cvmnsdf[p;wefjdsv.;msdfgsdfg;sdfowerfjwefroqwrqweqweqweqwww" +
                "pqejmsdfv;cvmnsdf[p;wefjdsv.;msdfgsdfg;sdfowerfjwefroqwrqweqweqweqwww" +
                "pqejmsdfv;cvmnsdf[p;wefjdsv.;msdfgsdfg;sdfowerfjwefroqwrqweqweqweqwww" +
                "pqejmsdfv;cvmnsdf[p;wefjdsv.;msdfgsdfg;sdfowerfjwefroqwrqweqweqweqwww" +
                "pqejmsdfv;cvmnsdf[p;wefjdsv.;msdfgsdfg;sdfowerfjwefroqwrqweqweqweqwww" +
                "pqejmsdfv;cvmnsdf[p;wefjdsv.;msdfgsdfg;sdfowerfjwefroqwrqweqweqweqwwwn";

        //V1 method
        System.out.println("V1 method");

        //Time fixing
        long startTime = System.currentTimeMillis();

        //method
        int[] repetitions = findNumberOfArrayRepetitions(str, chars);

        //print values
        for (int i = 0; i < repetitions.length; i ++) {
            System.out.print(repetitions[i] + " ");
        }

        //time fixing
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("\nTest " + duration + " ms");

        //V2 method
        System.out.println("\nV2 method");

        //Time fixing
        startTime = System.currentTimeMillis();

        //method
        repetitions = findNumberOfArrayRepetitionsV2(str, chars);

        //print values
        for (int i = 0; i < repetitions.length; i ++) {
            System.out.print(repetitions[i] + " ");
        }

        //time fixing
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("\nTest " + duration + " ms");
    }
}
