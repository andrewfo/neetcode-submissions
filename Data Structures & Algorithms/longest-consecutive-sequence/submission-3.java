class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> startIdx = new ArrayList<>();

        for(int n : nums){
            set.add(n);
        }
        for(int i = 0; i < nums.length; i++){
            if(!set.contains(nums[i] - 1)){
                startIdx.add(i);
            }
        }
        int longest = 0;
        for(int idx : startIdx){
            int seq = 0;
            while(set.contains(nums[idx] + 1)){
                seq++;
                nums[idx]++;
            }
            longest = Math.max(longest, seq);
        }
        return longest+1;

    }
}
