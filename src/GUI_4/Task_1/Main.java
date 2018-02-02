package GUI_4.Task_1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Letters letters = new Letters("ABCD");
        for (Thread t : letters.getThreads()) System.out.println(t.getName());

        Thread.sleep(5000);

        System.out.println("\nProgram skoñczy³ dzia³anie");
    }
}
