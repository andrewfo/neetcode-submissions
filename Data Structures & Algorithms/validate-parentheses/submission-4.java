class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (isOpenBracket(s.charAt(i))) {
                stack.push(s.charAt(i));
            }
            if (isCloseBracket(s.charAt(i))) {
                if (stack.isEmpty()){
                    return false;
                }
                char c = stack.pop();
                if (s.charAt(i) == '}') {
                    if (c != '{')
                        return false;
                } else if (s.charAt(i) == ']') {
                    if (c != '[')
                        return false;
                } else {
                    if (c != '(')
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }
    private boolean isOpenBracket(char c) {
        if (c == '{' || c == '[' || c == '(') {
            return true;
        }
        return false;
    }
    private boolean isCloseBracket(char c) {
        if (c == '}' || c == ']' || c == ')') {
            return true;
        }
        return false;
    }
}
