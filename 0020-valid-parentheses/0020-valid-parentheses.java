import java.util.ArrayList;

class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> li = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (")]}".indexOf(ch) == -1) {
                li.add(ch);
            } else {
                if (!li.isEmpty()) {
                    char c = li.removeLast();
                    if ((c == '(' && ch != ')') ||
                       (c == '[' && ch != ']') || 
                       (c == '{' && ch != '}')) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return li.isEmpty();
    }
}
