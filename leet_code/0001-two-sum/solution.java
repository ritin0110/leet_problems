class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> checks = new HashMap<>();
        int[] output = new int[2];
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
                Integer pos = checks.get(target-num);
                if(null == pos){
                    checks.put(num, i);
                }else {
                    output[0] = pos;
                    output[1] = i;
                    break;
                }
        }
        return output;
    }
}
