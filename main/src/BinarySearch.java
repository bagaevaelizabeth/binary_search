//[1, 3, 2, 14, 2]
//[2,3,4,5,6]
public class BinarySearch {

    public int searchElement(int arr[], int el) {
        int left = 0;
        int right = arr.length;
        int mid = (left + right)/2;
        while (left <= right) {
            if (el == arr[mid]) {
                return arr[mid];
            }
            if (el > arr[mid]) {
                left = mid;
            }
            else {
                right = mid;
            }
            mid = (left + right) / 2;
        }
        return -1;
    }

    public static void main(String argv[]) {
        BinarySearch a = new BinarySearch();
        int arr[] = {1,2,3,4,5,7};
        int v = a.searchElement(arr, 1);
        System.out.println(v);
    }
}