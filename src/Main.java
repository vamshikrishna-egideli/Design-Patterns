import java.util.List;

public class Main {
    public static void main(String[] args) {

        //getting thread pool and add few new threads
        ThreadPool threadPool = ThreadPool.getThreadPool();
        threadPool.addNewThread();
        threadPool.addNewThread();

        //print all the existing threads in the thread-pool
        List<String> allThread = threadPool.getAllThreads();
        for(int i=0;i<allThread.size();i++)
        {
            System.out.println(allThread.get(i));
        }

        //add new thread to the thread pool
        //print all the existing threads in the thread-pool
        ThreadPool threadPool2 = ThreadPool.getThreadPool();
        threadPool2.addNewThread();
        //it would still add to the same thread pool
        List<String> allThread2 = threadPool.getAllThreads();
        for(int i=0;i<allThread2.size();i++)
        {
            System.out.println(allThread2.get(i));
        }
    }
}
