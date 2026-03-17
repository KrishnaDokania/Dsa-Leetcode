class Solution {
    public int bitwiseComplement(int n) {
         int mask = (1 << (Integer.toBinaryString(n).length())) - 1;
    return n ^ mask;
    }
}