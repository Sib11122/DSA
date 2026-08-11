import java.util.Arrays;

public class mergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
       for(int j=0,i=m;j<n;j++){
           nums1[i] = nums2[j];
           i++;
       }
       Arrays.sort(nums1);
    }
    public static void main(String[] args) {
        int[] arr1={1,2,3,0,0,0};
        int[] arr2={2,5,6};
        merge(arr1,3,arr2,3);
        System.out.println(Arrays.toString(arr1));
    }
}
