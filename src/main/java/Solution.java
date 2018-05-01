import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        for (int i = 0; i < numberOfCases; i++) {
            int number = sc.nextInt();
            if (number == 0 || number == 1 || number == 2 || number == 3) {
                System.out.println("Prime");
                continue;
            } else {
                for (int j = 2; j < number/2; j++) {
                    if (number % j == 0 ) {
                        System.out.println("Not prime");
                        break;
                    }
                    System.out.println("Prime");
                }
            }

        }
        sc.close();


    }
}
