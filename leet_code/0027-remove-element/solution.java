class Solution {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int[] positions = new int[length];
        int count = 0;
        int pos = 0;
        int counter = 0;
        for(int i=0;i<length;i++) {
            if(nums[i] == val){
                positions[counter] = i;
                counter++;
            }else{
                count++;
                if(pos < counter) {
                    nums[positions[pos]] = nums[i];
                    pos++;
                    positions[counter] = i;
                    counter++;
                }
            }
        }
        return count;
    }
}
