class Solution {
    public int[] getConcatenation(int[] nums) {
        int x = nums.length * 2;
        int[] ans = new int [x];
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[i];                  
            ans[i + nums.length] = nums[i];    
        }

        return ans;
    }
}