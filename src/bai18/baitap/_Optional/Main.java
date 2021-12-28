package bai18.baitap._Optional;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        LazyPrimeNumber lazyPrimeNumber = new LazyPrimeNumber();
        OptimizedPrimeNumber optimizedPrimeNumber = new OptimizedPrimeNumber();
        Thread thread1 = new Thread(lazyPrimeNumber);
        Thread thread2 = new Thread(optimizedPrimeNumber);
         thread1.start();
         thread1.join();
         thread2.start();
    }
}
