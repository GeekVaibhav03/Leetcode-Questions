class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2*n];
        for(int i = 0; i < n; i++)
        {
            res[2 * i] = nums[i]; // res[0] = nums[0] -- 2 res[2] = nums[1] -- 5
            res[2 * i + 1] = nums[n+i]; // res[1] = nums[3] -- 3
        }
        return res;
    }
}