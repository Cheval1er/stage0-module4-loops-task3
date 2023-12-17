package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int num1 = 0, num2 = 1;
        for (int i =0; i<lastFibonacci; i++){
            System.out.println(num1);
            int sum = num1+num2;
            num1=num2;
            num2=sum;

        }
    }
}
