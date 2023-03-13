package threads;

import java.util.Random;

import models.Monitor;

public class PrintA extends Thread{
    private Monitor monitor;
    private Random random;
    public PrintA(Monitor monitor){
        this.monitor = monitor;
        random = new Random(System.currentTimeMillis());
    }
    @Override
    public void run(){
        while (true)
        {
            monitor.printA();
            try {
                Thread.sleep(random.nextInt(2000) + 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
