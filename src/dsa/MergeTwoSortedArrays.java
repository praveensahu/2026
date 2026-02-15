package dsa;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 6};
        int[] arr2 = {3, 5};
        int[] arr3 = new int[arr1.length + arr2.length];
        int lenght = arr1.length < arr2.length ? arr1.length : arr2.length;
        int k = 0;
        int i = 0;
        int j = 0;
        while (j <arr2.length) {

            if (arr1[i] > arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr1[i++];
            }
            lenght--;
        }
        if(i<arr1.length-1){
            //ad remaining
        }
        System.out.println(Arrays.toString(arr1));
    }
}
