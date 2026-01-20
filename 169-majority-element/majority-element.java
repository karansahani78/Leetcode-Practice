class Solution {
    public int majorityElement(int[] nums) {
        int max=nums[0];
        Map<Integer,Integer>eC = new HashMap<>();
        for(int n:nums){
            eC.put(n,eC.getOrDefault(n,0)+1);
            if(eC.get(n)>eC.get(max)){
                max=n;
            }
        }
        return max;
        
    }
}