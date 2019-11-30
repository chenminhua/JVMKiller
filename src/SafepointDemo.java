public class SafepointDemo {
    static double sum = 0;
    public static void foo() {
        for (int i = 0; i < 0x77777777; i++) {
            sum += Math.sqrt(i);
        }
    }
    public static void bar() {
        for (int i = 0; i < 50_000_000; i++) {
            new Object().hashCode();
        }
    }
    public static void main(String[] args) {
        new Thread(SafepointDemo::foo).start();
        new Thread(SafepointDemo::bar).start();
    }

}
