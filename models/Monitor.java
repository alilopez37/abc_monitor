package models;

public class Monitor{
    private boolean a;
    private boolean b;
    private boolean c;
    public Monitor(){
        a = true;
        b= false;
        c= false;
    }

    public synchronized void printA(){
        while (!a)
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        System.out.print("A");
        b = true;
        a = false;
        this.notifyAll();
    }

    public synchronized void printB() {
        while (!b)
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.print("B");
        c = true;
        b = false;
        this.notifyAll();
    }

    public synchronized void printC() {
        while (!c)
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        System.out.println("C");
        a = true;
        c = false;
        this.notifyAll();
    }
}