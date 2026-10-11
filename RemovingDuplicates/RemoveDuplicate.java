public class RemoveDuplicate {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
                count++;
            }

        }
        return count;
    }
    public static void main(String[] args){
        RemoveDuplicate rd = new RemoveDuplicate();
        int[] nums = {1, 2, 1, 3, 3};
        System.out.print(rd.removeElement(nums, 1) + " ");
    }
}