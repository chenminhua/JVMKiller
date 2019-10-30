import java.util.ArrayList;
import java.util.List;

public class HeapOverFlowKiller {
    public static void main(String[] args) {
        List<Object> l = new ArrayList<>();

        while(true) {
            for (int i = 0; i < 20000; i++) {
                l.add(new Object());
            }
            printHeapMemoryInfo();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}
        }
    }

    static void printHeapMemoryInfo() {
        long heapSize = Runtime.getRuntime().totalMemory();
        long heapMaxSize = Runtime.getRuntime().maxMemory();
        long heapFreeSize = Runtime.getRuntime().freeMemory();
        System.out.println("heap size: " + heapSize + " bytes; "
                + "heap max size: " + heapMaxSize + " bytes"
                + "heap free size: " + heapFreeSize + " bytes");
    }
}
