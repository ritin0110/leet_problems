class Solution {
	    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> checks = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int num = nums[i];
            Integer pos = checks.get(num);
            if(null == pos){
                checks.put(num, i);
            }else if(i - pos <= k){
                return true;
            }else{
                checks.put(num, i);
            }
        }
        return false;
    }
}
