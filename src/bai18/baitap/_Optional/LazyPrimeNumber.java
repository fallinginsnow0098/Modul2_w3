package bai18.baitap._Optional;

public class LazyPrimeNumber implements Runnable{
    public static boolean isPrime(int number){
        if (number < 2){
            return false;
        }
        if (number == 2){
            return true;
        }
        if (number % 2 == 0){
            return false;
        }
        for (int i = 3; i < number-1 ; i+=2) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
    @Override
    public void run() {
        System.out.println("Số nguyên tố nhỏ hơn 100 là: ");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            if (isPrime(i)) System.out.println(i + " ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("Thread1 end in: " + (finishTime - startTime) + "ms");
    }
}
