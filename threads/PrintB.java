package threads;

import java.util.Random;

import models.Monitor;

public class PrintB extends Thread{
    private Monitor monitor;
    private Random random;
    public PrintB(Monitor monitor){
        this.monitor = monitor;
        random = new Random(System.currentTimeMillis());
    }
    @Override
    public void run(){
        while (true)
        {
            monitor.printB();
            try {
                Thread.sleep(random.nextInt(2000) + 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
