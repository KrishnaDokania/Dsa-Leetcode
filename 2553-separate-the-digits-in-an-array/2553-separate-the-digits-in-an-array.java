class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer>arr=new ArrayList<>();
            for(int num:nums){
                String str=String.valueOf(num);
                for(char ch:str.toCharArray()){
                    arr.add(ch-'0');
                }
            }
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}