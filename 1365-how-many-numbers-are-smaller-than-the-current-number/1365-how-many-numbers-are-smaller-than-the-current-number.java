class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] ans = new int[nums.length];
        Arrays.fill(ans, 0);
        for(int i=0; i<nums.length; i++){
            for(int j =0; j<nums.length; j++){
                if(nums[j]<nums[i]){
                    ans[i]+=1;
                }
            }
        }
        return ans;
    }
}