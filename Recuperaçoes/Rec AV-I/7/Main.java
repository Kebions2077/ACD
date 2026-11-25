import java.util.Arrays;

public class Main {

    private static <T extends Comparable<T>> int[] partition3way(
            T[] A, int lo, int hi) {

        T pivot = A[lo];

        int lt = lo;
        int i = lo + 1;
        int gt = hi;

        while (i <= gt) {
            int cmp = A[i].compareTo(pivot);

            if (cmp < 0) {
                T temp = A[lt];
                A[lt] = A[i];
                A[i] = temp;
                lt++;
                i++;

            } else if (cmp > 0) {
                T temp = A[i];
                A[i] = A[gt];
                A[gt] = temp;
                gt--;

            } else {
                i++;
            }
        }

        return new int[]{lt, gt};
    }

    public static <T extends Comparable<T>> void quick3way(
            T[] A, int lo, int hi) {

        if (lo >= hi) {
            return;
        }

        int[] r = partition3way(A, lo, hi);

        quick3way(A, lo, r[0] - 1);
        quick3way(A, r[1] + 1, hi);
    }

    public static void main(String[] args) {

        Integer[] V = {11, 13, 8, 11, 17, 8, 31, 11, 10, 8};

        System.out.println("Vetor original:");
        System.out.println(Arrays.toString(V));

        int[] r = partition3way(V, 0, V.length - 1);

        System.out.println("Vetor após partition3way:");
        System.out.println(Arrays.toString(V));

        System.out.println("Limites: " + Arrays.toString(r));

        quick3way(V, 0, V.length - 1);

        System.out.println("Vetor ordenado:");
        System.out.println(Arrays.toString(V));
    }
}