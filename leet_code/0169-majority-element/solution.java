class Solution {
    public int majorityElement(int[] nums) {
        int length = nums.length;
        int mark = length/2;
        Map<Integer, Integer> counts = new HashMap<>();
        for(int i=0;i< length;i++){
            Integer existing = counts.get(nums[i]);
            if(null == existing) {
                if(1 > mark){
                    return nums[i];
                }
                counts.put(nums[i], 1);
            }else {
                if(existing + 1 > mark){
                    return nums[i];
                }
                counts.put(nums[i], existing+1);
            }
        }
        return 0;
    }
}
