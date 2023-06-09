import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Random;

class TaskTimeHelper {
    public static int num() { // menghasilkan angka acak dari 1 hingga 6
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public static int generateTaskTime() {
        return 0;
    }
}

public class soal1 {
    private static final int DATA_SOURCES = 4; // menyimpan jumlah sumber data
    private static final int THREAD_POOLS = 3; // menentukan jumlah thread pool
    private static int successLoadData = 0;
    private static int failedLoadData = 0;
    private static boolean isFinished = false;
    static int executionTime = TaskTimeHelper.num(); // menyimpan waktu eksekusi tugas yang dihasilkan dari pemanggilan TaskTimeHelper.num()

    public static void main(String[] args) {
        System.out.println(String.format("Start load %d Data", DATA_SOURCES));

        ExecutorService executor = Executors.newFixedThreadPool(THREAD_POOLS);

        for (int i = 0; i < DATA_SOURCES; i++) {
            executor.execute(() -> { // menjalankan tugas-tugas secara bersamaan
                try {
                    Thread.sleep(executionTime * 1000); // Setiap tugas akan menunggu selama executionTime detik 
                    if (executionTime > 4) {
                        System.out.println("Request Timeout"); // jika executionTime lebih besar dari 4, maka tugas dianggap timeout dan jumlah failedLoadData akan diinkrementasi
                        incrementFailedLoadData();
                    } else {
                        incrementSuccessLoadData();
                    }
                } catch (InterruptedException e) {
                    System.out.println(e);
                }

                checkDataLoadingStatus();
            });
        }

        executor.shutdown();

        int loadingTime = 1;
        while (true) {
            if (isFinished) {
                System.out.println("\nTask Finished.");
                System.out.println(String.format("Time Execution : %ds", loadingTime - 1));
                if (successLoadData == DATA_SOURCES) {
                    System.out.println("All data is successfully loaded");
                    break;
                } else {
                    System.out.println(String.format("%d Data Successfully loaded & %d Data Failed to load",
                            successLoadData, failedLoadData));
                    break;
                }
            } else {
                System.out.println(String.format("Loading... (%ds)", loadingTime));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            loadingTime++;
        }
    }

    public static synchronized void incrementSuccessLoadData() {
        successLoadData++;
    }

    public static synchronized void incrementFailedLoadData() {
        failedLoadData++;
    }

    public static synchronized void checkDataLoadingStatus() {
        if (successLoadData + failedLoadData == DATA_SOURCES) {
            isFinished = true;
        }
    }
}