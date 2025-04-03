class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<String, Character> checks1 = new HashMap<>();
        Map<Character, String> checks2 = new HashMap<>();
        String[] words = s.split(" ");
        if(pattern.length() != words.length){
            return false;
        }
        boolean output = true;
        for(int i=0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            String word = words[i];

            Character found1 = checks1.get(word);
            if(null == found1) {
                checks1.put(word, c);
            }else{
                if(found1 != c){
                    output = false;
                    break;
                }
            }

            String found2 = checks2.get(c);
            if(null == found2) {
                checks2.put(c, word);
            }else{
                if(!found2.equals(word)){
                    output = false;
                    break;
                }
            }

        }
        return output;
    }
}
