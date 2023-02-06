import java.util.Arrays;

public class Main {
    public static int[] sortArray(int[] sortArr) {
        int[] arr1 = Arrays.copyOf(sortArr, sortArr.length);
        int[] arr2 = new int[sortArr.length];
        return mergeSortInner(arr1, arr2, 0, sortArr.length);
    }

    public static int[] mergeSortInner(int[] arr1, int[] arr2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return arr1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;

        int[] sorted1 = mergeSortInner(arr1, arr2, startIndex, middle);
        int[] sorted2 = mergeSortInner(arr1, arr2, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int index = startIndex;
        int[] result = sorted1 == arr1 ? arr2 : arr1;
        while (index1 < middle && index2 < endIndex) {
            result[index++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[index++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[index++] = sorted2[index2++];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] sortArr = new int[RandomF.randomInt(10, 25)];
        for (int i = 0; i < sortArr.length; i++) {
            sortArr[i] = RandomF.randomInt(-25, 25);
        }
        System.out.println(Arrays.toString(sortArr));
        System.out.println(Arrays.toString(sortArray(sortArr)));
    }
}