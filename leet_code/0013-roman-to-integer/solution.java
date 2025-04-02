class Solution {
    public int romanToInt(String s) {
        int length = s.length();
        int value = 0;
        for(int i=0;i<length;i++){
            char c = s.charAt(i);
            if(c == 'I'){
                if(i < length-1 && s.charAt(i+1) == 'V'){
                    value = value + 4;
                    i++;
                }else if(i < length-1 && s.charAt(i+1) == 'X'){
                    value = value + 9;
                    i++;
                }else {
                    value = value + 1;
                }
            }else if(c == 'X'){
                if(i < length-1 && s.charAt(i+1) == 'L'){
                    value = value + 40;
                    i++;
                }else if(i < length-1 && s.charAt(i+1) == 'C'){
                    value = value + 90;
                    i++;
                }else{
                    value = value + 10;
                }
            }else if(c == 'C'){
                if(i < length-1 && s.charAt(i+1) == 'D'){
                    value = value + 400;
                    i++;
                }else if(i < length-1 && s.charAt(i+1) == 'M'){
                    value = value + 900;
                    i++;
                }else{
                    value = value + 100;
                }
            }else if(c == 'V'){
                value = value + 5;
            }else if(c == 'L'){
                value = value + 50;
            }else if(c == 'D'){
                value = value + 500;
            }else if(c == 'M'){
                value = value + 1000;
            }
        }
        return value;
    }
}
