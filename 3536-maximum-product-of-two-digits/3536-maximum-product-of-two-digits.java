class Solution {
    public int maxProduct(int n) {
        int l=String.valueOf(n).length();
         int arr[]=new int[l];
         int i=0;
        while(n>0){
            int res =n%10;
            arr[i]=res;
            n=n/10;
            i++;
        }
        Arrays.sort(arr);
        return arr[l-1]*arr[l-2];
    }
}