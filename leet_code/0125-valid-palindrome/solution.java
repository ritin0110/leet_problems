class Solution {
    public boolean isPalindrome(String s) {
        String process = convertString(s);
        int length = process.length();
        boolean output = true;
        for(int i=0,j=length-1;i<=length/2 && j>=length/2;i++,j--){
            if(process.charAt(i) != process.charAt(j)){
                output = false;
                break;
            }
        }
        return output;
    }

    private String convertString(String s){
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if((c >= 97 && c <= 122) || (c >= 48 && c <= 57)){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
