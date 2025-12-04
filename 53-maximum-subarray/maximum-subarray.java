class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int cM =0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            cM+=nums[i];
            if(cM>max){
                max=cM;
            }
            if(cM<0){
                cM=0;
            }
        }
        return max;
        
    }
}