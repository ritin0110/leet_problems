class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> output = new ArrayList<>();
        int length = nums.length;
        if(length == 0){
            return output;
        }else if (length == 1){
            output.add(String.valueOf(nums[0]));
            return output;
        }
        int start = nums[0];
        int last = nums[0];
        for(int i=1;i<length;i++){
            int num = nums[i];
            if(num == last+1){
                last = num;
            }else{
                if(start == last){
                    output.add(String.valueOf(start));
                }else{
                    output.add(start + "->" + last);
                }
                start = num;
                last = num;
            }

                if(i == nums.length-1){
                    if(start == last){
                        output.add(String.valueOf(start));
                    }else{
                        output.add(start + "->" + last);
                    }
                }
        }
        return output;
    }
}
