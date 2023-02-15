import java.util.ArrayList;
import java.util.List;

public class ThreadPool {
    private static  ThreadPool threadPool;
    private  List<String> list ;
    private ThreadPool(){
        list = new ArrayList<>();
    }
    public static ThreadPool getThreadPool(){
        if(threadPool== null)
        {
            threadPool = new ThreadPool();

        }
        return threadPool;
    }
    public void addNewThread(){
        list.add("thread-"+list.size());
    }

    public  List<String> getAllThreads() {
        return list;
    }
}
