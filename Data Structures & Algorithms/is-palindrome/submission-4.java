class Solution { 
    public boolean isPalindrome(String s) { 
        StringBuilder sb = new StringBuilder(); 
        for(int i = s.length()-1; i >=0; i--){ 
            char c = s.charAt(i); // Fix 1: Store char to use Character utility methods
            if(Character.isLetterOrDigit(c)){ // Fix 2: Use correct Character class methods
                sb.append(Character.toLowerCase(c)); // Fix 3: Lowercase using Character utility
            } 
        } 
        // Fix 4: Clean up original string the exact same way to allow structural comparison
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
        return sb.toString().equals(cleaned); // Fix 5: Use .equals() for String comparison
    } 
}
