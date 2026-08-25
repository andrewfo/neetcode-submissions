class Solution {
    public int characterReplacement(String s, int k) {

        int max = 0;
        for(char c = 'A'; c <= 'Z'; c++){
            int left = 0;
            int count = 0;
            for(int right = 0; right < s.length(); right++){
                if(s.charAt(right) != c){
                    count++;
                }
                while(count > k){
                    if(s.charAt(left) != c){
                        count--;
                    }
                    left++;
                }
                max = Math.max(max, right - left + 1);

            }
        }
        return max;
    }
}
