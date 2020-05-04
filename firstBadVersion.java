
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
         int high = n;
         int low  = 1; 
         int mid = 0; 
         while( low < high) {
             mid = low + ((high-low)/2); 
             if(!(isBadVersion(mid))) {
                 low = mid+1;
             }
             else {
                 high = mid; 
             }
         }
       
        return low;
    }
}