package thread;

import com.sun.corba.se.impl.orbutil.threadpool.ThreadPoolImpl;

import java.util.concurrent.*;

public class ThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        Future<String> future = service.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "1";
            }
        });
        service.execute(new Runnable() {
            @Override
            public void run() {

            }
        });
//        future.isDone();
//        future.get();
    }
}
