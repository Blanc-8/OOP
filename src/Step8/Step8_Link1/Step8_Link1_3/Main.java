package Step8.Step8_Link1.Step8_Link1_3;

import java.util.Arrays;

/*
Write a Java program that sorts an array of integers using multiple threads.

Напишите программу на Java, которая сортирует массив целых чисел, используя несколько потоков.
 */
public class Main {
    // Тут пришлось двигаться по предложенному решению и переписать его так как на уровне разбора задачи вообще не понимал
    // как я потом объединю отсортированные полумассивы, если их раздроблю перед работой.
    // А увидев решение решил его досконально разобрать с ГПТ, но ручной мэтч не осилил.

    private static final int ARRAY_SIZE = 500;
    private static final int NUM_THREADS = 5;

    private static int[] createArray() {
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = (int) (Math.random() * 500);
        }
        return array;
    }

    static class SortTask implements Runnable{
        private int[] array;
        private int startIndex;
        private int endIndex;

        public SortTask(int[] array, int startIndex, int endIndex) {
            this.array = array;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        @Override
        public void run() {
            Arrays.sort(array, startIndex, endIndex + 1);
        }
    }

    public static void main(String[] args) {
        int[] array = createArray();
        System.out.println("До сортировки: " + Arrays.toString(array));
        Thread[] threads = new Thread[NUM_THREADS];
        int segmentSize = ARRAY_SIZE / NUM_THREADS;

        for (int i = 0; i < NUM_THREADS; i++) {
            int startIndex = i * segmentSize;
            int endIndex = (i == NUM_THREADS -1) ? ARRAY_SIZE - 1 : (startIndex + segmentSize -1);
            threads[i] = new Thread(new SortTask(array, startIndex, endIndex));
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        Arrays.sort(array);
        System.out.println("После сортировки: " + Arrays.toString(array));
    }


}
