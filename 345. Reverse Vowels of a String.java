class Solution {
    public String reverseVowels(String s) {
        char[] ans = s.toCharArray();
        char[] dummy = new char[300000];
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='e' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' || s.charAt(i)=='E'){
                dummy[i] = s.charAt(i);
            }
            else{
                dummy[i] = ' ';
            }
        }
        int j = s.length() - 1;
        for(int i =  0; i < s.length() ; i++){
            if(dummy[i] != ' ')
                {
                    while(dummy[j] == ' ') 
                    {j--;}
                    ans[i] = dummy[j];
                    j--;
                }
            }
            String answer = new String(ans);
        return answer;
        }
    }
