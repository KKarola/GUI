package GUI_4.Task_2;

public class StringTask implements Runnable {
    private String word;
    private volatile String words = "";
    private int amount;
    private int counter;
    private Thread thread;
    private volatile TaskState taskState;

    public StringTask(String word, int amount) {
        taskState = TaskState.CREATED;
        this.word = word;
        this.amount = amount;
    }

    public void start() {
        this.thread = new Thread(this);
        this.thread.start();
    }

    @Override
    public void run() {
        taskState = TaskState.RUNNING;
        while (counter < amount) {
            words += word;
            counter++;
        }
        taskState = TaskState.READY;
    }

    public void abort() {
        this.thread.interrupt();
        taskState = TaskState.ABORTED;
    }

    public TaskState getState() {
        return taskState;
    }


    public boolean isDone() {
        if (taskState == TaskState.READY || this.thread.isInterrupted()) {
            return true;
        }
        else {
            return false;
        }
    }

    public String getResult() {
        return words;
    }


}
