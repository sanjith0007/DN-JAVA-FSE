import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ExecutorServiceCallable {

    public static void main(String[] args)
        throws Exception {

    ExecutorService workerPool =
        Executors.newFixedThreadPool(3);

    List<Callable<Integer>> taskList =
        new ArrayList<>();

    taskList.add(() -> 10);
    taskList.add(() -> 20);
    taskList.add(() -> 30);

    List<Future<Integer>> resultList =
        workerPool.invokeAll(taskList);

    for(Future<Integer> eachResult : resultList) {

        System.out.println(
            eachResult.get());
    }

    workerPool.shutdown();
    }
}

/*
Output:
10
20
30
*/