import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        //input data
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        int[] numbers = new int[numberOfCases];
        for (int i = 0; i < numberOfCases; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.close();


    }
}
