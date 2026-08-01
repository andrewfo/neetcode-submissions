class Solution {
    public int trap(int[] height) {
        int[] prefix = new int[height.length];
        int[] suffix = new int[height.length];
        int trapped = 0;
        prefix[0] = -1;
        suffix[height.length - 1] = -1;

        for(int i = 1; i < height.length; i++){
            prefix[i] = Math.max(prefix[i-1], height[i-1]);
        }
        for(int i = height.length-2; i >= 0; i--){
            suffix[i] = Math.max(suffix[i+1], height[i+1]);

        }

        for(int i = 1; i < height.length -1; i++){
            int water = Math.min(prefix[i], suffix[i]) - height[i];
            if(water > 0){
                trapped += water;
            }
        }
        return trapped;
    }
}
