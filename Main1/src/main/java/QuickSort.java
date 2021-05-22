public class QuickSort<T extends Comparable<? super T>> {

    private int parting(T[] arr, int indexA, int indexZ)
    {
        int pivotInd = (indexA + indexZ) / 2;
        T PivotVal= arr[pivotInd];
        indexA--;
        indexZ++;

        while (true)
        {

            do indexA++; while (arr[indexA].compareTo(PivotVal) < 0) ;

            do indexZ--; while (arr[indexZ].compareTo(PivotVal) > 0) ;

            if (indexA >= indexZ) return indexZ;
            T temp = arr[indexA];
            arr[indexA] = arr[indexZ];
            arr[indexZ] = temp;
        }
    }

    public void qSort(T[] arr, int indexA, int indexZ)
    {
        if (indexA < indexZ)
        {
            int pivotInd = parting(arr, indexA, indexZ);

            qSort(arr, indexA, pivotInd);
            qSort(arr, pivotInd + 1, indexZ);
        }
    }
}