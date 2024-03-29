class Solution {
    public void sortColors(int[] nums) {
        int one = 0;
        int zero = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                zero++;
            }
            else if(nums[i] == 1){
                one++;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(zero>0){
                nums[i] = 0;
                zero--;
                continue;
            }
            if(one>0){
                nums[i] = 1;
                one--;
                continue;
            }
            else{
                nums[i] = 2;
            }
        }
    }
}