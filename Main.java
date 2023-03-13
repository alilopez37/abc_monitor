import models.Monitor;
import threads.PrintA;
import threads.PrintB;
import threads.PrintC;

public class Main{
    public static void main(String[] args) {
        System.out.println("...");
        Monitor monitor = new Monitor();
        Thread printA = new PrintA(monitor);
        Thread printB = new PrintB(monitor);
        Thread printC = new PrintC(monitor);

        printA.start();
        printB.start();
        printC.start();
    }
}