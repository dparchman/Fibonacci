public class Main {

    private int number;


    public static void main(String[] args) throws InterruptedException {
        FibonacciLikeRecursive FibSequence1 = new FibonacciLikeRecursive(10,0,1);
        Thread thread1 = new Thread(FibSequence1);
        thread1.start();

        Thread.sleep(10);
        FibonacciLikeRecursive FibSequence2 = new FibonacciLikeRecursive(10,3,5);
        Thread thread2 = new Thread(FibSequence2);
        thread2.start();

        Thread.sleep(10);
        FibonacciLikeRecursive FibSequence3 = new FibonacciLikeRecursive(10,8,13);
        Thread thread3 = new Thread(FibSequence3);
        thread3.start();
    }

}
