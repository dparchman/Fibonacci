
public class FibonacciLikeRecursive implements FibonacciLike, Runnable{
    private int amountOfNumbers;
    private int number1;
    private int number2;

    public FibonacciLikeRecursive(int amountOfNumbers, int number1, int number2) {
        this.amountOfNumbers = amountOfNumbers;
        this.number1 = number1;
        this.number2 = number2;
    }

    private void printFib(int num, int a, int b) {
        if (num == 0) {
            return;
        }
        System.out.print(a + " ");
        printFib(num - 1, b, a + b);
    }

    public void run() {
        System.out.print("Fibonacci-like sequence:");
        printFib(amountOfNumbers, number1, number2);
        System.out.println();
    }

    public void calculate() {
    }
}