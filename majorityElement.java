class Solution {
    public int majorityElement(int[] nums) {
        //One approach is to sort the elements and always return the n/2 element
        //Since it will always be the majority element in a sorted list.
        //Arrays.sort(nums); 
        //return nums[nums.length/2];
        int majorityElement = nums[0];  
        int count = 1;
        for(int i = 1; i < nums.length; i++) {
             if(majorityElement == nums[i]) {
                 count++;
             }
            else {
                count--;
                if(count == 0) {
                    majorityElement = nums[i];
                    count = 1;
                }
            }
        }
        return majorityElement;
        
    }
}