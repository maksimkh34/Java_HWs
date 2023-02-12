public class Main
{
  static void sort(int[] arr)
  {
    int n = arr.length;

    for (int i = n / 2 - 1; i >= 0; i--)
      toHeap(arr, n, i);

    for (int i=n-1; i>=0; i--)
    {
      int temp = arr[0];
      arr[0] = arr[i];
      arr[i] = temp;

      toHeap(arr, i, 0);
    }
  }

  static void toHeap(int[] arr, int n, int i)
  {
    int largest = i;
    int l = 2*i + 1;
    int r = 2*i + 2;

    if (l < n && arr[l] > arr[largest])
      largest = l;

     if (r < n && arr[r] > arr[largest])
      largest = r;
    if (largest != i)
    {
      int swap = arr[i];
      arr[i] = arr[largest];
      arr[largest] = swap;

      toHeap(arr, n, largest);
    }
  }

  static void printArray(int[] arr)
  {
    for (int j : arr)
      System.out.print(j + " ");
    System.out.println();
  }

  public static void main(String[] args)
  {
    int[] arr = {12, 11, 13, 5, 6, 7};

    System.out.println("Sorted array is");
    sort(arr);
    printArray(arr);
  }
}