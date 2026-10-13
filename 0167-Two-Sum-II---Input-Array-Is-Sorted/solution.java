class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] indices = new int[2];
        int right = numbers.length-1;
        int left=0;
        while(left<right){
            int sum=numbers[right]+numbers[left];
            if(sum==target){
                indices[0]=left+1;
                indices[1]=right+1;
                return indices;
            }
            if(sum>target){
                right--;
            }
            if(sum<target){
                left++;
            }
            
            
        }
        return null;
        
    }
}