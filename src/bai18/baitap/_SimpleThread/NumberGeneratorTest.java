package bai18.baitap._SimpleThread;

import bai18.baitap._SimpleThread._ExtendThread.NumberGeneratorThread;

public class NumberGeneratorTest {
    public static void main(String[] args) {
//        Tạo thread implements Runnable
//        NumberGeneratorRunnable numberGenerator1 = new NumberGeneratorRunnable();
//        NumberGeneratorRunnable numberGenerator2 = new NumberGeneratorRunnable();
//
//        Thread thread1 = new Thread(numberGenerator1);
//        Thread thread2 = new Thread(numberGenerator2);
//
//        thread1.start();
//        thread2.start();

        //  Tạo Thread nặc danh class extend Thread
        NumberGeneratorThread numberGeneratorThread = new NumberGeneratorThread();
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                numberGeneratorThread.printNumberGenerator(10);
            }
        };
        Thread thread2 = new Thread(){
            @Override
            public void run() {
                numberGeneratorThread.printNumberGenerator(10);
            }
        };

//        thread1.start();
//        thread2.start();
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        thread2.start();
    }
}
