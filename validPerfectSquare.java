class Solution {
    public boolean isPerfectSquare(int num) {
        
        //Binary Search Method. To find out the perfectSqaure, checking for it should be enough until num/2
        if( num < 2) { return true; }
        long low = 2; 
        long mid = 0; 
        long high = num/2; 
        long perfectSquare = 0;
        
        while(low <= high ) {
            mid = low + (high-low)/2;
            perfectSquare = mid * mid; 
            if( perfectSquare < num) {
                low = mid+1;
            }
            else if(perfectSquare > num) {
                high = mid-1;
            }
            else {
                return true;
            }
        }
        return false;
        
//        //Newtons Method
//         if(num < 2) { return true; }
//         long guess = num/2;
         
//         while( guess*guess > num) {
//             guess = (guess + num/guess)/2;
//         }
//         return guess * guess == num;
        
    }
}