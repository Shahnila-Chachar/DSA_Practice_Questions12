class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        int totalSum = 0;
        for(int i=0; i<nums.length; i++){
            totalSum+=nums[i];
        }    
        for(int i=0; i<nums.length; i++){
            leftSum+=nums[i];
            rightSum = totalSum-leftSum-nums[i];
            if(leftSum==rightSum){
                return i;
            }
            
        }
        return -1;
    }
}