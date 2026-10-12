public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                return i;
            }
            if(nums[i]==target || nums[i]>target){
                return i;
            }
        }
        return nums.length;
    }
    public static void main(String[] args){
        SearchInsertPosition sip = new SearchInsertPosition();
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println(sip.searchInsert(nums, 3));
    }
}