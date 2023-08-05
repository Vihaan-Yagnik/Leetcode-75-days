class Solution {
    public String mergeAlternately(String word1, String word2) {
     String dummy = "";
     int j = 0;
     for(int i = 0 ; i < word2.length() + word1.length() ; i++){
         try{
         dummy = dummy + word1.charAt(i);}
         catch(Exception e){

         }
         try{
         dummy = dummy + word2.charAt(j);
         j++;}
         catch(Exception e){

         }
     }return dummy;
 }   
}
