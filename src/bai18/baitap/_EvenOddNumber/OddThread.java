package bai18.baitap._EvenOddNumber;

public class OddThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0){
                System.out.println("Odd number: " + i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
