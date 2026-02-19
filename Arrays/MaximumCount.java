class Solution {
    public int maximumCount(int[] nums) {
        int negValue=0,posValue=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                posValue++;
            }else if(nums[i]<0){
                negValue++;
            }
        }
        return Math.max(negValue,posValue);
    }
}
