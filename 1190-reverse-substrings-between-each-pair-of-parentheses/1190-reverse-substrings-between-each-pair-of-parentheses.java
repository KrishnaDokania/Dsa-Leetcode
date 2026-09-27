class Solution {
    String result;
    public String reverseParentheses(String s) {
        result=s;
        return solve(s);
    }

    String solve(String s) {
        int r = s.indexOf(')');
        if(r==-1)return result;
        int l = s.lastIndexOf('(', r);
        String left = s.substring(0, l);
        StringBuilder mid = new StringBuilder(s.substring(l + 1, r));
        String right = s.substring(r + 1);
        result=left+mid.reverse().toString()+right;
        solve(result);
        return result;
    }
}