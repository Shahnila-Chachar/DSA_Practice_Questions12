class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] indices = new int[2];
        int right = numbers.length-1;
        int left=0;
        while(left<right){
            if((numbers[right]+numbers[left])==target){
                indices[0]=left;
                indices[1]=right;
                
            }
            left++;
            right--;
            
        }
        return indices;
        
    }
}