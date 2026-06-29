class Solution {
    public boolean isPalindrome(int x) {
        String st = x + "";
        int l = 0;
        int r = st.length() - 1;
        while(l < r){
            if(st.charAt(l) != st.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}