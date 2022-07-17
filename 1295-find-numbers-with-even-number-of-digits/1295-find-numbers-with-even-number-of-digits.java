class Solution {
    public int findNumbers(int[] nums) {
        int counter = 0;
        int check = 0;
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            counter = nums[i];
            while(counter!=0){
                counter = counter/10;
                check++; 
            }
            if(check%2 == 0){
                ans+=1;
            }
            check= 0;
        }
        return ans;   
    }
}