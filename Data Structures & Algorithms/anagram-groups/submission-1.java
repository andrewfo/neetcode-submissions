

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for (String str : strs) {
            int[] charCount = new int[26]; // count for each letter
            for (int j = 0; j < str.length(); j++) {
                charCount[str.charAt(j) - 'a']++;
            }

            // Convert count array to a string key
            StringBuilder keyBuilder = new StringBuilder();
            for (int count : charCount) {
                keyBuilder.append(count).append('#'); // separator avoids ambiguity
            }
            String key = keyBuilder.toString();

            // Add string to the group
            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(groups.values());
    }
}
