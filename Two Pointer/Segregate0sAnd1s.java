class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int l=0, r=arr.length-1;
        while(l<r){
            if(arr[l]==0){
                l++;
            }else if(arr[r]==1){
                r--;
            }else{
                int t=arr[l];
                arr[l]=arr[r];
                arr[r]=t;
            }
        }
        return ;
    }
}
