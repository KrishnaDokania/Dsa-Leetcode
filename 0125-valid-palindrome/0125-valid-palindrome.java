class Solution {
    public boolean isPalindrome(String s) {
        String tmp = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i)))
                tmp = tmp + s.charAt(i);
        }
        String pal = "";
        for (int i = tmp.length() - 1; i >= 0; i--) {
            pal = pal + tmp.charAt(i);
        }
        if (tmp.equalsIgnoreCase(pal))
            return true;
        else
            return false;

    }
}
