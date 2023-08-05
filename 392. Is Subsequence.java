class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        int j = 0;
        try{
            for(int i = 0 ; i < t.length() ; i++){
                if(s2[i] == s1[j]){
                    j++;
                }
            }
        }
        catch(Exception e){}
        if(j == s.length()){
            return true;
        }
        else
            return false;
    }
}
