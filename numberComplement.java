class Solution {
    public int findComplement(int num) {
        
        //Method 1
        // Xor with each bit individually 
        // leftshit each bit 
        // until the rightshift on num is completed to track the size of bitmask
        
        // int bit = 1; 
        // int todo = num; 
        // while(todo != 0) {
        //     num = num ^ bit; 
        //     bit = bit << 1;  
        //     todo = todo >> 1;
        // }
        // return num;
        //Method 2 
        //Construct the bitmask at once by computing the length of the num
        // length = log(num) / log(2) + 1
        // bitmask = 1 << length - 1; 
        // result = bitmask ^ num; 
        // int bit = 1; 
        // int length =  (int) (Math.log(num)/Math.log(2)) + 1;
        // bit = ( bit << length ) - 1;
        // num = num ^ bit; 
        // return num; 
 
        //Method 3 
        // Use the java supported method for obtaining 
        //the highest one bit, leftshit and substract 1 to get bitmask
        int bitmask = (Integer.highestOneBit(num) << 1) - 1;
        return num ^ bitmask;
    }
}