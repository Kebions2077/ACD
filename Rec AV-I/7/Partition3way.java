private static <T extends Comparable<T>> int[] Partition3way(
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

    return new int[] {lt, gt};
}