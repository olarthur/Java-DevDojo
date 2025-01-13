package maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.*;

class RandomNumberCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        int num = ThreadLocalRandom.current().nextInt(1, 11);

        for (int i = 0; i < num; i++) {
            System.out.printf("%s executando uma tarefa Callable...%n", Thread.currentThread().getName());
        }

        return String.format("%s finished and the random number is %d", Thread.currentThread().getName(), num);
    }
}

public class CallableTest01 {
    public static void main(String[] args) {
        RandomNumberCallable randomNumberCallable = new RandomNumberCallable();
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<String> future = executorService.submit(randomNumberCallable);

        String s = null;

        try {
            s = future.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("Program Finished %s", s);
        executorService.shutdown();
    }
}
