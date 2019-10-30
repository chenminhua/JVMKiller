import java.io.IOException;

// Exception in thread "main" java.lang.OutOfMemoryError: unable to create new native thread
public class ThreadKiller {
    public static void main(String[] args) {
        int i = 1;
        while(true) {
            createNewThread(i);
            i++;
        }
    }

    static void createNewThread(final int i) {
        Runnable task1 = new Runnable(){

            @Override
            public void run(){
                System.out.println("thread " + i + " is running");
                try {
                    Thread.sleep(1000000000000L);
                } catch (Exception e) {}
            }
        };
        new Thread(task1).start();
    }
}
