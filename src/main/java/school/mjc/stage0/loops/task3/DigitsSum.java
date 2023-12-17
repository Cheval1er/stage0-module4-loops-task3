package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int number) {

        String numberString = Integer.toString(Math.abs(number));


        int sum = 0;

        for (int i = 0; i < numberString.length(); i++) {

            sum += Character.getNumericValue(numberString.charAt(i));
        }


        if (number < 0) {
            sum = sum;
        }


        System.out.println( sum);
    }
}
