package bai18.baitap._EvenOddNumber;

public class EvenThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0){
                System.out.println("Even number: " + i);
                try {
                    Thread.sleep(15);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
