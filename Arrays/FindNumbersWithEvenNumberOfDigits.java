class Solution {
    public int findNumbers(int[] nums) {
        // int c=0;
        // for(int i=0;i<nums.length;i++){
        //    int s = Integer.toString(nums[i]).length();
        //     if(s%2==0){
        //         c++;
        //     }
        // }
        // return c;
        int evenCount=0;
        for(int num:nums){
            if(num>=10&&num<=99||num>=1000&&num<=9999||num==100000){
                evenCount++;
            }
        }
        return evenCount;
    }
}
