package GUI_4.Task_1;

import java.util.ArrayList;

public class Letters implements Runnable {
    boolean abort = false;
    private ArrayList<Thread> threads = new ArrayList<Thread>();

    public Letters(String letters) {
        for (int i = 0; i < letters.length(); i++) {
            String letter = letters.substring(i, i + 1);
            String threadName = "Thread " + letter;

            threads.add(new Thread(threadName));

            new Thread( () -> {
                while (abort == false) {
                    try {
                        Thread.sleep(1000);
                        System.out.print(letter);
                    } catch (InterruptedException e) {
                        System.out.println("B³¹d " + e);
                    }
                }
            }).start();
        }
    }

    public ArrayList<Thread> getThreads() {
        return threads;
    }

    @Override
    public void run() { }
}
