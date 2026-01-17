package stringbuffer_stringbuilder_linear_binarysearch;

public class PeakElementBinarySearch {
	
	public static void main(String[] args) {

        int[] arr = {1, 3, 20, 4, 1, 0};

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            // check if mid is peak
            if ((mid == 0 || arr[mid] > arr[mid - 1]) &&
                (mid == arr.length - 1 || arr[mid] > arr[mid + 1])) {

                System.out.println(mid);       // index
                System.out.println(arr[mid]);  // value
                break;
            }

            // move to left half
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            }
            // move to right half
            else {
                left = mid + 1;
            }
        }
    }

}
