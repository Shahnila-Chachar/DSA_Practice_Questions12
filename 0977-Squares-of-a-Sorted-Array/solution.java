class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sort = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            nums[i]*=nums[i];
            sort[i]=nums[i];
        }
        for(int i=0; i<sort.length; i++){
            for(int j=i+1; j<sort.length; j++){
                if(sort[i]>sort[j]){
                    int temp = sort[i];
                    sort[i] = sort[j];
                    sort[j] = temp; 
                }
            }
        }
        return sort;
    }
}