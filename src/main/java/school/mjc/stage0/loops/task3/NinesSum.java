package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        long sum = 0;
        long currentTerm = 9;

        for (int i = 1; i <= lengthOfLastNumber; i++) {
            sum += currentTerm;
            currentTerm = currentTerm * 10 + 9;
        }

        System.out.println(sum);
    }
}
