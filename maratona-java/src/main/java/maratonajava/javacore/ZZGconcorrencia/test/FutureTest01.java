package maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.*;

public class FutureTest01 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<Double> dollarRequest = executorService.submit(() -> {
            TimeUnit.SECONDS.sleep(5);
            return 6.10D;
        });

        System.out.println(doSomething());

        Double dollarResponse = null;
        try {
            dollarResponse = dollarRequest.get(3, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();
        }
        System.out.println("Dollar: " + dollarResponse);

        executorService.shutdown();
    }

    private static long doSomething() {
        System.out.println(Thread.currentThread().getName());

        long sum = 0;

        for (int i = 0; i < 1_000_000; i++) {
            sum += i;
        }
        return sum;
    }
}
