class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int [] out_arr = new int[n];
        Arrays.fill(out_arr, -1);
        Stack<Integer> stack = new Stack<>();
        for(int i= 0; i<n*2; i++){
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i%n]){
                out_arr[stack.pop()] = nums[i%n];
            }
            if(i<n){
                stack.push(i);
            }
        }
        return out_arr;
    }
}