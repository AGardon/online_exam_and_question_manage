public class test {

    public static void main(String[] args) {

        //        int[] arr = {1,3,5,12,32,41,12,23,9};
        //        func1(arr);
        //        System.out.println(Arrays.toString(arr));
    }

    // 冒泡排序
    public static void func2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // 选择排序
    public static void func3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    // 插入排序
    public static void func4(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }

    // 快速排序
    public static void func5(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        while (left < right) {
            while (left < right && arr[right] >= pivot) {
                right--;
            }
            if (left < right) {
                arr[left] = arr[right];
                left++;
            }
            while (left < right && arr[left] <= pivot) {
                left++;
            }
            if (left < right) {
                arr[right] = arr[left];
                right--;
            }
        }
        arr[left] = pivot;
        return left;
    }

    // 归并排序
    public static void func6(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int i, int i1) {
        if (i < i1) {
            int mid = (i + i1) / 2;
            mergeSort(arr, i, mid);
            mergeSort(arr, mid + 1, i1);
            merge(arr, i, mid, i1);
        }
    }

    private static void merge(int[] arr, int i, int mid, int i1) {
        int[] temp = new int[i1 - i + 1];
        int i2 = mid + 1;
        int k = 0;
        while (i <= mid && i2 <= i1) {
            if (arr[i] <= arr[i2]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[i2++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (i2 <= i1) {
            temp[k++] = arr[i2++];
        }
        for (int j = 0; j < temp.length; j++) {
            arr[i] = temp[j];
            i++;
        }
    }

    // 堆排序
    public static void func7(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            heapAdjust(arr, i, arr.length);
        }
        for (int i = arr.length - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapAdjust(arr, 0, i);
        }
    }

    private static void heapAdjust(int[] arr, int i, int length) {
        int temp = arr[i];
        int child = 2 * i + 1;
        while (child < length) {
            if (child + 1 < length && arr[child + 1] > arr[child]) {
                child++;
            }
            if (temp >= arr[child]) {
                break;
            }
            arr[i] = arr[child];
            i = child;
            child = 2 * i + 1;
        }
        arr[i] = temp;
    }

    // 获取最大值
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
