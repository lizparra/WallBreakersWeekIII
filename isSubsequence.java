class Solution {
    boolean isSubsequence(String s, String t) {
        if(s.length() > t.length())
            return false;
            
        int j = 0;
        for(int i = 0; i < s.length(); i++){
            while(j < t.length()){
                if(s.charAt(i) == t.charAt(j)){
                    if(i != (s.length() - 1))
                        j++;
                    
                    break;
                }
                j++;
            }
            if(j == t.length())
                return false;
        }
        
        return true;
    }
};
