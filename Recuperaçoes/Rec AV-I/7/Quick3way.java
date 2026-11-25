public static <T extends Comparable<T>> void quick3way(
        T[] A, int lo, int hi) {

    if (lo >= hi) {
        return;
    }

    int[] r = partition3way(A, lo, hi);

    quick3way(A, lo, r[0] - 1);

    quick3way(A, r[1] + 1, hi);
}