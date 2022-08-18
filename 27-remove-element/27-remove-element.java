class Solution {
    public int removeElement(int[] nums, int val) {
        int counter = 0;
        int temp = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == val){
               nums[i] = -1;
            }
        }
        Arrays.sort(nums);
        int p1 = 0;
        int p2 = nums.length -1;
        while(p1<p2){
            temp = nums[p2];
            nums[p2] = nums[p1];
            nums[p1] = temp;
            p1++;
            p2--;
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]!= -1){
                counter++;
            }
        }
        return counter;
    }
}