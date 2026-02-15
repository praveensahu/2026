package old;

public class Test3 {
    public static void binarySearch(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] ==target){
              //  System.out.println(); mid;
            }else if(arr[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

    }
}
