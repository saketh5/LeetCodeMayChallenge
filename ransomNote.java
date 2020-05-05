class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
      
        int[] data = new int[128];
        for( int i = 0; i < ransomNote.length(); i++) {
            data[ransomNote.charAt(i)]++;
        }
        for(int j = 0; j < magazine.length(); j++) { 
           data[magazine.charAt(j)]--;
        }
        
        for(int i : data) {
            if(i > 0) {
                return false;
            }
        }
     return true;
    }
}