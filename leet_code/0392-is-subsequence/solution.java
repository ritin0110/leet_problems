class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=-1;
        if(t.length() == 0 && s.length() > 0){
            return false;
        }
        boolean found = true;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            j++;
            char n = ' ';
            if(j < t.length()){
                n = t.charAt(j);
            }
            while(c != n && j < t.length()){
                j++;
                if(j < t.length()){
                    n = t.charAt(j);
                }
            }
            if(j == t.length()){
                found = false;
                break;
            }
        }
        return found;
    }
}
