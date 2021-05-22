public class MergeSort<T extends Comparable<? super T>> {

    void merge(T[] arr, int start, int mid, int end)
    {
        T[] arrLeft  = (T[]) new Comparable[mid - start + 1];
        T[] arrRight = (T[]) new Comparable[end - mid];

        for (int i = 0; i < arrLeft.length; ++i)
            arrLeft[i] = arr[start + i];

        for (int i = 0; i < arrRight.length; ++i)
            arrRight[i] = arr[mid + 1 + i];

        int leftIndex = 0, rightIndex = 0;

        int IndCurrent = start;

        while (leftIndex < arrLeft.length && rightIndex < arrRight.length)
        {
            if (arrLeft[leftIndex].compareTo(arrRight[rightIndex]) <= 0)
            {
                arr[IndCurrent] = arrLeft[leftIndex];
                leftIndex++;
            }
            else
            {
                arr[IndCurrent] = arrRight[rightIndex];
                rightIndex++;
            }
            IndCurrent++;
        }

        while (leftIndex < arrLeft.length) arr[IndCurrent++] = arrLeft[leftIndex++];

        while (rightIndex < arrRight.length) arr[IndCurrent++] = arrRight[rightIndex++];
    }

    void mSort(T[] arr, int start, int end)
    {
        if (start < end)
        {
            int mid = (start + end) / 2;

            mSort(arr, start, mid);
            mSort(arr, mid + 1, end);

            merge(arr, start, mid, end);
        }
    }
}
