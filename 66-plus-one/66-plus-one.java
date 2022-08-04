class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length; 
        int c = 1;
        for(int i= len-1; i>=0; i--){
            int n = digits[i];
            n = n+c;
            c = n/10;
            n = n%10;
            digits[i] = n;
        }
        if(c == 0){
            return digits;
        }
        int [] ans = new int[len+1];
        for(int i = len-1; i>=0; i--){
            ans[i+1] = digits[i];
        }
        ans[0] = 1;
        return ans;
    }
}