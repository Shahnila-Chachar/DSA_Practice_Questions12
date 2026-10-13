class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] indices = new int[2];
        for(int i = 1; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                if((numbers[i]+numbers[j])==target){
                    indices[0]=i;
                    indices[1]=j;
                }
            }
        }
        return indices;
    }
}