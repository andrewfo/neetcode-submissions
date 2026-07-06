class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> ans = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!ans.containsKey(nums[i])){
                ans.put(nums[i], 1);
            }else{
                ans.put(nums[i], ans.get(nums[i]) + 1);
            }
        }

        Integer[] keys = ans.keySet().toArray(new Integer[0]);
        List<Integer> numbers = new ArrayList<>();

        int count = 0;
        while(count < k){
            int max = -1;
            int maxKey = -1;
            for(int i = 0; i < keys.length; i++){
                if(numbers.contains(keys[i])) continue;
                if(ans.get(keys[i]) > max){
                    max = ans.get(keys[i]);
                    maxKey = keys[i];
                }
            }
            numbers.add(maxKey);
            count++;
        }

        int[] result = new int[k];
        for(int i = 0; i < k; i++) result[i] = numbers.get(i);
        return result;
    }
}