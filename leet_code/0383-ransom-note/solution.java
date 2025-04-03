class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] counts = new int[26];
        for(int i=0;i<magazine.length();i++){
            char c = magazine.charAt(i);
            counts[c-97] = counts[c-97] + 1;
        }
        boolean output = true;
        for(int i=0;i<ransomNote.length();i++){
            char c = ransomNote.charAt(i);
            int count = counts[c-97];
            if(count == 0){
                output = false;
                break;
            }else{
                 counts[c-97] = counts[c-97] - 1;
            }
        }
        return output;
    }
}
