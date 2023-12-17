package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if (first == 0 && second == 0) {
            System.out.println("Undefined GCD: Both numbers are zero.");
        } else if (first == 0 || second == 0) {

            int gcd = (first == 0) ? second : first;
            System.out.println( gcd);
        } else {
            int div = 1;
            int smaller = Math.min(first, second);
            for (int i = 2; i <= smaller; i++) {
                if (first % i == 0 && second % i == 0) {
                    div = i;
                }
            }
            System.out.println(div);
        }

    }
}