class Solution {
    public int findNumbers(int[] nums) {
        // change the array int values to the string first
        int count =0;
        for(int num:nums){
            // change into string and count the length
           String s = String.valueOf(num);
           int digit = s.length();
            if(digit%2==0){
                count++;
            }
        }
        return count;
        
    }
}