class Solution {
    public int findDuplicate(int[] nums) {
    Set<Integer> set=new HashSet<>();
    for(int num:nums){
        if(set.contains(num)){
        return num;//Duplicate number
        }
        set.add(num); 
    }    
    return -1;

    }
}
