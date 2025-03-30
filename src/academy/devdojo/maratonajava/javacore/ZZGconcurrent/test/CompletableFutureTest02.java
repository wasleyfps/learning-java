package academy.devdojo.maratonajava.javacore.ZZGconcurrent.test;

import academy.devdojo.maratonajava.javacore.ZZGconcurrent.service.StoreService;
import academy.devdojo.maratonajava.javacore.ZZGconcurrent.service.StoreServiceDeprecated;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class CompletableFutureTest02 {
    public static void main(String[] args) {
        StoreServiceDeprecated storeServiceDeprecated = new StoreServiceDeprecated();
        searchPricesAsyncCompletableFuture(storeServiceDeprecated);
    }

    private static void searchPricesAsyncCompletableFuture(StoreServiceDeprecated storeService) {
        long start = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(10, t -> {
            Thread thread = new Thread();
            thread.setDaemon(true);
            return thread;
        });
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
        List<CompletableFuture<Double>> completableFutures = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> storeService.getPriceSync(s), executor))
                .collect(Collectors.toList());

        List<Double> prices = completableFutures.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());
        System.out.println(prices);
        
        long end = System.currentTimeMillis();
        executor.shutdown();
        System.out.printf("Time passed to searchPrices Sync %dms%n", (end - start));
        StoreService.shutdown();
    }
}
