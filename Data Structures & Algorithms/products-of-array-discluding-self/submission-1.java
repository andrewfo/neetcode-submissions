class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] result = new int[nums.length];
        int product = 1;
        prefix[0] = 1;
        suffix[nums.length-1] = 1;

        for(int i = 1; i < nums.length; i++){
            product *= nums[i-1];
            prefix[i] = product;
        }
        product = 1;
        for(int i = nums.length-2; i >= 0; i--){
            product *= nums[i+1];
            suffix[i] = product;
        }

        for(int i = 0; i < nums.length; i++){
            result[i] = prefix[i] * suffix[i];
        }
        return result;

    }
}  
