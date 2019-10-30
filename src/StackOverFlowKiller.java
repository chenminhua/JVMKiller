public class StackOverFlowKiller {
    public static void main(String[] args) {
        RecursiveWalk(0);
    }

    //    很多人会说StackOverflow是因为调用栈太深？这句话对了一半。
    //    归根到底，栈溢出是由于栈内存有限，而不断深入的调用栈上变量始终得不到释放，最终导致栈溢出。
    //    如果你每一次函数调用都要去栈上占一大块内存，那不用很深的栈，你也会栈溢出的。
    //    当然，栈溢出其实并不容易发生，因为除了基本类型和变量引用外，其他对象都在堆上。
    //    如果你遇到StackOverflow，一般都是因为你用了递归。
    //    试一下，把这里的int改成double，看看最大深度会有什么变化？思考为什么？

    static void RecursiveWalk(int i) {
        System.out.println(i);
        RecursiveWalk(i+1);
    }
}
