class Solution {
    public int missingNumber(int[] nums) {
        
        // code here
        long n=nums.length,sum=0;
        long s=n*(n+1)/2;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        
        return (int)(s-sum);
        
    }
}

