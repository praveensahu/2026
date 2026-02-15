package old;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8,0,1,2};
        //0,1,2,3,4,5,6,7,8

        System.out.println(findMax(arr));
    }

    static int findMax(int[] arr) {
        int low = 0, high = arr.length - 1;

        // If array is not rotated
        if (arr[low] <= arr[high]) {
            return arr[high];
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            //mid = 4
            // mid < high is important
            if (mid < high && arr[mid] > arr[mid + 1]) {
                return arr[mid];
            }

            // mid > low is important
            if (mid > low && arr[mid] < arr[mid - 1]) {
                return arr[mid - 1];
            }

            // Decide which side to go
            if (arr[mid] >= arr[low]) {
                low = mid + 1;   // max is on right side
            } else {
                high = mid - 1;  // max is on left side
            }
        }
        return -1; // should never reach here
    }
}
