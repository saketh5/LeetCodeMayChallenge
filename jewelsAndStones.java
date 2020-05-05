class Solution {
    public int numJewelsInStones(String J, String S) {
        //Using constant space
        int count = 0; 
        int[] data = new int[128];
        
        for(int j = 0; j < J.length(); j++){
              data[J.charAt(j) - 'A']++;
        }
        
        for( int i = 0; i < S.length(); i++) {
          count = count + data[S.charAt(i) - 'A'];
        }
       return count; 
    }
}