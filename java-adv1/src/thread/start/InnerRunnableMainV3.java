package thread.start;

import thread.util.MyLogger;

public class InnerRunnableMainV3 {

    public static void main(String[] args) {
        MyLogger.log("main() start");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                MyLogger.log("run()");
            }
        });

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
