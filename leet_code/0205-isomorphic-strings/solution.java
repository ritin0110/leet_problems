class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> checks1 = new HashMap<>();
        Map<Character, Character> checks2 = new HashMap<>();
        boolean output = true;
        for(int i=0;i<s.length();i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            Character found = checks1.get(sc);
            if(null == found){
                checks1.put(sc, tc);
            }else{
                if(found != tc){
                    output = false;
                    break;
                }
            }

            Character found2 = checks2.get(tc);
            if(null == found2){
                checks2.put(tc, sc);
            }else{
                if(found2 != sc){
                    output = false;
                    break;
                }
            }
        }
        return output;
    }
}
