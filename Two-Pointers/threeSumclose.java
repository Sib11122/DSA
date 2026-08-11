public class threeSumclose {
    public static int threeSumClosest(int[] nums, int target) {
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                //agar sum jo hai target se bada hai 
                //sum target se chota hai toh ans update krdo
                if(sum>=target||ans<=sum){
                    ans=sum;
                }
                k--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={-1,2,1,-4};
        int target=1;
        int ans=threeSumClosest(arr,target);
        System.out.println(ans);
    }
}
