/*
   21CE037 Utsav Gundaraniya
    Write a program to create thread which    display “Hello World” message.
         A. by extending Thread class
         B. by using Runnable interface.
*/
public class Prac_1_Thread {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();
        Thread t = new Thread(new Thread2());
        t.start();
    }
}

class Thread1 extends Thread {
    public void run() {
        System.out.println("Hello world. " + "This thread is extending Thread class");
    }
}

class Thread2 implements Runnable {
    public void run() {
        System.out.println("Hello world. " + "This thread is implementing Runnable interface");
    }
}
