public class twoSum{
    //two sum is problem which is solved by two pointers
    static int[] twoSumFunction(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            while(j<nums.length){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
                j++;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,7};
        int[] ans=new int[2];
        ans=twoSumFunction(arr, 9);
        for(int i=0;i<ans.length;i++){
            System.out.print("{"+ans[i]+"}");
        } 
    }
}