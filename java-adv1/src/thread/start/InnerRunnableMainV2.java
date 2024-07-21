package thread.start;

import thread.util.MyLogger;

public class InnerRunnableMainV2 {

    public static void main(String[] args) {
        MyLogger.log("main() start");

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                MyLogger.log("run()");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        MyLogger.log("main() end");
    }

    static class MyRunnable implements Runnable{
        @Override
        public void run() {
            MyLogger.log("log()");
        }
    }
}
