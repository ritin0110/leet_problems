class Solution {
    public int removeDuplicates(int[] nums) {
        int backward = 0;
        int lastele = nums[0];
        int count = 1;
        int result = 0;
        for(int i = 1; i<nums.length;i++){
            int num = nums[i];
            if(num == lastele){
                count++;
                if(count > 2){
                    result++;
                    backward++;
                }
                nums[i-backward] = num;
            }else{
                nums[i-backward] = num;
                lastele = num;
                count = 1;
            }
        }
        return nums.length-result;
    }
}
