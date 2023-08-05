class Solution {
    public String reverseWords(String s) {
        String[] lol = s.trim().split("\\s+");
        String out = "";

        for(int i = lol.length - 1 ; i > 0 ; i--){
            out += lol[i] + " ";
        }
        return out + lol[0];
    }
}
