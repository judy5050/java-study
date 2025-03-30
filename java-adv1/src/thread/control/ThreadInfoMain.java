package thread.control;

import thread.util.MyLogger;

public class ThreadInfoMain {

    public static void main(String[] args) {
        //main 스레드
        Thread mainThread = Thread.currentThread();
        MyLogger.log();
    }
}
