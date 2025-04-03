class Solution {
    public boolean isAnagram(String s, String t) {
        int[] counts = new int[26];
        int slength = s.length();
        int tlength = t.length();
        if(slength != tlength){
            return false;
        }
        for(int i=0;i<slength;i++){
            char c = s.charAt(i);
            counts[c - 97] = counts[c-97] + 1;
        }
        for(int i=0;i<tlength;i++){
            char c = t.charAt(i);
            if(counts[c - 97] == 0){
                return false;
            }
            counts[c - 97] = counts[c-97] - 1;
        }
        return true;
    }
}
