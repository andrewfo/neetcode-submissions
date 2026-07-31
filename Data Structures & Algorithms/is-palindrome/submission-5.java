class Solution { 
    public boolean isPalindrome(String s) { 
        StringBuilder sb = new StringBuilder(); 
        for(int i = s.length()-1; i >=0; i--){ 
            char c = s.charAt(i); 
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c)); 
            } 
        } 
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
        return sb.toString().equals(cleaned); 
    } 
}
