class Solution {
    public int removeDuplicates(int[] nums) {
        int pos = 0;
        int length = nums.length;
        int count = 0;
        for(int i = 1; i < length; i++){
            if(nums[pos] < nums[i]){
                count++;
                nums[pos+1] = nums[i];
                pos = pos+1;
            }
        }
        return count+1;
    }
}
