class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int p = 0;
        int[] temp = new int[m];
        for(int k = 0; k < m; k ++){
            temp[k] = nums1[k];
        }
        while(i < m && j < n) {
            if(temp[i] <= nums2[j]){
                nums1[p] = temp[i];
                i++;
            }else{
                nums1[p] = nums2[j];
                j++;
            }
            p++;
        }
        if(i < m) {
            for(int k = i; k < m; k ++){
                nums1[p] = temp[k];
                p++;
            }
        }
        
        if(j < n) {
            for(int k = j; k < n; k ++){
                nums1[p] = nums2[k];
                p++;
            }
        }
    }
}
