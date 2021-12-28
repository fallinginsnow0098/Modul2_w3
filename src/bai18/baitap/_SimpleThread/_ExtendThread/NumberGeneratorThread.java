package bai18.baitap._SimpleThread._ExtendThread;

public class NumberGeneratorThread{
    public void printNumberGenerator(int number){
        for (int i = 1; i <= number ; i++) {
            System.out.println("Number: "  + i + " with hashCode: " + hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
