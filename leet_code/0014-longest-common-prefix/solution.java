class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder output = new StringBuilder();
        int i = 0;
       outer: while(true){
            boolean compare = true;
            char first = ' ';
            if(strs[0].length() > i){
                first = strs[0].charAt(i);
            }else{
                break outer;
            }
            for(int j=1;j<strs.length;j++){
                char current = ' ';             
                if(strs[j].length() > i){
                    current = strs[j].charAt(i);
                    if(current != first){
                        compare = false;
                    }
                }else{
                    break outer;
                }   
            }
            if(compare){
                output.append(first);
            }else{
                break outer;
            }
            i++;
        }
        return output.toString();
    }
}
